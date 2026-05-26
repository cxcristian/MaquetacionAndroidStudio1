package com.sena.firstproject3114227.ui.sections.paneltarea

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.sena.firstproject3114227.R
import com.sena.firstproject3114227.ui.theme.deepTeal
import com.sena.firstproject3114227.ui.theme.inkTitle
import com.sena.firstproject3114227.ui.theme.mutedText
import com.sena.firstproject3114227.ui.theme.skySoft

@Composable
fun PanelProgressSection() {
    Surface(
        modifier = Modifier.fillMaxWidth(),
        shape = RoundedCornerShape(16.dp),
        color = skySoft
    ) {
        Row(
            modifier = Modifier.padding(16.dp),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.spacedBy(14.dp)
        ) {
            Box(
                modifier = Modifier
                    .size(58.dp)
                    .background(deepTeal, CircleShape),
                contentAlignment = Alignment.Center
            ) {
                Image(
                    painter = painterResource(id = R.drawable.avance1),
                    contentDescription = "",
                    modifier = Modifier.size(34.dp)
                )
            }
            Column(modifier = Modifier.fillMaxWidth()) {
                Text(
                    text = "Progreso diario",
                    fontSize = 13.sp,
                    fontWeight = FontWeight.Bold,
                    color = inkTitle
                )
                Text(
                    text = "Tareas completadas",
                    fontSize = 12.sp,
                    color = mutedText
                )
                Row(
                    modifier = Modifier.fillMaxWidth().padding(top = 8.dp),
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Box(
                        modifier = Modifier
                            .height(9.dp)
                            .weight(1f)
                            .background(Color(0xFFD6DEE6), RoundedCornerShape(20.dp))
                    ) {
                        Box(
                            modifier = Modifier
                                .fillMaxWidth(0.6f)
                                .height(9.dp)
                                .background(deepTeal, RoundedCornerShape(20.dp))
                        )
                    }
                    Text(
                        text = "6 / 10",
                        modifier = Modifier.padding(start = 10.dp),
                        fontSize = 12.sp,
                        color = inkTitle
                    )
                }
            }
        }
    }
}
