package org.kmp.minesweeper

import org.kmp.minesweeper.feature.highScores.highScoresModule
import org.kmp.minesweeper.feature.menu.menuModule
import org.kmp.minesweeper.feature.play.playModule
import org.kmp.minesweeper.feature.settings.settingsModule
import org.koin.dsl.module

val appModule = module {
    includes(
        highScoresModule,
        settingsModule,
        playModule,
        menuModule,
    )
}