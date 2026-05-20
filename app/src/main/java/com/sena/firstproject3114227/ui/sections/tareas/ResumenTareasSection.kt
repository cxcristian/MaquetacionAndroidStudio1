package com.sena.firstproject3114227.ui.sections.tareas

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.sena.firstproject3114227.R

@Composable

fun ResumenTareasSection(){
    Text(text = "Resumen", fontWeight = FontWeight.Bold, fontSize = 15.sp)
    Row(modifier = Modifier.fillMaxWidth(),
        horizontalArrangement = Arrangement.SpaceEvenly,
        verticalAlignment = Alignment.CenterVertically) {
        Column(modifier = Modifier,
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center,
            ) {
            Image(painter = painterResource(R.drawable.number_8),
                modifier = Modifier.size(40.dp),
                contentDescription = "",
                contentScale = ContentScale.Fit)
            Text(text = "Pendiente")
        }
        Column(modifier = Modifier,
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center) {
            Image(painter = painterResource(R.drawable.number_3),
                modifier = Modifier.size(40.dp),
                contentDescription = "",
                contentScale = ContentScale.Fit)
            Text(text = "Completadas")
        }
        Column(modifier = Modifier,
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center) {
            Image(painter = painterResource(R.drawable.two),
                modifier = Modifier.size(40.dp),
                contentDescription = "",
                contentScale = ContentScale.Fit)
            Text(text = "En progreso")
        }

    }
}