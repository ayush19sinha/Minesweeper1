package org.kmp.minesweeper.data.game

import org.kmp.minesweeper.data.core.dataCoreModule
import org.koin.dsl.module

val dataGameModule = module {
    includes(dataCoreModule)
}