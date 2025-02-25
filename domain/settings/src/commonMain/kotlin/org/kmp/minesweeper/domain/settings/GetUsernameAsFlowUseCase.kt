package org.kmp.minesweeper.domain.settings

import kotlinx.coroutines.flow.Flow
import org.kmp.minesweeper.data.settings.UsernameRepository

class GetUsernameAsFlowUseCase(
    private val usernameRepository: UsernameRepository,
) {

    operator fun invoke(): Flow<String> = usernameRepository.username

}