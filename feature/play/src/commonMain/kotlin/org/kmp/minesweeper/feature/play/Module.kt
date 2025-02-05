package org.kmp.minesweeper.feature.play

import org.kmp.minesweeper.domain.game.domainGameModule
import org.koin.dsl.module

val playModule = module {
    includes(domainGameModule)
}