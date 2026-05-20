package com.sena.firstproject3114227.ui.sections.dashboard

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
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.sena.firstproject3114227.R
import com.sena.firstproject3114227.ui.theme.deepTeal
import com.sena.firstproject3114227.ui.theme.mutedText

@Composable
fun SaludoScreen(){
    Column(modifier = Modifier.fillMaxWidth(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally) {
        Row () {
            Text( text = "Dashboard Estudiantil",
                fontSize = 25.sp,
                fontWeight = FontWeight.Bold,
                color = deepTeal)
            Image(
                painter = painterResource(id = R.drawable.check_mark),
                modifier = Modifier.size(28.dp),
                contentDescription = "")
        }
        Text( text = "Aqui tienes un resumen, de tu progreso",
            fontSize = 15.sp,
            color = mutedText)

    }
}
