package presentation.base

import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.cancel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow

abstract class BaseViewModel {
    val viewModelScope = CoroutineScope(Dispatchers.IO)
    fun onCleared() {
        viewModelScope.cancel()
    }
}