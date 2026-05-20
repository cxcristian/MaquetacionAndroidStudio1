package com.sena.firstproject3114227

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.sena.firstproject3114227.ui.screens.PanelTareaScreen
import com.sena.firstproject3114227.ui.theme.FirstProject3114227Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            FirstProject3114227Theme {
                PanelTareaScreen(modifier = Modifier.fillMaxSize())
            }
        }
    }
}



@Preview(showBackground = true, )
@Composable
fun HomeScreenPreview() {
    FirstProject3114227Theme {
        //HomeScreen()
        //DashboadScreen()
        //TareaScreen()
        PanelTareaScreen()
    }
}
