package com.example.collumn_rows

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Alignment.Companion.Start
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.collumn_rows.ui.theme.CollumnrowsTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            CollumnrowsTheme {
//                Greeting(name = "Guilherme")
                //RightAlignedColumn()

//                WeightedColumn()
                SimpleBoxSplit()
            }
        }
    }
}

@Composable
fun RightAlignedColumn() {
    Column(modifier = Modifier.fillMaxSize(), horizontalAlignment = Alignment.CenterHorizontally) {
        Text(text = "Item 01")
        Text(text = "Item 02")
        Text(text = "Item 03")
    }
}

@Composable
fun SimpleBoxSplit() {
    Column(
        modifier = Modifier.fillMaxSize()
    ) {
        Row(
            modifier = Modifier.weight(1f)
        ) {
            Box(
                modifier = Modifier
                    .weight(1f)
                    .fillMaxHeight()
                    .background(Color.Black)
            )
            Box(
                modifier = Modifier
                    .weight(1f)
                    .fillMaxHeight()
                    .background(Color.LightGray)
            )
        }
        Row(
            modifier = Modifier.weight(1f)
        ) {
            Box(
                modifier = Modifier
                    .weight(1f)
                    .fillMaxHeight()
                    .background(Color.LightGray)
            )
            Box(
                modifier = Modifier
                    .weight(1f)
                    .fillMaxHeight()
                    .background(Color.Black)
            )
        }
    }
}


@Composable
fun SimpleBox() {
    Row {
        Box(modifier = Modifier
            .size(300.dp)
            .background(Color.Green)) {
            Text(
                text = "Item 01", modifier = Modifier.align(Alignment.TopStart)
            )
        }
        Box(modifier = Modifier
            .size(300.dp)
            .background(Color.Green)) {
            Text(
                text = "Item 01", modifier = Modifier.align(Alignment.TopStart)
            )

        }

    }

}
@Composable
fun WeightedColumn() {
    Column(modifier = Modifier.fillMaxSize()){
        Text(text = "Item 01")
        Text(text = "***   Item 02  --- Vai usar o espaço ***"
        , modifier = Modifier.weight(1F))
        Text(text = "Item 03")
    }
}


@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )}


//@Preview(showBackground = true)
//@Composable
//fun GreetingPreview() {
//    CollumnrowsTheme {
//        Greeting("Android")
//    }
//}