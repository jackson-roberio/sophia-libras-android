package br.com.jacksonroberio.sophialibras

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.focus.focusModifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import br.com.jacksonroberio.sophialibras.ui.telas.InicioScreen
import br.com.jacksonroberio.sophialibras.ui.telas.PlayScreen
import br.com.jacksonroberio.sophialibras.ui.theme.SophiaLibrasTheme

class MainActivity : ComponentActivity() {
    @SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            SophiaLibrasTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) {
                    val navController = rememberNavController()
                    NavHost(navController = navController, startDestination = "inicio"){
                        composable("inicio") {
                            InicioScreen(
                                onPlayClick = {navController.navigate("jogar")},
                                onTermoPrivacidadeClick = {},
                                modifier = Modifier.fillMaxSize() //modifier = Modifier.padding(innerPadding)

                            )
                        }
                        composable("jogar") {
                            PlayScreen(modifier = Modifier.fillMaxSize())
                        }
                    }
                }
                /*{ innerPadding ->
                    Greeting(
                        name = "Android",
                        modifier = Modifier.fillMaxSize() //modifier = Modifier.padding(innerPadding)
                    )
                }*/
            }
        }
    }
}

/*@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    /*Text(
        text = "Hello $name!",
        modifier = modifier
    )*/

    Box(modifier)
    {
        Image (
            painter = painterResource(id = R.drawable.img_pista_com_arvore),
            contentDescription = "Imagem de fundo",
            contentScale = ContentScale.Crop,
            modifier = Modifier.matchParentSize()
        )

        Text(
            text = "Olá, Compose!",
            color = Color.White,
            modifier = Modifier.align(Alignment.Center)
        )
    }

}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    SophiaLibrasTheme {
        Greeting("Android")
    }
}*/