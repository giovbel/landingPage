package br.senai.sp.jandira.landingpage

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import br.senai.sp.jandira.landingpage.ui.theme.LandingPageTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            LandingPageTheme {
                landingPage()
                }
            }
        }
    }


@Composable
fun landingPage() {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(
                Brush.verticalGradient(
                    colors = listOf(
                        Color(0xFFE3EFFF),
                        Color(0xFF275BC8)
                    ),
                )
            )
    ) {
        Column(
            modifier = Modifier.height(800.dp),
            verticalArrangement = Arrangement.SpaceBetween,
        )
        {
            Image(
                painter = painterResource(id = R.drawable.logo),
                contentDescription = "",
                modifier = Modifier
                    .fillMaxWidth()
                    .height(95.dp)
                    .padding(top = 23.dp),
                alignment = Alignment.Center
            )
                Text(
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(160.dp)
                        .padding(30.dp),
                    textAlign = TextAlign.Center,
                    text = "Oi! Aqui no CallMe, você \n encontra o apoio que \n precisa. Respire fundo, \n vamos superar isso juntos.",
                    fontSize = 20.sp,
                    color = Color(0xFF04276D),
                    fontWeight = FontWeight.Medium,
                )
                Image(
                    painter = painterResource(id = R.drawable.macallmepsicologobanana),
                    contentDescription = "",
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(190.dp)
                        .padding(bottom = 23.dp),
                    alignment = Alignment.Center
                )


        }
    }
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun GreetingPreview() {
    LandingPageTheme {
        landingPage()
    }
}