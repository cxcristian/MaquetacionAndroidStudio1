package com.sena.firstproject3114227.ui.sections.dashboard


import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
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
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.sena.firstproject3114227.ui.theme.Purple40

@Composable
fun ButtonsSection() {
    Row (modifier = Modifier.fillMaxWidth(),
        horizontalArrangement = Arrangement.Center)
    {
        OutlinedButton(onClick = {},
            colors = ButtonDefaults.outlinedButtonColors( contentColor = Purple40),
            border = BorderStroke(1.dp, Purple40),
            shape = RoundedCornerShape(16.dp)
            ){
            Text("Ver detalles")
        }
        Spacer(modifier = Modifier.width(60.dp))
        Button(
            onClick = {},
            colors = ButtonDefaults.buttonColors(
                containerColor = Purple40,
                contentColor = Color.White
            ),
            shape = RoundedCornerShape(16.dp)
        ) {
            Text("Continuar", fontSize = 14.sp, fontWeight = FontWeight.Bold)
        }

    }
}