package com.sena.firstproject3114227.ui.sections.tareas

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.sena.firstproject3114227.R

@Composable

fun BigBoxImageSection(){
    Box(modifier = Modifier
        .fillMaxWidth()
        .padding(5.dp)
        .width(50.dp),
        contentAlignment = Alignment.Center

    ){
        Image(painter = painterResource(R.drawable.checklist),
            modifier = Modifier.fillMaxWidth(),
            contentDescription = "",
            contentScale = ContentScale.Fit)



    }
}