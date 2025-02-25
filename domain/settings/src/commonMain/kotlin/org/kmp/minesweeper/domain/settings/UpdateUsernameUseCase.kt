package org.kmp.minesweeper.domain.settings

import org.kmp.minesweeper.data.settings.UsernameRepository

class UpdateUsernameUseCase(
    private val usernameRepository: UsernameRepository,
) {

    suspend operator fun invoke(username: String) {
        usernameRepository.updateUsername(username)
    }

}