package com.sena.firstproject3114227.ui.sections.tareas

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.sena.firstproject3114227.R
import com.sena.firstproject3114227.ui.theme.skySoft

@Composable

fun BigBoxImageSection(){
    Box(modifier = Modifier
        .fillMaxWidth()
        .padding(8.dp)
        .width(50.dp),
        contentAlignment = Alignment.Center

    ){
        Surface(
            modifier = Modifier.fillMaxWidth(),
            shape = RoundedCornerShape(24.dp),
            color = skySoft
        ) {
            Image(painter = painterResource(R.drawable.diagram),
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(18.dp),
                contentDescription = "",
                contentScale = ContentScale.Fit)
        }



    }
}
