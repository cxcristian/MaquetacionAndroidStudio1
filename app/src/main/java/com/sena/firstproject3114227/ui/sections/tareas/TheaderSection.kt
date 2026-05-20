package com.sena.firstproject3114227.ui.sections.tareas

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.sena.firstproject3114227.R

@Composable
fun  TheaderSection(){
    Row(modifier = Modifier.padding(5.dp)) {Column() {
        Text(text = "Mis Tareas", fontWeight = FontWeight.Bold, fontSize = 30.sp)
        Text(text = "Hoy es un buen dia para codificar ✨\uD83D\uDCBB")
    }
        Image(painter = painterResource(R.drawable.sun),
            modifier = Modifier.size(50.dp),
            contentDescription = "") }



}