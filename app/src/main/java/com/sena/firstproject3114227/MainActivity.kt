package com.sena.firstproject3114227

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Card
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.sena.firstproject3114227.ui.navigation.AppNavigation
import com.sena.firstproject3114227.ui.theme.FirstProject3114227Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            FirstProject3114227Theme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    AppNavigation(modifier = Modifier.padding(innerPadding))
                }
            }
        }
    }
}

@Composable
fun LazyCol(modifier: Modifier){
    val productos: List<Int> = listOf(
        R.drawable.usuario,
        R.drawable.usuario,
        R.drawable.usuario,
        R.drawable.usuario,
        R.drawable.usuario,
        R.drawable.usuario,
        R.drawable.usuario,
        R.drawable.usuario,
        R.drawable.usuario,
        R.drawable.usuario,
        R.drawable.usuario,
        R.drawable.usuario



    )
    LazyRow (modifier = Modifier.fillMaxSize(),
        contentPadding = PaddingValues(20.dp)
    ) {

        items(productos){producto ->
            ProductItem(nombre = producto)
        }
    }
}

@Composable
fun ProductItem(nombre: Int){
    Card(modifier = Modifier.fillMaxWidth()) {
        Image(painter = painterResource(nombre),
            contentDescription = "")
    }
}
@Preview(showBackground = true, )
@Composable
fun HomeScreenPreview() {
    FirstProject3114227Theme {
        //HomeScreen()
        //DashboadScreen()
        //TareaScreen()
        AppNavigation(modifier = Modifier.padding())
    }
}
