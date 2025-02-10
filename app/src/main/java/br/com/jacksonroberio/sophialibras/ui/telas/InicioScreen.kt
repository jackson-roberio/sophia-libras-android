package br.com.jacksonroberio.sophialibras.ui.telas

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import br.com.jacksonroberio.sophialibras.R



@Composable
fun InicioScreen(
    onPlayClick: () -> Unit,
    onCreditoClick: () -> Unit,
    onTermoPrivacidadeClick: () -> Unit,
    modifier: Modifier = Modifier
) {


    Box(modifier)
    {
        Image (
            painter = painterResource(id = R.drawable.img_background_sala_de_aula),
            contentDescription = "Imagem de fundo",
            contentScale = ContentScale.Crop,
            modifier = Modifier.matchParentSize()
        )


        Column (modifier = Modifier.align(Alignment.Center)) {
            Button (
                onClick = { onPlayClick() },
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
                onClick = { onTermoPrivacidadeClick() },
                Modifier.align(Alignment.CenterHorizontally)
            ){
                Text(text = "Política de Privacidade")
            }

        }

    }

}