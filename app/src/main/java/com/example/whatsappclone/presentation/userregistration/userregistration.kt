package com.example.whatsappclone.presentation.userregistration

import android.R.attr.button
import android.R.attr.country
import android.provider.CalendarContract
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowDropDown
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.DropdownMenu
import androidx.compose.material3.DropdownMenuItem
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Icon
import androidx.compose.material3.LocalTextStyle
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.focus.focusModifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.whatsappclone.R
import java.nio.file.WatchEvent
import kotlin.math.sin

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun userregistrationscreen(){

    var isExpanded by remember { mutableStateOf(false) }
    var selectedCountry by remember { mutableStateOf("India") }
    var countryCode by remember { mutableStateOf("+91") }
    var phoneNumber by remember { mutableStateOf("") }
    Column(
        modifier = Modifier.fillMaxSize()
            .padding(20.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            modifier = Modifier.padding(10.dp),
            text = "Enter Yor Phone Number",
            fontSize = 20.sp,
            color = colorResource(R.color.dark_green),
            fontWeight = FontWeight.Bold
        )

        Spacer(
            modifier = Modifier.height(15.dp)

        )

        Row {
            Text(text = "WhatsApp will Need To Verify Your Phone Number.")

            Spacer(modifier = Modifier.width(2.dp))


            Text(
                text = "What's",
                color = colorResource(R.color.dark_green)
            )
        }

        Text(
            text = "My Number?",
            color = colorResource(R.color.dark_green)
        )


        Spacer(modifier = Modifier.height(16.dp))


        TextButton(onClick = {isExpanded = true},
            modifier = Modifier.fillMaxWidth()) {

            Box(modifier = Modifier.width(230.dp)) {

                Text(text = "India",
                   modifier =  Modifier.align (Alignment.Center),
                    fontSize = 16.sp,
                    color = Color.Black)
                Icon(
                    Icons.Default.ArrowDropDown,
                    contentDescription = null,
                    modifier = Modifier.align(Alignment.CenterEnd),
                    tint = colorResource(R.color.dark_green)
                )
            }
        }
        DropdownMenu(
            expanded = isExpanded,
            onDismissRequest = { isExpanded = false },
            modifier = Modifier.fillMaxWidth(0.5f)
                .fillMaxSize()
        ) {
            listOf("India", "Sri Lanka", "USA", "China").forEach { country ->
                DropdownMenuItem(
                    text = {
                        Text(
                            text = country,
                            fontSize = 16.sp,
                            color = Color.Black
                        )
                    },
                    onClick = {
                        selectedCountry = country
                        isExpanded = false
                    }
                )
            }
        }


        Column (
            modifier = Modifier
                .fillMaxSize()
                .padding(16.dp),
            horizontalAlignment = Alignment.CenterHorizontally,
        ){

            Row {
                TextField(
                    value = countryCode,
                    onValueChange = { countryCode = it },
                    modifier = Modifier.width(70.dp),
                    singleLine = true,
                    textStyle = LocalTextStyle.current.copy(fontSize = 18.sp),
                    colors = TextFieldDefaults.colors(
                        unfocusedContainerColor = Color.Transparent,
                        focusedContainerColor = Color.Transparent,
                        unfocusedIndicatorColor = colorResource(R.color.light_green),
                        focusedIndicatorColor = colorResource(R.color.light_green)
                    )
                )
                Spacer(modifier = Modifier.width(8.dp))


                TextField(
                    value = phoneNumber,
                    onValueChange = { phoneNumber = it },
                    modifier = Modifier.weight(1f),
                    singleLine = true,
                    placeholder = { Text("Phone number") },
                    keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Phone),
                    textStyle = LocalTextStyle.current.copy(fontSize = 18.sp),
                    colors = TextFieldDefaults.colors(
                        unfocusedContainerColor = Color.Transparent,
                        focusedContainerColor = Color.Transparent,
                        unfocusedIndicatorColor = colorResource(R.color.light_green),
                        focusedIndicatorColor = colorResource(R.color.light_green)
                    )
                )

            }


            Spacer(modifier = Modifier
                .height(16.dp))

            Text(text = "Carrier Charges May Apply",
                fontSize = 12.sp,
                color = MaterialTheme.colorScheme.onSurface.copy(alpha = 0.6f)
            )

            Spacer(modifier = Modifier
                .height(26.dp))
            Button(
                onClick = {},
                shape = RoundedCornerShape(6.dp),
                colors = ButtonDefaults.buttonColors(containerColor = colorResource(R.color.dark_green))
            ) {
                Text(text = "Next",
                    fontSize = 16.sp,)
            }
        }
    }
}


