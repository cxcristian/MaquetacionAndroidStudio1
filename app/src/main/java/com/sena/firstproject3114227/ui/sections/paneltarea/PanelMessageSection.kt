package com.sena.firstproject3114227.ui.sections.paneltarea

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
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
import com.sena.firstproject3114227.ui.theme.PaleYellow
import com.sena.firstproject3114227.ui.theme.SoftYellow
import com.sena.firstproject3114227.ui.theme.amberSoft
import com.sena.firstproject3114227.ui.theme.inkTitle
import com.sena.firstproject3114227.ui.theme.mutedText

@Composable
fun PanelMessageSection() {
    Surface(
        modifier = Modifier.fillMaxWidth(),
        shape = RoundedCornerShape(14.dp),
        color = PaleYellow
    ) {
        Row(
            modifier = Modifier.padding(16.dp),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.spacedBy(12.dp)
        ) {
            Surface(
                modifier = Modifier.size(42.dp),
                shape = CircleShape,
                color = androidx.compose.ui.graphics.Color(0xFFE082)
            ) {
                Image(
                    painter = painterResource(id = R.drawable.star),
                    contentDescription = "",
                    modifier = Modifier.padding(9.dp)
                )
            }
            Column() {
                Text(
                    text = "Buen trabajo",
                    fontSize = 14.sp,
                    fontWeight = FontWeight.Bold,
                    color = inkTitle
                )
                Text(
                    text = "Sigue asi para alcanzar tus metas.",
                    fontSize = 11.sp,
                    color = mutedText
                )
            }
        }
    }
}
