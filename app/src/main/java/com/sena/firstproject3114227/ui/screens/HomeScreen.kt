package com.sena.firstproject3114227.ui.screens

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.ui.unit.dp
import com.sena.firstproject3114227.ui.theme.creamBackground
import com.sena.firstproject3114227.ui.sections.home.ButtonsSection
import com.sena.firstproject3114227.ui.sections.home.InfoSection
import com.sena.firstproject3114227.ui.sections.home.PracticaSection
import com.sena.firstproject3114227.ui.sections.home.ProfileSection
import com.sena.firstproject3114227.ui.sections.home.WelcomeSection

@Composable

fun HomeScreen(modifier: Modifier = Modifier) {
    Surface(modifier = modifier
        .padding(22.dp),
        color = creamBackground,
        shape = RoundedCornerShape(22.dp)
    ) {
        Column(modifier = Modifier,
            verticalArrangement = Arrangement.spacedBy(18.dp),
            horizontalAlignment = Alignment.CenterHorizontally
            ) {



        Row(modifier = Modifier) { WelcomeSection() }
        Row(modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.Center,
            verticalAlignment = Alignment.CenterVertically) { ProfileSection() }
        Row(modifier = Modifier) { InfoSection() }
        ButtonsSection()
            PracticaSection()
        }


    }
}
