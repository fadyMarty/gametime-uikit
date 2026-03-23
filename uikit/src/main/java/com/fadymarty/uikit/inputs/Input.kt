package com.fadymarty.uikit.inputs

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.text.BasicTextField
import androidx.compose.foundation.text.input.InputTransformation
import androidx.compose.foundation.text.input.OutputTransformation
import androidx.compose.foundation.text.input.TextFieldLineLimits
import androidx.compose.foundation.text.input.TextFieldState
import androidx.compose.foundation.text.input.rememberTextFieldState
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.fadymarty.uikit.common.theme.GameTimeTheme

/**
 * Поле для ввода
 *
 * Дата создания: 23-03-2026
 * Автор создания: 1
 *
 * @param modifier модификатор
 * @param state состояние текстого поля
 * @param placeholder текст подсказки
 */
@Composable
fun Input(
    modifier: Modifier = Modifier,
    state: TextFieldState,
    placeholder: String? = null,
    singleLine: Boolean = true,
    inputTransformation: InputTransformation? = null,
    outputTransformation: OutputTransformation? = null,
) {
    BasicTextField(
        state = state,
        lineLimits = if (singleLine) {
            TextFieldLineLimits.SingleLine
        } else TextFieldLineLimits.MultiLine(),
        inputTransformation = inputTransformation,
        outputTransformation = outputTransformation,
        textStyle = GameTimeTheme.typography.caption2Regular.copy(
            color = GameTimeTheme.colorScheme.onBackground
        ),
        cursorBrush = SolidColor(GameTimeTheme.colorScheme.accentInactive),
        decorator = { innerTextField ->
            Column(
                modifier = modifier.fillMaxWidth()
            ) {
                Box(
                    modifier = Modifier.fillMaxWidth()
                ) {
                    if (state.text.isEmpty() && placeholder != null) {
                        Text(
                            text = placeholder,
                            style = GameTimeTheme.typography.caption2Regular
                        )
                    }
                    innerTextField()
                }
                Spacer(modifier = Modifier.height(8.dp))
                Box(
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(1.dp)
                        .background(
                            Brush.horizontalGradient(
                                colors = GameTimeTheme.colorScheme.accent
                            )
                        )
                )
            }
        }
    )
}

@Preview(showBackground = true)
@Composable
private fun InputPreview() {
    GameTimeTheme {
        Input(
            modifier = Modifier.width(263.dp),
            state = rememberTextFieldState(),
            placeholder = "Full Name"
        )
    }
}