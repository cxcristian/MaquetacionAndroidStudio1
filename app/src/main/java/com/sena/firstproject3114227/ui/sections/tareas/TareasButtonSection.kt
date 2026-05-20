package com.sena.firstproject3114227.ui.sections.tareas

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.sena.firstproject3114227.R
import com.sena.firstproject3114227.ui.theme.Purple40

@Composable

fun TareasButtonSection(){

    Row (modifier = Modifier.fillMaxWidth(),
        horizontalArrangement = Arrangement.Center)
    {
        OutlinedButton(
            onClick = {},
            colors = ButtonDefaults.outlinedButtonColors(contentColor = Purple40),
            border = BorderStroke(1.dp, Purple40),
            shape = RoundedCornerShape(5.dp)
        ) {
            Row(verticalAlignment = Alignment.CenterVertically) {
                Image(
                    painter = painterResource(R.drawable.delete),
                    contentDescription = "",
                    modifier = Modifier.size(20.dp) // un poco más grande que 10dp
                )
                Spacer(modifier = Modifier.width(8.dp)) // espacio entre icono y texto
                Text(
                    text = "Eliminar Completadas",
                    fontSize = 10.sp,
                    fontWeight = FontWeight.Bold
                )
            }
        }
        Spacer(modifier = Modifier.width(20.dp))
        Button(
            onClick = {},
            colors = ButtonDefaults.buttonColors(
                containerColor = Purple40,
                contentColor = Color.White
            ),
            shape = RoundedCornerShape(5.dp)
        ) {
            Row(verticalAlignment = Alignment.CenterVertically) {
               Text(text="+", fontSize = 25.sp, color = Color.White, fontWeight = FontWeight.Bold)
                Spacer(modifier = Modifier.width(8.dp))
                Text(
                    text = " Nueva Tarea",
                    fontSize = 10.sp,
                    fontWeight = FontWeight.Bold
                )
            }
        }

    }

}