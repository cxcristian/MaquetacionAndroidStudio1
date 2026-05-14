package com.sena.firstproject3114227.ui.screens

import android.view.Surface
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.sena.firstproject3114227.ui.sections.dashboard.ParametrosSection
import com.sena.firstproject3114227.ui.sections.dashboard.SaludoScreen
import com.sena.firstproject3114227.ui.sections.dashboard.StudentInfoSection
import com.sena.firstproject3114227.ui.sections.dashboard.TopSection

@Composable
fun DashboadScreen(modifier: Modifier = Modifier) {
    Scaffold(modifier = modifier) { innerPadding ->
        Surface(
            modifier = Modifier
                .padding(innerPadding)
                .padding(15.dp)
                .fillMaxWidth(),

        ) {
            Column (modifier = Modifier.padding(bottom = 30.dp),
                verticalArrangement = Arrangement.spacedBy(20.dp),
                horizontalAlignment = Alignment.CenterHorizontally

            ){
                TopSection()
                SaludoScreen()
                ParametrosSection()
                StudentInfoSection()
            }

        }
    }
}