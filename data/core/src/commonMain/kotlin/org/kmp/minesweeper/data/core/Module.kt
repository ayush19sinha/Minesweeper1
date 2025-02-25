package org.kmp.minesweeper.data.core

import org.kmp.minesweeper.data.core.storage.Storage
import org.koin.core.module.Module
import org.koin.core.module.dsl.singleOf
import org.koin.dsl.module
import org.kmp.minesweeper.data.core.storage.DataStoreStorage
import org.koin.core.module.dsl.bind

val dataCoreModule = module {
    includes(platformModule)
    singleOf(::DataStoreStorage) {
        bind<Storage>()
    }
}

internal expect val platformModule: Module