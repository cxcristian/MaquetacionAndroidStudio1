package com.sena.firstproject3114227.ui.sections.home

import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.sena.firstproject3114227.R
import com.sena.firstproject3114227.ui.theme.coralAccent

@Composable

fun ProfileSection(){

    Box(modifier = Modifier){

        androidx.compose.foundation.Image(
            painter = painterResource(id = R.drawable.logo_profile),
            contentDescription = null,
            modifier = Modifier
                .size(108.dp)
                .clip(CircleShape)
                .border(4.dp, coralAccent, CircleShape)
        )
    }

}
