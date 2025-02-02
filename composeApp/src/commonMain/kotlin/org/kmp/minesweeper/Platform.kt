package org.kmp.minesweeper

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform