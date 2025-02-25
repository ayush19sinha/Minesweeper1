package org.kmp.minesweeper.data.settings

import org.kmp.minesweeper.data.core.dataCoreModule
import org.koin.core.module.dsl.bind
import org.koin.core.module.dsl.singleOf
import org.koin.dsl.module

val dataSettingsModule = module {
    includes(dataCoreModule)

    singleOf(::DefaultUsernameRepository) {
        bind<UsernameRepository>()
    }

}