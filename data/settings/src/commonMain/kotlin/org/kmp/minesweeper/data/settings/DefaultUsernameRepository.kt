package org.kmp.minesweeper.data.settings

import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.map
import org.kmp.minesweeper.data.core.storage.Storage

internal class DefaultUsernameRepository(
    private val storage: Storage,
) : UsernameRepository {

    override val username: Flow<String> = storage.getAsFlow(UsernameRepository.UsernameKey)
        .map { it.orEmpty() }

    override suspend fun updateUsername(username: String) {
        storage.writeValue(UsernameRepository.UsernameKey, username)
    }
}