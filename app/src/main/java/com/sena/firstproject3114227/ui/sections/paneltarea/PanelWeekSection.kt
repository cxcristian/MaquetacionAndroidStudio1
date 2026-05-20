package com.sena.firstproject3114227.ui.sections.paneltarea

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.sena.firstproject3114227.ui.theme.deepTeal
import com.sena.firstproject3114227.ui.theme.inkTitle
import com.sena.firstproject3114227.ui.theme.slateLine

@Composable
fun PanelWeekSection() {
    Row(
        modifier = Modifier.fillMaxWidth(),
        horizontalArrangement = Arrangement.spacedBy(10.dp, Alignment.CenterHorizontally),
        verticalAlignment = Alignment.CenterVertically
    ) {
        DayBox(day = "LUN", number = "12", selected = false)
        DayBox(day = "MAR", number = "13", selected = true)
        DayBox(day = "MIE", number = "14", selected = false)
        DayBox(day = "JUE", number = "15", selected = false)
        DayBox(day = "VIE", number = "16", selected = false)
    }
}

@Composable
fun DayBox(day: String, number: String, selected: Boolean) {
    Surface(
        shape = RoundedCornerShape(10.dp),
        color =  deepTeal

    ) {
        Column(
            modifier = Modifier.padding(horizontal = 13.dp, vertical = 11.dp),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {
            Text(
                text = day,
                fontSize = 11.sp,
                color = if (selected) Color.White else slateLine
            )
            Text(
                text = number,
                fontSize = 18.sp,
                fontWeight = FontWeight.Bold,
                color = if (selected) Color.White else inkTitle
            )
        }
    }
}
