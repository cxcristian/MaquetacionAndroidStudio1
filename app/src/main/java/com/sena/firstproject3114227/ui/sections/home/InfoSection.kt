package com.sena.firstproject3114227.ui.sections.home

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import com.sena.firstproject3114227.ui.theme.deepTeal
import com.sena.firstproject3114227.ui.theme.inkTitle
import com.sena.firstproject3114227.ui.theme.softMint

@Composable
fun InfoSection() {
    Surface(
        modifier = Modifier
            .padding(8.dp),
        shape = RoundedCornerShape(22.dp),
        color = softMint
    ) {
        Column(
            modifier = Modifier
                .padding(18.dp)
                .fillMaxWidth(),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.Start
        ) {

            Column() {
                Text(text = "Nombre: ", color = inkTitle)
                Text(text = "Ana Lopez", fontWeight = FontWeight.Bold, color = deepTeal)
            }


            Column() {
                Text(text = "Correo: ", color = inkTitle)
                Text(text = "AnaLaMala@gmail.com", fontWeight = FontWeight.Bold, color = deepTeal)
            }


            Column() {
                Text(text = "Curso: ", color = inkTitle)
                Text(text = "Desarrollo Android", fontWeight = FontWeight.Bold, color = deepTeal)
            }


            Column() {
                Text(text = "Estado: ", color = inkTitle)
                Text(text = "Activo", fontWeight = FontWeight.Bold, color = deepTeal)
            }
        }
    }
}
