package com.sena.firstproject3114227.ui.sections.tareas

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.sena.firstproject3114227.R

@Composable

fun ProximaTareaSection(){
    Text(text = "Proxima Tarea", fontWeight = FontWeight.Bold, fontSize = 15.sp)
    Row(modifier = Modifier.fillMaxWidth().padding(vertical = 5.dp),
        verticalAlignment = Alignment.CenterVertically,
       ) {
        Box(
            modifier = Modifier
                .size(35.dp)
                .background(Color.Cyan, shape = CircleShape),
            contentAlignment = Alignment.Center
        ) {
            Image(
                painter = painterResource(R.drawable.code),
                contentDescription = "",
                modifier = Modifier.size(20.dp),
                contentScale = ContentScale.Fit
            )
        }
        Row(modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically) {
            Column( modifier = Modifier
                .padding(start = 16.dp)) {
            Text(text = "Estudiar Jetpack Compose", fontWeight = FontWeight.Bold, fontSize = 12.sp)
            Text(text = "Repasar layouts basicos", fontSize = 10.sp)//🔵 🟢 🟠
        }
            Text(text =  " 1 h \uD83D\uDD35", fontSize = 8.sp)
        }
    }
    Spacer(modifier = Modifier.height(1.dp).fillMaxWidth())
    Row(modifier = Modifier.fillMaxWidth().padding(vertical = 5.dp),
        verticalAlignment = Alignment.CenterVertically,
        ) {
        Box(
            modifier = Modifier
                .size(35.dp)
                .background(Color.Green, shape = CircleShape),
            contentAlignment = Alignment.Center
        ) {
            Image(
                painter = painterResource(R.drawable.open_book),
                contentDescription = "",
                modifier = Modifier.size(20.dp),
                contentScale = ContentScale.Fit
            )
        }
        Row(modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically) {
            Column( modifier = Modifier
                .padding(start = 16.dp)) {
            Text(text = "Leer documentacion", fontWeight = FontWeight.Bold, fontSize = 12.sp)
            Text(text = "Column, Row y Box", fontSize = 10.sp)
        }
            Text(text =  " 30 mn \uD83D\uDFE2", fontSize = 8.sp)
        }
    }

    Spacer(modifier = Modifier.height(1.dp).fillMaxWidth())

    Row(modifier = Modifier.fillMaxWidth().padding(vertical = 5.dp),
        verticalAlignment = Alignment.CenterVertically,
        ) {
        Box(
            modifier = Modifier
                .size(35.dp)
                .background(Color.Yellow, shape = CircleShape),
            contentAlignment = Alignment.Center
        ) {
            Image(
                painter = painterResource(R.drawable.llaves_code),
                contentDescription = "",
                modifier = Modifier.size(20.dp),
                contentScale = ContentScale.Fit
            )
        }
        Row(modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically) {
            Column( modifier = Modifier
            .padding(start = 16.dp)) {
            Text(text = "Practicar UI", fontWeight = FontWeight.Bold, fontSize = 12.sp)
            Text(text = "Crear 3 pantallas distintas", fontSize = 10.sp)
        }
            Text(text =  " 45 mn \uD83D\uDFE0", fontSize = 8.sp)
        }
    }
}