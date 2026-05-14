package com.sena.firstproject3114227.ui.sections.dashboard

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.sena.firstproject3114227.R

@Composable

fun ParametrosSection(){
    Row(modifier = Modifier.fillMaxWidth()
        .padding(10.dp),
        horizontalArrangement = Arrangement.SpaceEvenly,
        verticalAlignment =  Alignment.CenterVertically) {
        Column(modifier = Modifier,
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center) {
            Image(
                painter = painterResource(id = R.drawable.open_book),
                modifier = Modifier.size(30.dp),
                contentDescription = "")
            Text(text = "12", fontSize = 12.sp,fontWeight = FontWeight.Bold)
            Text(text = "Cursos", fontSize = 12.sp)
        }
        Column(modifier = Modifier,
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center) {
            Image(
                painter = painterResource(id = R.drawable.check_mark),
                modifier = Modifier.size(30.dp),
                contentDescription = "")
            Text(text = "85%", fontSize = 12.sp,fontWeight = FontWeight.Bold)
            Text(text = "Progreso", fontSize = 12.sp)
        }
        Column(modifier = Modifier,
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center) {
            Image(
                painter = painterResource(id = R.drawable.star),
                modifier = Modifier.size(30.dp),
                contentDescription = "")
            Text(text = "3", fontSize = 12.sp,fontWeight = FontWeight.Bold)
            Text(text = "Logros", fontSize = 12.sp)
        }
    }
}