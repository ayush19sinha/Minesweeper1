package org.kmp.minesweeper.data.settings

import org.kmp.minesweeper.data.core.dataCoreModule
import org.koin.dsl.module

val dataSettingsModule = module {
    includes(dataCoreModule)
}