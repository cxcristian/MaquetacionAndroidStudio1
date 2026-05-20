package com.sena.firstproject3114227

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.sena.firstproject3114227.ui.screens.DashboadScreen
import com.sena.firstproject3114227.ui.screens.HomeScreen
import com.sena.firstproject3114227.ui.screens.TareaScreen
import com.sena.firstproject3114227.ui.theme.FirstProject3114227Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            FirstProject3114227Theme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    //HomeScreen(modifier = Modifier.padding(innerPadding))
                    //DashboadScreen(modifier = Modifier.padding(innerPadding))
                    TareaScreen(modifier = Modifier.padding(innerPadding))
                }
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
        TareaScreen()
    }
}
