package com.rmariaca.tallergitgithubapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.rmariaca.tallergitgithubapp.ui.theme.TallerGitGithubAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            TallerGitGithubAppTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    Box(Modifier.padding(innerPadding)) {
                        TarjetaPresentacion()
                    }
                }
            }
        }
    }
}

@Composable
fun TarjetaPresentacion() {
    Card(
        modifier = Modifier.fillMaxSize().padding(16.dp),
        shape = RoundedCornerShape(24.dp),
        elevation = CardDefaults.cardElevation(8.dp)
    ) {
        Column(
            modifier = Modifier.fillMaxSize().padding(24.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            // ===== PASO 07: Imagen =====
            Image(
                painter = painterResource(R.drawable.ic_launcher_foreground),
                contentDescription = "Foto de perfil",
                contentScale = ContentScale.Crop,
                modifier = Modifier
                    .size(120.dp)
                    .clip(CircleShape)
                    .border(3.dp, Color(0xFF1E6FE0), CircleShape)
            )



@Composable
fun DatoPersonal(etiqueta: String, valor: String) {
    Column(Modifier.fillMaxWidth().padding(bottom = 8.dp)) {
        Text(etiqueta, fontSize = 11.sp, fontWeight = FontWeight.Bold, color = Color.Gray)
        Text(valor, fontSize = 16.sp)
    }
}

@Preview(showBackground = true)
@Composable
fun PreviewTarjeta() {
    TallerGitGithubAppTheme { TarjetaPresentacion() }
}