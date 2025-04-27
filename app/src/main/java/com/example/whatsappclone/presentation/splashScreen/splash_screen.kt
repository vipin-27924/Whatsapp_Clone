package com.example.whatsappclone.presentation.splashScreen

import android.R.attr.fontWeight
import androidx.collection.intIntMapOf
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.colorResource
import com.example.whatsappclone.R
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp


@Preview(showSystemUi = true , showBackground = true)
@Composable
fun hello(){
    Box(
        modifier = Modifier.fillMaxSize()
    ){
        Image(painter = painterResource(R.drawable.whatsapp_icon),
            contentDescription = null ,
            modifier = Modifier
                .size(80.dp)
                .align(Alignment.Center)
        )

        Column(
            modifier = Modifier
                .align(Alignment.BottomCenter)
                .padding(30.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text(
                text = "From",
                fontSize = 18.sp,
                fontWeight = FontWeight.SemiBold
                )

            Row {

                Icon(
                    modifier = Modifier.size(24.dp),
                    tint = colorResource(R.color.light_green),
                    painter = painterResource(R.drawable.meta),
                    contentDescription = null
                )
                Text(text = "Meta",
                    fontSize = 18.sp,
                    fontWeight = FontWeight.SemiBold)
            }
        }
    }
}
