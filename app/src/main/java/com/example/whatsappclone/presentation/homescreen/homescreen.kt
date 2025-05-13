package com.example.whatsappclone.presentation.homescreen

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import com.example.whatsappclone.R
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.whatsappclone.presentation.bottomnavigation.BottomNavigation
import com.example.whatsappclone.presentation.chatbox.chatListModel

@Preview(showBackground = true , showSystemUi = true)
@Composable
fun homeScreen(){

    val chatList =  listOf(chatListModel(
        Image = R.drawable.salmankhan,
        name ="Salman khan",
        Time =  "10:00 AM",
        message =  "Hello Sir"),
        chatListModel(
            Image = R.drawable.sharukhkhan,
            name ="Sharukh khan",
            Time =  "10:00 AM",
            message =  "Hello Sir"),
        chatListModel(
            Image = R.drawable.sharadhakapoor,
            name ="Sharadha Kapoor",
            Time =  "10:00 AM",
            message = "hiiiii"
        ),
        chatListModel(
            Image = R.drawable.rashmika,
            name ="rashmika",
            Time =  "10:00 AM",
            message =  "Hello Sir"),
        chatListModel(
            Image = R.drawable.rajkummar_rao,
            name ="rajkumar rao",
            Time =  "10:00 AM",
            message =  "Hello Sir"),
        )

    Scaffold(
        floatingActionButton = {
            FloatingActionButton(onClick = {},
                containerColor = colorResource(R.color.light_green),
                modifier = Modifier
                    .size(65.dp),
                contentColor = Color.White
            ) {
                Icon(painter = painterResource(R.drawable.chat_icon),
                    contentDescription = null,
                    modifier = Modifier
                        .size(30.dp))
            }
        },
        bottomBar = {
            BottomNavigation()
        }
    ) {
        Column (modifier = Modifier
            .padding(it)
        ){
            Box(
                modifier = Modifier
                    .fillMaxWidth()
            ){
                Text(text = "WhatsApp",
                    fontSize = 28.sp,
                    color = colorResource(R.color.light_green),
                    modifier = Modifier
                        .align(Alignment.CenterStart)
                        .padding(start = 16.dp),
                    fontWeight = FontWeight.Bold
                )
                Row(
                    modifier = Modifier
                        .align(Alignment.CenterEnd)
                )
                {
                    IconButton(onClick = {}) {

                        Icon(
                            painter = painterResource(R.drawable.camera),
                            contentDescription = null,
                            modifier = Modifier
                                .size(28.dp)
                        )
                    }

                    IconButton(onClick = {}) {

                        Icon(
                            painter = painterResource(R.drawable.search),
                            contentDescription = null,
                            modifier = Modifier
                                .size(28.dp)
                        )
                    }

                    IconButton(onClick = {}) {
                        Icon(
                            painter = painterResource(R.drawable.more),
                            contentDescription = null,
                            modifier = Modifier
                                .size(28.dp)
                        )
                    }
                }
            }
            HorizontalDivider()

            LazyColumn {
                items (chatList){
                     chatscreen(chatListModel =it)
                }
            }
        }
    }
}