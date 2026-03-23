package com.fadymarty.uikit.bottom_bar

import androidx.compose.ui.geometry.Size
import androidx.compose.ui.graphics.Matrix
import androidx.compose.ui.graphics.Outline
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.graphics.vector.PathParser
import androidx.compose.ui.unit.Density
import androidx.compose.ui.unit.LayoutDirection


class BottomBarShape : Shape {

    override fun createOutline(
        size: Size,
        layoutDirection: LayoutDirection,
        density: Density,
    ): Outline {
        val scaleMatrix = Matrix()
        val path = PathParser().parsePathString(PATH_DATA).toPath()
        scaleMatrix.scale(
            x = size.width / 375f,
            y = size.height / 109f
        )
        path.transform(scaleMatrix)
        return Outline.Generic(path)
    }

    companion object {
        private const val PATH_DATA = "M187.558 0C194.082 0.000158368 203.453 3.17395 210.105 " +
                "8.06445C216.758 12.9552 230.813 28 264 28H375V109H0V28H111.556C144.042 27.8383 " +
                "156.81 13.5159 165.088 8.06445C173.413 2.58224 181.034 0 187.558 0Z"
    }
}