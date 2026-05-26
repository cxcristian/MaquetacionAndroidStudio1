package com.sena.firstproject3114227.ui.sections.dashboard


import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.sena.firstproject3114227.ui.theme.coralAccent
import com.sena.firstproject3114227.ui.theme.deepTeal

@Composable
fun ButtonsSection(navController: NavController) {
    Row (modifier = Modifier.fillMaxWidth(),
        horizontalArrangement = Arrangement.Center)
    {
        OutlinedButton(onClick = {},
            colors = ButtonDefaults.outlinedButtonColors( contentColor = deepTeal),
            border = BorderStroke(1.dp, deepTeal),
            shape = RoundedCornerShape(24.dp)
            ){
            Text("Ver detalles")
        }
        Spacer(modifier = Modifier.width(60.dp))
        Button(
            onClick = {navController.navigate(route = "home")},
            colors = ButtonDefaults.buttonColors(
                containerColor = coralAccent,
                contentColor = Color.White
            ),
            shape = RoundedCornerShape(24.dp)
        ) {
            Text("Volver", fontSize = 14.sp, fontWeight = FontWeight.Bold)
        }

    }
}
