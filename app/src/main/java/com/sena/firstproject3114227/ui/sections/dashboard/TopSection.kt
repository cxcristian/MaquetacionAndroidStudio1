package com.sena.firstproject3114227.ui.sections.dashboard

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
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
import com.sena.firstproject3114227.ui.theme.inkTitle

@Composable
fun TopSection(){
    Row (modifier = Modifier
        .fillMaxWidth()
        .padding(12.dp),
        horizontalArrangement = Arrangement.SpaceBetween,
        verticalAlignment = Alignment.CenterVertically


    ) {
        //icono 1
        Image(
            painter = painterResource(id = R.drawable.calendar),
            modifier = Modifier.size(38.dp),
            contentDescription = ""
        )
        //texto
        Text( text = "Dashboard Estudiantil",
            fontSize = 20.sp,
            fontWeight = FontWeight.Bold,
            color = inkTitle
        )
        //icono 2
        Image(
            painter = painterResource(id = R.drawable.usuario),
            modifier = Modifier.size(42.dp),
            contentDescription = ""
        )
        }
}
