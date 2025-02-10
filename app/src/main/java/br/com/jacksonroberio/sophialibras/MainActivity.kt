package br.com.jacksonroberio.sophialibras

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Scaffold
import androidx.compose.ui.Modifier
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import br.com.jacksonroberio.sophialibras.ui.telas.InicioScreen
import br.com.jacksonroberio.sophialibras.ui.telas.PlayScreen
import br.com.jacksonroberio.sophialibras.ui.telas.PoliticaPrivacidadeScreen
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
                                onCreditoClick = {},
                                onTermoPrivacidadeClick = {navController.navigate("politicaPrivacidade")},
                                modifier = Modifier.fillMaxSize()
                            )
                        }
                        composable("jogar") {
                            PlayScreen(Modifier.fillMaxSize())
                        }
                        composable("politicaPrivacidade"){
                            PoliticaPrivacidadeScreen(
                                onBackScreenClick = {navController.popBackStack()}
                            )
                        }
                    }
                }
            }
        }
    }
}