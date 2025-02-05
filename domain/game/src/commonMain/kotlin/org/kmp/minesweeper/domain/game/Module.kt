package org.kmp.minesweeper.domain.game

import org.kmp.minesweeper.data.game.dataGameModule
import org.kmp.minesweeper.data.settings.dataSettingsModule
import org.koin.dsl.module

val domainGameModule = module {
    includes(dataSettingsModule, dataGameModule)
}