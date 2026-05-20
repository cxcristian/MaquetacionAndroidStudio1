package com.sena.firstproject3114227.ui.sections.home

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.sena.firstproject3114227.ui.theme.inkTitle
import com.sena.firstproject3114227.ui.theme.mutedText

@Composable

fun WelcomeSection(){

    Column(
        modifier = Modifier
            .fillMaxWidth(),
        verticalArrangement = Arrangement.spacedBy(5.dp),
        horizontalAlignment = Alignment.CenterHorizontally

    ) {
        Text(
            text = "Mi perfil",
            fontSize = 35.sp,
            fontWeight = FontWeight.Bold,
            color = inkTitle

            )
        Text(
            text = "Jetpack Compose Basico",
            color = mutedText
        )
    }

}
