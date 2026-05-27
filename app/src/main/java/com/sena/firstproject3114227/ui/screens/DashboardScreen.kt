package com.sena.firstproject3114227.ui.screens

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.sena.firstproject3114227.ui.sections.dashboard.ButtonsSection
import com.sena.firstproject3114227.ui.sections.dashboard.ParametrosSection
import com.sena.firstproject3114227.ui.sections.dashboard.SaludoScreen
import com.sena.firstproject3114227.ui.sections.dashboard.StudentInfoSection
import com.sena.firstproject3114227.ui.sections.dashboard.TopSection
import com.sena.firstproject3114227.ui.sections.home.PracticaSection
import com.sena.firstproject3114227.ui.theme.skySoft

@Composable
fun DashboadScreen(modifier: Modifier = Modifier, navController: NavController, id: Int, nombre: String) {
    Surface(
        modifier = modifier
            .padding(18.dp)
            .fillMaxWidth(),
        color = skySoft,
        shape = RoundedCornerShape(24.dp),
    ) {
        Column(
            modifier = Modifier.padding(horizontal = 14.dp, vertical = 22.dp),
            verticalArrangement = Arrangement.spacedBy(18.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ){
            Text(text = "$id: $nombre")
            TopSection()
            SaludoScreen()
            ParametrosSection()
            StudentInfoSection()
            ButtonsSection(navController)
            PracticaSection()
        }
    }
}
