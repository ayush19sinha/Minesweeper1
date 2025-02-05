package org.kmp.minesweeper.feature.highScores

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.ui.Modifier
import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import kotlinx.serialization.Serializable
import org.koin.compose.viewmodel.koinViewModel

@Serializable
data object HighScores

fun NavGraphBuilder.highScoresRoutes() {
    composable<HighScores> {
        val viewModel: HighScoresViewModel = koinViewModel()
        HighScoresScreen(
            viewModel = viewModel,
            modifier = Modifier.fillMaxSize(),
        )
    }
}