package com.example.praktikum5.ui.theme

import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier

@Composable
fun FormDataDiri(modifier : Modifier){
    // variabel-variabel untuk mengingat nilai masukan dari keyboard
    var textName by remember{ mutableStateOf(value = "")}
    var textAlamat by remember{ mutableStateOf(value = "")}
    var textJK by remember{ mutableStateOf(value = "")}
    val gender:List<String> = listOf("Laki-laki", "Perempuan")

}