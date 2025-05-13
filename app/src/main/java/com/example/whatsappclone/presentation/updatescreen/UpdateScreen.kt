package com.example.whatsappclone.presentation.updatescreen

import androidx.compose.foundation.layout.size
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Icon
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import com.example.whatsappclone.R
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun updateScreen() {
    Scaffold(
        floatingActionButton = {
            FloatingActionButton(
                onClick = {},
                containerColor = colorResource(R.color.light_green),
                modifier = Modifier.size(64.dp),
                contentColor = Color.White
            ) {
                Icon(
                    painter = painterResource(R.drawable.camera),
                    contentDescription = "Camera",
                    modifier = Modifier.size(24.dp)
                )
            }
        }
    ){}
}
