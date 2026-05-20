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
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.sena.firstproject3114227.R
import com.sena.firstproject3114227.ui.theme.amberSoft
import com.sena.firstproject3114227.ui.theme.coralAccent
import com.sena.firstproject3114227.ui.theme.deepTeal
import com.sena.firstproject3114227.ui.theme.inkTitle
import com.sena.firstproject3114227.ui.theme.mutedText
import com.sena.firstproject3114227.ui.theme.softMint

@Composable
fun ProximaTareaSection() {
    Text(text = "Proxima Tarea", fontWeight = FontWeight.Bold, fontSize = 16.sp, color = inkTitle)
    Row(
        modifier = Modifier.fillMaxWidth().padding(vertical = 7.dp),
        verticalAlignment = Alignment.CenterVertically,
    ) {
        Box(
            modifier = Modifier
                .size(38.dp)
                .background(deepTeal, shape = CircleShape),
            contentAlignment = Alignment.Center
        ) {
            Image(
                painter = painterResource(R.drawable.llaves_code),
                contentDescription = "",
                modifier = Modifier.size(22.dp),
                contentScale = ContentScale.Fit
            )
        }
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Column(
                modifier = Modifier
                    .padding(start = 18.dp)
            ) {
                Text(text = "Estudiar Jetpack Compose", fontWeight = FontWeight.Bold, fontSize = 12.sp, color = inkTitle)
                Text(text = "Repasar layouts basicos", fontSize = 10.sp, color = mutedText)
            }
            Text(text = "1 h", fontSize = 9.sp, color = deepTeal)
        }
    }
    Spacer(modifier = Modifier.height(1.dp).fillMaxWidth())
    Row(
        modifier = Modifier.fillMaxWidth().padding(vertical = 7.dp),
        verticalAlignment = Alignment.CenterVertically,
    ) {
        Box(
            modifier = Modifier
                .size(38.dp)
                .background(softMint, shape = CircleShape),
            contentAlignment = Alignment.Center
        ) {
            Image(
                painter = painterResource(R.drawable.open_book),
                contentDescription = "",
                modifier = Modifier.size(22.dp),
                contentScale = ContentScale.Fit
            )
        }
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Column(
                modifier = Modifier
                    .padding(start = 18.dp)
            ) {
                Text(text = "Leer documentacion", fontWeight = FontWeight.Bold, fontSize = 12.sp, color = inkTitle)
                Text(text = "Column, Row y Box", fontSize = 10.sp, color = mutedText)
            }
            Text(text = "30 min", fontSize = 9.sp, color = deepTeal)
        }
    }

    Spacer(modifier = Modifier.height(1.dp).fillMaxWidth())

    Row(
        modifier = Modifier.fillMaxWidth().padding(vertical = 7.dp),
        verticalAlignment = Alignment.CenterVertically,
    ) {
        Box(
            modifier = Modifier
                .size(38.dp)
                .background(amberSoft, shape = CircleShape),
            contentAlignment = Alignment.Center
        ) {
            Image(
                painter = painterResource(R.drawable.code),
                contentDescription = "",
                modifier = Modifier.size(22.dp),
                contentScale = ContentScale.Fit
            )
        }
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Column(
                modifier = Modifier
                    .padding(start = 18.dp)
            ) {
                Text(text = "Practicar UI", fontWeight = FontWeight.Bold, fontSize = 12.sp, color = inkTitle)
                Text(text = "Crear 3 pantallas distintas", fontSize = 10.sp, color = mutedText)
            }
            Text(text = "45 min", fontSize = 9.sp, color = coralAccent)
        }
    }
}
