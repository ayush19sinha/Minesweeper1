package org.kmp.minesweeper.data.settings

import kotlinx.coroutines.flow.Flow
import org.kmp.minesweeper.data.core.storage.Storage

interface UsernameRepository {

    val username: Flow<String>

    suspend fun updateUsername(username: String)

    data object UsernameKey : Storage.Key.StringKey("username", "Anonymous")

}