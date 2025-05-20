package com.example.whatsappclone.presentation.updatescreen

import android.R.attr.text
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Preview(showBackground = true)
@Composable


fun TopBar(){
    var isSearching by remember {
        mutableStateOf(false)
    }
    var Search by remember {
        mutableStateOf("")
    }
    Box(modifier = Modifier
        .fillMaxWidth()
    ){
        Column {

            Row {
                if (isSearching){
                    TextField(value = Search, onValueChange = {
                        Search  = it
                    },
                        placeholder = {
                            Text(text = "Search")
                        },
                        colors = TextFieldDefaults.colors(
                            unfocusedContainerColor = Color.Transparent,
                            focusedContainerColor = Color.Transparent,
                            unfocusedIndicatorColor = Color.Transparent,
                            focusedIndicatorColor = Color.Transparent,
                            cursorColor = Color.Black,
                        ),
                        modifier = Modifier
                            .padding(start = 12.dp),
                        singleLine = true
                    )}else{
                        Text(text  = "Updates",
                            fontSize = 12.sp)
                }
            }
        }
    }
}