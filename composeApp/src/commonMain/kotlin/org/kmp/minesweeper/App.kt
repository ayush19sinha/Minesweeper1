package org.kmp.minesweeper

import androidx.compose.material.MaterialTheme
import androidx.compose.runtime.*
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.rememberNavController
import org.jetbrains.compose.ui.tooling.preview.Preview
import org.kmp.minesweeper.feature.highScores.HighScores
import org.kmp.minesweeper.feature.highScores.highScoresRoutes
import org.kmp.minesweeper.feature.menu.Menu
import org.kmp.minesweeper.feature.menu.menuRoutes
import org.koin.compose.KoinApplication
import org.koin.core.module.Module


@Composable
@Preview
fun App(
    platformModule: Module = Module(),
) {
    KoinApplication(
        application = {
            modules(appModule, platformModule)
        }
    ) {
        MaterialTheme {
            val navController = rememberNavController()
            NavHost(
                navController = navController,
                startDestination = Menu,
            ) {
                menuRoutes(
                    goToPlay = {},
                    goToHighScores = {
                        navController.navigate(HighScores)
                    },
                    goToSettings = {},
                )
                highScoresRoutes()
            }
        }
    }
}