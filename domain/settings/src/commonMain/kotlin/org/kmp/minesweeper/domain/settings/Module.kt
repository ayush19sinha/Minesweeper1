package org.kmp.minesweeper.domain.settings

import org.kmp.minesweeper.data.settings.dataSettingsModule
import org.koin.core.module.dsl.factoryOf
import org.koin.dsl.module

val domainSettingsModule = module {
    includes(dataSettingsModule)

    factoryOf(::GetUsernameAsFlowUseCase)
    factoryOf(::UpdateUsernameUseCase)

}