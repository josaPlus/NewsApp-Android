package com.example.newsapp.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun Categorias(){
    val tabs = listOf("Noticias", "Eventos", "Clima")
    Row(
        modifier = Modifier
            .fillMaxWidth(),
        horizontalArrangement = Arrangement.SpaceAround
    ) {
        Column(
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text(
                text = "Noticias",
                fontSize = 20.sp,
                fontWeight = FontWeight.Bold
            )
            // "Subrayado"
            Box(
                modifier = Modifier
                    .height(3.dp)
                    .width(50.dp) // ancho del subrayado
                    .background(Color.Blue, shape = RoundedCornerShape(50))
            )
        }

        Text(
            text = "Eventos",
            fontSize = 20.sp,
            color = Color.Gray
        )
        Text(
            text = "Clima",
            fontSize = 20.sp,
            color = Color.Gray
        )
    }
}