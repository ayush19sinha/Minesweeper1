package org.kmp.minesweeper.feature.settings

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.firstOrNull
import kotlinx.coroutines.launch
import org.kmp.minesweeper.domain.settings.GetUsernameAsFlowUseCase
import org.kmp.minesweeper.domain.settings.UpdateUsernameUseCase

internal class SettingsViewModel(
    private val getUsernameAsFlowUseCase: GetUsernameAsFlowUseCase,
    private val updateUsernameUseCase: UpdateUsernameUseCase,
) : ViewModel() {

    private val _username = MutableStateFlow("")
    val username = _username.asStateFlow()

    init {
        viewModelScope.launch {
            getUsernameAsFlowUseCase().firstOrNull()?.let {
                _username.value = it
            }
        }
    }

    fun setUsername(username: String) {
        _username.value = username
    }

    fun save() {
        viewModelScope.launch {
            updateUsernameUseCase(_username.value)
        }
    }

}