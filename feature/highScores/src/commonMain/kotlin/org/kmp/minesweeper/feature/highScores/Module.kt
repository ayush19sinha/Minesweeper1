package org.kmp.minesweeper.feature.highScores

import org.kmp.minesweeper.domain.game.domainGameModule
import org.koin.core.module.dsl.viewModelOf
import org.koin.dsl.module

val highScoresModule = module {
    includes(domainGameModule)
    viewModelOf(::HighScoresViewModel)
}