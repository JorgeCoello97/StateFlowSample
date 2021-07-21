package com.jorch.stateflowsample

import androidx.lifecycle.ViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow

class MainViewModel: ViewModel() {
    private val _count = MutableStateFlow(0)
    val count: StateFlow<Int> get() = _count

    fun incrementCount(){
        _count.value = _count.value.plus(1)
    }
}