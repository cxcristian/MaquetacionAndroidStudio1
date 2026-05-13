package com.sena.firstproject3114227.ui.sections.home

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import com.sena.firstproject3114227.ui.theme.lightBlue
import com.sena.firstproject3114227.ui.theme.softGray

@Composable
fun InfoSection() {
    Surface(modifier = Modifier
        .padding(10.dp),
        shape = RoundedCornerShape(16.dp),
        color = softGray
    ){
    Column(
        modifier = Modifier
            .padding((15.dp))
            .fillMaxWidth(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.Start
    ) {

        Column() {
            Text(text = "Nombre: ")
            Text(text = "Ana López", fontWeight = FontWeight.Bold)
        }


        Column() {
            Text(text = "Correo: ")
            Text(text = "AnaLaMala@gmail.com", fontWeight = FontWeight.Bold)
        }


        Column() {
            Text(text = "Curso: ")
            Text(text = "Desarrollo Android", fontWeight = FontWeight.Bold)
        }


        Column() {
            Text(text = "Estado: ")
            Text(text = "Activo", fontWeight = FontWeight.Bold, color = Color.Green)
        }
    }
}
}