package com.example.viewmodel.views

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainGui_VM : ViewModel() {
    private val _contador: MutableLiveData<Int> = MutableLiveData(0)
    val contador: LiveData<Int> = _contador

    fun incrementarContador() {

        Log.i("MainGui_VM", "Incrementar Contador: ${_contador.value}")
        _contador.value = _contador.value?.plus(1)
    }

}