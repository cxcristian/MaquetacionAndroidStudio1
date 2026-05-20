package com.sena.firstproject3114227.ui.sections.paneltarea

import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
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
import com.sena.firstproject3114227.ui.theme.slateLine

@Composable
fun PanelDailyTasksSection() {
    Text(
        text = "Tareas del dia",
        fontWeight = FontWeight.Bold,
        fontSize = 14.sp,
        color = inkTitle
    )
    Column(
        modifier = Modifier.padding(top = 8.dp),
        verticalArrangement = Arrangement.spacedBy(9.dp)
    ) {
        TaskRowSection(
            title = "Estudiar Jetpack Compose",
            time = "1 hora",
            status = "Completada",
            completed = true
        )
        TaskRowSection(
            title = "Practicar layouts",
            time = "45 minutos",
            status = "Pendiente",
            completed = false
        )
        TaskRowSection(
            title = "Leer documentacion",
            time = "30 minutos",
            status = "Pendiente",
            completed = false
        )
    }
}

@Composable
fun TaskRowSection(title: String, time: String, status: String, completed: Boolean) {
    Surface(
        modifier = Modifier.fillMaxWidth(),
        shape = RoundedCornerShape(12.dp),
        color = Color.White,
        shadowElevation = 3.dp
    ) {
        Row(
            modifier = Modifier.padding(horizontal = 14.dp, vertical = 12.dp),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            Row(verticalAlignment = Alignment.CenterVertically) {
                if (completed) {
                    Surface(
                        modifier = Modifier.size(32.dp),
                        shape = CircleShape,
                        color = deepTeal
                    ) {
                        Box(contentAlignment = Alignment.Center) {
                            Image(
                                painter = painterResource(id = R.drawable.check_mark),
                                contentDescription = "",
                                modifier = Modifier.size(18.dp)
                            )
                        }
                    }
                } else {
                    Box(
                        modifier = Modifier
                            .size(32.dp)
                            .border(2.dp, deepTeal, CircleShape)
                    )
                }
                Column(modifier = Modifier.padding(start = 12.dp)) {
                    Text(
                        text = title,
                        fontWeight = FontWeight.Bold,
                        fontSize = 12.sp,
                        color = inkTitle
                    )
                    Text(
                        text = time,
                        fontSize = 11.sp,
                        color = mutedText
                    )
                }
            }
            Text(
                text = status,
                fontSize = 10.sp,
                color = if (completed) deepTeal else slateLine
            )
        }
    }
}
