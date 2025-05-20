package com.example.whatsappclone.presentation.updatescreen

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.BottomAppBar
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
import com.example.whatsappclone.presentation.bottomnavigation.BottomNavigation

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun updateScreen() {
    Scaffold (
        floatingActionButton =
            {
                FloatingActionButton(onClick = {},
                    containerColor = colorResource(id = R.color.light_green),
                    modifier = Modifier.size(65.dp)) {

                    Icon(painter = painterResource(id = R.drawable.baseline_photo_camera_24),
                        contentDescription = null,
                        modifier = Modifier
                            .size(35.dp),
                        tint = Color.White)

                }
            },
        bottomBar = {
            BottomNavigation()
        }
    ){
        Column (modifier = Modifier
            .padding(it)
        ){
        }

    }

}