package org.kmp.minesweeper.data.core

import org.koin.core.module.Module
import org.koin.dsl.module

val dataCoreModule = module {
    includes(platformModule)
}

internal expect val platformModule: Module