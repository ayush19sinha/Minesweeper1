package org.kmp.minesweeper.feature.menu

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.ui.Modifier
import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import kotlinx.serialization.Serializable

@Serializable
data object Menu

fun NavGraphBuilder.menuRoutes(
    goToPlay: () -> Unit,
    goToHighScores: () -> Unit,
    goToSettings: () -> Unit,
) {
    composable<Menu> {
        MenuScreen(
            goToPlay = goToPlay,
            goToHighScores = goToHighScores,
            goToSettings = goToSettings,
            modifier = Modifier.fillMaxSize(),
        )
    }
}