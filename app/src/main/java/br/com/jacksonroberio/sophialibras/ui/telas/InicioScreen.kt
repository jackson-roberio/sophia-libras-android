package br.com.jacksonroberio.sophialibras.ui.telas

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
//import br.com.jacksonroberio.sophialibras.Greeting
import br.com.jacksonroberio.sophialibras.R
import br.com.jacksonroberio.sophialibras.ui.theme.SophiaLibrasTheme


@Composable
fun InicioScreen(
    onPlayClick: () -> Unit,
    onTermoPrivacidadeClick: () -> Unit,
    modifier: Modifier = Modifier
) {


    Box(modifier)
    {
        Image (
            painter = painterResource(id = R.drawable.img_pista_com_arvore),
            contentDescription = "Imagem de fundo",
            contentScale = ContentScale.Crop,
            modifier = Modifier.matchParentSize()
        )


        Column (modifier = Modifier.align(Alignment.Center)) {
            Button (
                onClick = { onPlayClick()},
                modifier = Modifier.align(Alignment.CenterHorizontally)
            ){
                Text(text = "Jogar")
            }

            Button (
                onClick = { },
                Modifier.align(Alignment.CenterHorizontally)
            ){
                Text(text = "Créditos")
            }

            Button (
                onClick = { },
                Modifier.align(Alignment.CenterHorizontally)
            ){
                Text(text = "Política de Privacidade")
            }

        }


        /*Text(
            text = "Olá, Compose!",
            color = Color.White,
            modifier = Modifier.align(Alignment.Center)
        )*/
    }

}

/*@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    SophiaLibrasTheme {
        Greeting("Android")
    }
}*/
