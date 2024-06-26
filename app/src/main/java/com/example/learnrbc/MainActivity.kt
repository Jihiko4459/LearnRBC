package com.example.learnrbc

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.defaultMinSize
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.modifier.modifierLocalConsumer
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.learnrbc.ui.theme.LearnRBCTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            LearnRBCTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                )
                {
                    LearnRowColumnBox()
                }
            }
        }
    }
}


@Composable
fun LearnRowColumnBox(){
//    Text(text="Hello Column")
//    Text(text="Hello Row")
//    Text(text="Hello Box")

//    Column(horizontalAlignment = Alignment.CenterHorizontally,
//        verticalArrangement =Arrangement.Center) {//=Vertical Linear Layout
//        Text(text="Hello Column 1")
//        Text(text="Hello Column 2")
//    }


//    Row(verticalAlignment = Alignment.CenterVertically,
//        horizontalArrangement = Arrangement.Center) {//=Horizontal LL
//        Text(text="Hello Row 1")
//        Text(text="Hello Row 2")
//    }

    //Box Layout - элементы накладываются друг на друга
    Box(modifier = Modifier.fillMaxSize()
        .background(Color.Cyan), contentAlignment = Alignment.Center){
        Box(modifier = Modifier.height(300.dp).width(300.dp).background(Color.Magenta)) {
            Text(text="Hello Box", modifier= Modifier.align(Alignment.Center),
                Color.Magenta, fontSize = 30.sp
            )
        }
    }

}
