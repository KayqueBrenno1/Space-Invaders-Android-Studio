package com.example.exercicio_1_android_studio

import android.R.attr.text
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.exercicio_1_android_studio.ui.theme.Exercicio1AndroidStudioTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Exercicio1AndroidStudioTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
//                   BacicComponentsScreen(modifier = Modifier.padding(innerPadding))
                    TelaGameOver(modifier = Modifier.padding(innerPadding))
                }
            }
        }
    }
}

@Composable
fun BacicComponentsScreen(modifier: Modifier = Modifier) {
    Column(
        modifier = modifier
            .fillMaxSize()
            .background(Color.Black),
    ) {
        Column(
            modifier = Modifier
                .weight(1f)
                .fillMaxWidth()
        ) {
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(10.dp, 30.dp),
                horizontalArrangement = Arrangement.SpaceBetween
            ) {
                Text(
                    text = "SCORE: 0050",
                    color = Color.White,
                    fontWeight = FontWeight.SemiBold
                )

                Row(
                    verticalAlignment = Alignment.CenterVertically,
                ) {
                    Text(
                        text = "LIVES: ",
                        color = Color.White,
                        fontWeight = FontWeight.SemiBold
                    )
                    Life(
                        modifier = Modifier
                            .size(15.dp)
                    )
                    Life(
                        modifier = Modifier
                            .size(15.dp)
                    )
                    Life(
                        modifier = Modifier
                            .size(15.dp)
                    )
                }
            }
            Row(
                modifier = Modifier
                    .fillMaxWidth(),
                horizontalArrangement = Arrangement.Center
            ) {
                ImgInimigos(
                    modifier = Modifier
                        .size(70.dp),
                    color = Color.Green
                )
                ImgInimigos(
                    modifier = Modifier
                        .size(70.dp),
                    color = Color.Yellow
                )
                ImgInimigos(
                    modifier = Modifier
                        .size(70.dp),
                    color = Color.Red
                )
                ImgInimigos(
                    modifier = Modifier
                        .size(70.dp),
                    color = Color.Magenta
                )
                ImgInimigos(
                    modifier = Modifier
                        .size(70.dp),
                    color = Color.Cyan
                )
            }
        }

        Column(
            modifier = Modifier
                .fillMaxWidth()
                .weight(1f),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.spacedBy(20.dp, Alignment.Bottom)
        ) {
            ImgCubo(
                modifier = Modifier
                    .size(80.dp)
            )
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(50.dp)
                    .background(Color.DarkGray)
            ) {
                Text(
                    text = "PRESS START",
                    color = Color.White,
                    modifier = Modifier
                        .align(Alignment.Center),
                    fontWeight = FontWeight.Bold,
                    fontSize = 20.sp
                )
            }
        }
    }
}

@Composable
fun TelaGameOver(modifier: Modifier = Modifier) {
    Box(
        modifier = modifier
            .fillMaxSize()
            .background(Color.Black),
        contentAlignment = Alignment.Center
    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth(),
            horizontalArrangement = Arrangement.Center
        ) {
            ImgInimigos(
                modifier = Modifier
                    .size(70.dp),
                color = Color.Green
            )
            ImgInimigos(
                modifier = Modifier
                    .size(70.dp),
                color = Color.Yellow
            )
            ImgInimigos(
                modifier = Modifier
                    .size(70.dp),
                color = Color.Red
            )
            ImgInimigos(
                modifier = Modifier
                    .size(70.dp),
                color = Color.Magenta
            )
            ImgInimigos(
                modifier = Modifier
                    .size(70.dp),
                color = Color.Cyan
            )
        }

        Text(
            text = "GAME OVER",
            fontWeight = FontWeight.Bold,
            fontSize = 70.sp,
            color = Color.White
        )
    }
}

@Composable
fun Life(
    modifier: Modifier = Modifier
) {
    Image(
        modifier = modifier,
        painter = painterResource(R.drawable.life),
        contentDescription = "Android Enemy"
    )
}

@Composable
fun ImgInimigos(modifier: Modifier = Modifier, color: Color) {
    Image(
        modifier = modifier,
        painter = painterResource(R.drawable.ai_dentro),
        colorFilter = ColorFilter.tint(color = color),
        contentDescription = "Aí Dentro"
    )
}

@Composable
fun ImgCubo(modifier: Modifier = Modifier) {
    Image(
        modifier = modifier,
        painter = painterResource(R.drawable.cubo_magico),
        contentDescription = "Cubo Mágico"
    )
}