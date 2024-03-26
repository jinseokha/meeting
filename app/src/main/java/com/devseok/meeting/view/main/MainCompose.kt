package com.devseok.meeting.view.main

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.Add
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.devseok.meeting.data.Meet
import com.devseok.meeting.data.MeetEx

/*
@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}*/


@Composable
fun MainScreen() {
    Box(
        modifier = Modifier
            .padding(15.dp)
    ) {
        FloatingActionButton(
            onClick = {
                //OnClick Method
            },
            modifier = Modifier
                .align(Alignment.BottomEnd)
        ) {
            Icon(
                imageVector = Icons.Rounded.Add,
                contentDescription = "Add FAB",
                tint = Color.White,
            )
        }

        Column {
            Text("내 모임")

            val getAllData = MeetEx().getAllData()

            LazyColumn(
                contentPadding = PaddingValues(all = 12.dp),
                verticalArrangement = Arrangement.spacedBy(12.dp)
            ) {
                itemsIndexed(
                    items = getAllData,
                    key = { index, item ->
                        item.title
                    }
                ) { index, item ->
                    MeetListItem(meet = item)

                }
            }
        }
    }
}

@Composable
fun MeetListItem(meet: Meet) {
    Column (
        modifier = Modifier
            .fillMaxWidth()
            .padding(24.dp)
    ) {
        Text(
            text = meet.title,
            color = Color.Black,
            fontSize = 22.sp,
            fontWeight = FontWeight.Bold
        )
        Text(
            text = meet.category!!,
            color = Color.Black,
            fontSize = 18.sp,
            fontWeight = FontWeight.Normal
        )
        Text(
            text = meet.memo!!,
            color = Color.Black,
            fontSize = 15.sp,
            fontWeight = FontWeight.Normal
        )
    }
}

//@Preview(showSystemUi = true)
//@Composable
//fun GreetingPreview() {
//    MeetingTheme {
//        MainScreen()
//    }
//}
