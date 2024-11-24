package com.caramel.slingshot.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

open class BaseViewModel : ViewModel() {
    // LiveData for loading state
    private val _isLoading = MutableLiveData<Boolean>()
    val isLoading: LiveData<Boolean> get() = _isLoading

    // LiveData for error state
    private val _errorMessage = MutableLiveData<String>()
    val errorMessage: LiveData<String> get() = _errorMessage

    // Function to update loading state
    protected fun setLoading(isLoading: Boolean) {
        _isLoading.value = isLoading
    }

    // Function to update error state
    protected fun setError(message: String) {
        _errorMessage.value = message
    }
}
