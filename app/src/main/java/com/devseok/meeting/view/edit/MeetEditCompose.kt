package com.devseok.meeting.view.edit

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.colorResource
import com.devseok.meeting.R

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun MeetEditScreen(viewModel: MeetEditViewModel) {

    val context = LocalContext.current

    Scaffold(
        topBar = {
            TopAppBar(
                title = { Text(
                    text = context.getString(R.string.screen_meet_edit),
                    color = Color(0x000000)
                )},
                navigationIcon =  {
                    IconButton(onClick = {
                       // Back

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
        Column (
            modifier = Modifier
                .padding(padding)
        ) {

        }
    }

}