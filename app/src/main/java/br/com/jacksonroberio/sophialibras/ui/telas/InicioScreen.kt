package br.com.jacksonroberio.sophialibras.ui.telas

import android.text.style.BackgroundColorSpan
import android.widget.Toast
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import br.com.jacksonroberio.sophialibras.R
import br.com.jacksonroberio.sophialibras.ui.theme.goodMatch


@Composable
fun InicioScreen(
    onPlayClick: () -> Unit,
    onCreditoClick: () -> Unit,
    onTermoPrivacidadeClick: () -> Unit,
    modifier: Modifier = Modifier
) {



    //val contexto = LocalContext.current

    Box(){
        Image (
            painter = painterResource(id = R.drawable.img_background_verde_1),
            contentDescription = "Imagem de fundo",
            contentScale = ContentScale.Crop,
            modifier = Modifier.fillMaxSize()
        )
    }

    Column (Modifier.fillMaxSize()) {

        Box(Modifier.fillMaxWidth().weight(1f), contentAlignment = Alignment.Center){
            Image (
                painter = painterResource(id = R.drawable.img_persona_sophia_libras_1),
                contentDescription = "Logomarca",
                contentScale = ContentScale.Crop,
                modifier = Modifier.matchParentSize().padding(20.dp)
            )
        }


        Box(Modifier.fillMaxWidth()
                    .weight(1f)
                    .padding(top = 75.dp),
            contentAlignment = Alignment.TopCenter
        )
        {

            Column {
            //(modifier = Modifier.align(Alignment.Center)) {
                Button (
                    onClick = { onPlayClick() },
                    colors = ButtonDefaults.buttonColors(
                        containerColor = Color.White,
                        contentColor = Color.Gray
                    ),
                    modifier = Modifier.padding(bottom = 25.dp)
                        .align(Alignment.CenterHorizontally)
                ){
                    Text(
                        text = "JOGAR",
                        fontSize = 35.sp,
                        fontFamily = goodMatch
                        )
                }

                Button (
                    onClick = { onTermoPrivacidadeClick() },
                    colors = ButtonDefaults.buttonColors(
                        containerColor = Color.White,
                        contentColor = Color(0xFF4D4D4D)
                    ),
                    modifier = Modifier.align(Alignment.CenterHorizontally)
                ){
                    Text(
                        text = "SOBRE O JOGO",
                        fontSize = 35.sp,
                        fontFamily = goodMatch
                    )
                }

            }

        }


    }



}