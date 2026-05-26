package com.sena.firstproject3114227.ui.screens

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.sena.firstproject3114227.ui.sections.tareas.BigBoxImageSection
import com.sena.firstproject3114227.ui.sections.tareas.ProximaTareaSection
import com.sena.firstproject3114227.ui.sections.tareas.ResumenTareasSection
import com.sena.firstproject3114227.ui.sections.tareas.TareasButtonSection
import com.sena.firstproject3114227.ui.sections.tareas.TheaderSection
import com.sena.firstproject3114227.ui.theme.creamBackground

@Composable

fun TareaScreen(modifier: Modifier = Modifier, navController: NavController){
    Surface(modifier = Modifier
        .fillMaxSize(),
        color = creamBackground,
        shape = RoundedCornerShape(0.dp))
    { Column(modifier = Modifier.padding(24.dp)){
        TheaderSection()
        Spacer(modifier = Modifier.fillMaxWidth()
            .height(18.dp))
        BigBoxImageSection()
        Spacer(modifier = Modifier.fillMaxWidth()
            .height(18.dp))
        ResumenTareasSection()
        Spacer(modifier = Modifier.fillMaxWidth()
            .height(18.dp))
        ProximaTareaSection()
        Spacer(modifier = Modifier.fillMaxWidth()
            .height(18.dp))
        TareasButtonSection()
    } }
}
