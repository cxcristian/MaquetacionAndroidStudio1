package com.sena.firstproject3114227.ui.sections.home

import android.widget.Button
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.sena.firstproject3114227.ui.theme.coralAccent
import com.sena.firstproject3114227.ui.theme.deepTeal

@Composable
fun ButtonsSection(navController: NavController) {
    Row(
        modifier = Modifier.fillMaxWidth(),
        horizontalArrangement = Arrangement.spacedBy(10.dp, Alignment.CenterHorizontally),
        verticalAlignment = Alignment.CenterVertically
    ) {
        androidx.compose.material3.Button(
            modifier = Modifier,
            onClick = {},
            colors = ButtonDefaults.buttonColors(
                containerColor = deepTeal,
                contentColor = Color.White
            ),
            shape = RoundedCornerShape(24.dp)
        ) {

            Text("Editar", fontWeight = FontWeight.Bold)
        }
        androidx.compose.material3.Button(
            modifier = Modifier,
            onClick = {navController.navigate("dashboard")},
            colors = ButtonDefaults.buttonColors(
                containerColor = coralAccent,
                contentColor = Color.White
            ),
            shape = RoundedCornerShape(24.dp)
        ) {

            Text("Navegar a dashboard", fontWeight = FontWeight.Bold)
        }
    }
}
