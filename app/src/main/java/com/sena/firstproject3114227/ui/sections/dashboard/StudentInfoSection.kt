package com.sena.firstproject3114227.ui.sections.dashboard

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.sena.firstproject3114227.R

@Composable

fun StudentInfoSection(){
    Column(modifier = Modifier
        .fillMaxWidth(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
        )
    {

        Row(modifier = Modifier.fillMaxWidth(),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceEvenly
        ) {
            Image(
                painter = painterResource(id = R.drawable.graduation_hat),
                modifier = Modifier.size(30.dp),
                contentDescription = ""
            )
            Column() {
                Text(text = "Curso actual: ", fontSize = 13.sp)
                Text(text = "Desarrollo Android en compose", fontSize = 13.sp)
            }
            Image(
                painter = painterResource(id = R.drawable.avance1),
                modifier = Modifier.size(20.dp),
                contentDescription = ""
            )
        }

    }
}