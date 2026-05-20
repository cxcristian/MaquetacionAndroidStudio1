package com.sena.firstproject3114227.ui.screens

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.sena.firstproject3114227.ui.sections.tareas.BigBoxImageSection
import com.sena.firstproject3114227.ui.sections.tareas.ProximaTareaSection
import com.sena.firstproject3114227.ui.sections.tareas.ResumenTareasSection
import com.sena.firstproject3114227.ui.sections.tareas.TareasButtonSection
import com.sena.firstproject3114227.ui.sections.tareas.TheaderSection

@Composable

fun TareaScreen(modifier: Modifier = Modifier){
    Surface(modifier = Modifier
        .fillMaxSize())
    { Column(modifier = Modifier.padding(20.dp)){
        TheaderSection()
        Spacer(modifier = Modifier.fillMaxWidth()
            .height(15.dp))
        BigBoxImageSection()
        Spacer(modifier = Modifier.fillMaxWidth()
            .height(15.dp))
        ResumenTareasSection()
        Spacer(modifier = Modifier.fillMaxWidth()
            .height(15.dp))
        ProximaTareaSection()
        Spacer(modifier = Modifier.fillMaxWidth()
            .height(15.dp))
        TareasButtonSection()
    } }
}