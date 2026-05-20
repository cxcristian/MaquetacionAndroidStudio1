package com.sena.firstproject3114227.ui.sections.paneltarea

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Surface
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
import com.sena.firstproject3114227.ui.theme.mutedText
import com.sena.firstproject3114227.ui.theme.skySoft

@Composable
fun PanelHeaderSection() {
    Row(
        modifier = Modifier.fillMaxWidth(),
        horizontalArrangement = Arrangement.SpaceBetween,
        verticalAlignment = Alignment.CenterVertically
    ) {
        Column() {
            Text(
                text = "Panel de Tareas",
                fontSize = 26.sp,
                fontWeight = FontWeight.Bold,
                color = inkTitle
            )
            Text(
                text = "Organiza tu dia de forma simple",
                fontSize = 13.sp,
                color = mutedText
            )
        }
        Surface(
            modifier = Modifier.size(42.dp),
            shape = CircleShape,
            color = skySoft
        ) {
            Box(
                modifier = Modifier.padding(10.dp),
                contentAlignment = Alignment.Center
            ) {
                Image(
                    painter = painterResource(id = R.drawable.bell),
                    contentDescription = "",
                    modifier = Modifier.size(22.dp)
                )
            }
        }
    }
}
