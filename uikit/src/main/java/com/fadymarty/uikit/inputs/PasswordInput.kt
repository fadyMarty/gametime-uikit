package com.fadymarty.uikit.inputs

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.text.BasicSecureTextField
import androidx.compose.foundation.text.input.TextFieldState
import androidx.compose.foundation.text.input.TextObfuscationMode
import androidx.compose.foundation.text.input.rememberTextFieldState
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.material3.ripple
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.fadymarty.uikit.R
import com.fadymarty.uikit.common.theme.GameTimeTheme

/**
 * Поле для ввода пароля
 *
 * Дата создания: 23-03-2026
 * Автор создания: 1
 *
 * @param modifier модификатор
 * @param state состояние текстого поля
 * @param isPasswordVisible видно ли пароль
 * @param onTogglePasswordVisibility действие при нажатии на иконку изменения видимости пароля
 * @param placeholder текст подсказки
 */
@Composable
fun PasswordInput(
    modifier: Modifier = Modifier,
    state: TextFieldState,
    isPasswordVisible: Boolean,
    onTogglePasswordVisibility: () -> Unit,
    placeholder: String? = null,
) {
    BasicSecureTextField(
        state = state,
        textObfuscationMode = if (isPasswordVisible) {
            TextObfuscationMode.Visible
        } else TextObfuscationMode.Hidden,
        textStyle = GameTimeTheme.typography.caption2Regular.copy(
            color = GameTimeTheme.colorScheme.onBackground
        ),
        cursorBrush = SolidColor(GameTimeTheme.colorScheme.accentInactive),
        decorator = { innerTextField ->
            Column(
                modifier = modifier.fillMaxWidth()
            ) {
                Row(
                    modifier = Modifier.fillMaxWidth(),
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Box(
                        modifier = Modifier.weight(1f)
                    ) {
                        if (state.text.isEmpty() && placeholder != null) {
                            Text(
                                text = placeholder,
                                style = GameTimeTheme.typography.caption2Regular
                            )
                        }
                        innerTextField()
                    }
                    Icon(
                        modifier = Modifier
                            .clickable(
                                interactionSource = remember { MutableInteractionSource() },
                                indication = ripple(bounded = false),
                                onClick = onTogglePasswordVisibility
                            )
                            .padding(horizontal = 6.dp)
                            .size(12.dp, 8.dp),
                        painter = painterResource(R.drawable.ic_visibility),
                        contentDescription = null
                    )
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
        PasswordInput(
            modifier = Modifier.width(263.dp),
            state = rememberTextFieldState(),
            isPasswordVisible = false,
            onTogglePasswordVisibility = {},
            placeholder = "Full Name"
        )
    }
}