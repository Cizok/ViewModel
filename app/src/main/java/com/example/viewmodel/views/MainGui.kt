package com.example.viewmodel.views

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.livedata.observeAsState
import androidx.compose.ui.Modifier // Certifique-se de importar este

@Composable
fun MainGui(mainGui_VM: MainGui_VM, modifier: Modifier = Modifier) {
    val contadorValueState: Int by mainGui_VM.contador.observeAsState(0)

    Scaffold { padding ->
        Column(modifier = modifier.padding(padding)) { // Utilize o modifier aqui
            Text(text = "=====================================")

            Text(text = "=====================================")

            Text(text = "=====================================")

            TextField(value = contadorValueState.toString(),
                onValueChange = { })

            Button(onClick = { mainGui_VM.incrementarContador() }) {
                Text(text = contadorValueState.toString())
            }
        }
    }
}