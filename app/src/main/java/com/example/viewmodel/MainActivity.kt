package com.example.viewmodel

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.ui.Modifier
import com.example.viewmodel.ui.theme.ViewModelTheme
import com.example.viewmodel.views.MainGui
import com.example.viewmodel.views.MainGui_VM

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val mainGui_VM: MainGui_VM = MainGui_VM()

        enableEdgeToEdge()
        setContent {
            ViewModelTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    MainGui(mainGui_VM = mainGui_VM , modifier = Modifier.padding(innerPadding))
                }
            }
        }
    }
}

