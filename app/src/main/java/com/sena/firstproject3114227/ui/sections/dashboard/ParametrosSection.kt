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
import com.sena.firstproject3114227.ui.theme.deepTeal
import com.sena.firstproject3114227.ui.theme.mutedText

@Composable

fun ParametrosSection(){
    Row(modifier = Modifier.fillMaxWidth()
        .padding(0.dp),
        horizontalArrangement = Arrangement.SpaceEvenly,
        verticalAlignment =  Alignment.CenterVertically) {
        Column(modifier = Modifier,
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center) {
            Image(
                painter = painterResource(id = R.drawable.checklist),
                modifier = Modifier.size(32.dp),
                contentDescription = "")
            Text(text = "12", fontSize = 12.sp,fontWeight = FontWeight.Bold, color = deepTeal)
            Text(text = "Cursos", fontSize = 12.sp, color = mutedText)
        }
        Column(modifier = Modifier,
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center) {
            Image(
                painter = painterResource(id = R.drawable.avance1),
                modifier = Modifier.size(32.dp),
                contentDescription = "")
            Text(text = "85%", fontSize = 12.sp,fontWeight = FontWeight.Bold, color = deepTeal)
            Text(text = "Progreso", fontSize = 12.sp, color = mutedText)
        }
        Column(modifier = Modifier,
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center) {
            Image(
                painter = painterResource(id = R.drawable.graduation_hat),
                modifier = Modifier.size(32.dp),
                contentDescription = "")
            Text(text = "3", fontSize = 12.sp,fontWeight = FontWeight.Bold, color = deepTeal)
            Text(text = "Logros", fontSize = 12.sp, color = mutedText)
        }
    }
}
