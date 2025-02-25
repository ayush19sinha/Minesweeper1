package org.kmp.minesweeper.feature.settings

import org.kmp.minesweeper.domain.settings.domainSettingsModule
import org.koin.core.module.dsl.viewModelOf
import org.koin.dsl.module

val settingsModule = module {
    includes(domainSettingsModule)
    viewModelOf(::SettingsViewModel)
}