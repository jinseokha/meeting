package com.devseok.meeting.view.meet

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.text.BasicTextField
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.text.input.TextFieldValue
import com.devseok.meeting.R

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun MeetAddScreen(viewModel: MeetAddViewModel) {

    val context = LocalContext.current

    var title by remember { mutableStateOf(TextFieldValue("")) }


    Scaffold(
        topBar = {
            TopAppBar(
                title = { Text(
                    text = context.getString(R.string.screen_meet_add),
                    color = Color(0x000000)
                )},
                navigationIcon = {
                    IconButton(onClick = {
                        // Back
                        viewModel.back()
                    }) {
                        Icon(
                            imageVector = Icons.Filled.ArrowBack,
                            contentDescription = "backButton",
                            tint = colorResource(id = R.color.white)
                        )
                    }
                },
                actions = {

                })
        }
    ) { padding ->
        Column(
            modifier = Modifier
                .padding(padding)
        ) {
            /*BasicTextField(value = ) {
                
            }*/


        }
    }

}