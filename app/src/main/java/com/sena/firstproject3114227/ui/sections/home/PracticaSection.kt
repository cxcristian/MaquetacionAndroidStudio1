package com.sena.firstproject3114227.ui.sections.home

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material3.Icon
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.sena.firstproject3114227.R
import com.sena.firstproject3114227.ui.theme.lightBlue
import com.sena.firstproject3114227.ui.theme.softGray

@Composable
fun PracticaSection() {
    Surface(
        modifier = Modifier
            .padding(10.dp),
        shape = RoundedCornerShape(16.dp),
        color = lightBlue
    ) {
        Box(
            modifier = Modifier.fillMaxWidth()
                .padding(20.dp),
            contentAlignment = Alignment.Center
        ) {
            Column(
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Image(
                    painter = painterResource(id = R.drawable.informacion),
                    modifier = Modifier.size(30.dp),
                    contentDescription = ""
                )

                Text("Practica de layout Compose")
            }
        }
    }
}