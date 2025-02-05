package org.kmp.minesweeper.feature.menu

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.widthIn
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import org.kmp.minesweeper.ui.core.LocalDimension
import org.kmp.minesweeper.ui.core.LocalPadding

@Composable
internal fun MenuScreen(
    goToPlay: () -> Unit,
    goToHighScores: () -> Unit,
    goToSettings: () -> Unit,
    modifier: Modifier = Modifier,
) {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center,
        modifier = modifier,
    ) {
        val buttonModifier = Modifier
            .padding(horizontal = LocalPadding.current.normal)
            .widthIn(max = LocalDimension.current.maxWidthSmall)
            .fillMaxWidth()
        MenuButton(
            text = "Play",
            onClick = goToPlay,
            modifier = buttonModifier,
        )
        MenuButton(
            text = "HighScores",
            onClick = goToHighScores,
            modifier = buttonModifier,
        )
        MenuButton(
            text = "Settings",
            onClick = goToSettings,
            modifier = buttonModifier,
        )
    }
}