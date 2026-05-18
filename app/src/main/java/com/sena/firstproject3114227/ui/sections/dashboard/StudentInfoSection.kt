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
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.sena.firstproject3114227.R
@Composable
fun StudentInfoSection() {
    Column(
        modifier = Modifier.fillMaxWidth(),
        verticalArrangement = Arrangement.spacedBy(12.dp) // espacio uniforme entre filas
    ) {
        Row(
            modifier = Modifier.fillMaxWidth(),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            Row(verticalAlignment = Alignment.CenterVertically) {
                Image(
                    painter = painterResource(id = R.drawable.graduation_hat),
                    modifier = Modifier.size(30.dp),
                    contentDescription = null
                )
                Column(modifier = Modifier.padding(start = 8.dp)) {
                    Text(text = "Curso actual:", fontSize = 13.sp)
                    Text(text = "Desarrollo Android con Compose", fontSize = 13.sp)
                }
            }
            Image(
                painter = painterResource(id = R.drawable.avance1),
                modifier = Modifier.size(20.dp),
                contentDescription = null
            )
        }
        Row(
            modifier = Modifier.fillMaxWidth(),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            Row(verticalAlignment = Alignment.CenterVertically) {
                Image(
                    painter = painterResource(id = R.drawable.calendar),
                    modifier = Modifier.size(30.dp),
                    contentDescription = null
                )
                Column(modifier = Modifier.padding(start = 8.dp)) {
                    Text(text = "Próxima clase:", fontSize = 13.sp)
                    Text(text = "Martes 21 de mayo - 10:00 AM", fontSize = 13.sp)
                }
            }
            Image(
                painter = painterResource(id = R.drawable.avance1),
                modifier = Modifier.size(20.dp),
                contentDescription = null
            )
        }
        Row(
            modifier = Modifier.fillMaxWidth(),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            Row(verticalAlignment = Alignment.CenterVertically) {
                Image(
                    painter = painterResource(id = R.drawable.diagram),
                    modifier = Modifier.size(30.dp),
                    contentDescription = null
                )
                Column(modifier = Modifier.padding(start = 8.dp)) {
                    Text(text = "Calificación actual:", fontSize = 13.sp)
                    Text(text = "9.2 / 10", fontSize = 13.sp)
                }
            }
            Image(
                painter = painterResource(id = R.drawable.avance1),
                modifier = Modifier.size(20.dp),
                contentDescription = null
            )
        }
    }
    }