package org.kmp.minesweeper.domain.settings

import org.kmp.minesweeper.data.settings.dataSettingsModule
import org.koin.dsl.module

val domainSettingsModule = module {
    includes(dataSettingsModule)
}