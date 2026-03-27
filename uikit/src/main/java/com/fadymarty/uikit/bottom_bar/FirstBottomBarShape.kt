package com.fadymarty.uikit.bottom_bar

import androidx.compose.ui.geometry.Size
import androidx.compose.ui.graphics.Matrix
import androidx.compose.ui.graphics.Outline
import androidx.compose.ui.graphics.Path
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.graphics.vector.PathParser
import androidx.compose.ui.unit.Density
import androidx.compose.ui.unit.LayoutDirection

class FirstBottomBarShape : Shape {

    override fun createOutline(
        size: Size,
        layoutDirection: LayoutDirection,
        density: Density,
    ): Outline {
        val scaleMatrix = Matrix()
        val path = PathParser().parsePathString(PATH_DATA).toPath()
        val rectPath = path.getBounds()
        scaleMatrix.scale(
            size.width / rectPath.width,
            size.height / rectPath.height
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

class SecondBottomBarShape : Shape {

    override fun createOutline(
        size: Size,
        layoutDirection: LayoutDirection,
        density: Density,
    ): Outline {
        val scaleMatrix = Matrix()
        val firstPath = PathParser().parsePathString(FIRST_PATH_DATA).toPath()
        val secondPath = PathParser().parsePathString(SECOND_PATH_DATA).toPath()
        scaleMatrix.scale(
            size.width / 375f,
            size.height / 108f
        )
        firstPath.transform(scaleMatrix)
        secondPath.transform(scaleMatrix)
        val combinedPath = Path().apply {
            addPath(firstPath)
            addPath(secondPath)
        }
        return Outline.Generic(combinedPath)
    }

    companion object {
        private const val FIRST_PATH_DATA =
            "M110.033 28.0039C142.93 28.0039 155.796 13.5471 164.121 8.0647C172.446 2.58228 180.067 0 186.591 0C193.115 0 202.486 3.17407 209.138 8.0647C215.791 12.9553 229.846 28 263.033 28C263.196 41.9092 263.033 96 263.033 96H110C110 96 110.033 40.5001 110.033 28.0039Z"
        private const val SECOND_PATH_DATA =
            "M375 98C375 103.523 370.523 108 365 108L10 108C4.47715 108 5.72819e-06 103.523 5.24537e-06 98.0001L0 38C-4.82823e-07 32.4772 4.47715 28 10 28L365 28C370.523 28 375 32.4772 375 38V98Z"
    }
}