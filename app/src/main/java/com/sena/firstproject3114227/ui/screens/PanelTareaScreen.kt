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
import com.sena.firstproject3114227.ui.sections.paneltarea.PanelActionsSection
import com.sena.firstproject3114227.ui.sections.paneltarea.PanelDailyTasksSection
import com.sena.firstproject3114227.ui.sections.paneltarea.PanelHeaderSection
import com.sena.firstproject3114227.ui.sections.paneltarea.PanelMessageSection
import com.sena.firstproject3114227.ui.sections.paneltarea.PanelProgressSection
import com.sena.firstproject3114227.ui.sections.paneltarea.PanelWeekSection
import com.sena.firstproject3114227.ui.theme.creamBackground

@Composable
fun PanelTareaScreen(modifier: Modifier = Modifier) {
    Surface(
        modifier = modifier
            .fillMaxSize()
            .padding(14.dp),

        shape = RoundedCornerShape(18.dp)
    ) {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(18.dp)
        ) {
            PanelHeaderSection()
            Spacer(modifier = Modifier.fillMaxWidth().height(18.dp))
            PanelWeekSection()
            Spacer(modifier = Modifier.fillMaxWidth().height(16.dp))
            PanelProgressSection()
            Spacer(modifier = Modifier.fillMaxWidth().height(18.dp))
            PanelDailyTasksSection()
            Spacer(modifier = Modifier.fillMaxWidth().height(16.dp))
            PanelMessageSection()
            Spacer(modifier = Modifier.fillMaxWidth().height(16.dp))
            PanelActionsSection()
        }
    }
}
