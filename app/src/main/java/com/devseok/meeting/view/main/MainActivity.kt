package com.devseok.meeting.view.main

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.lifecycle.ViewModelProvider
import com.devseok.meeting.utils.EventObserver
import com.devseok.meeting.view.meet.MeetAddActivity

class MainActivity : ComponentActivity() {

    private lateinit var viewModel: MainViewModel
    var context: Context? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        viewModel = ViewModelProvider(this,
            ViewModelProvider.AndroidViewModelFactory(application))[MainViewModel::class.java]

        context = this

        setContent {
            MainScreen(viewModel = viewModel)
        }

        initIntent()
    }

    private fun initIntent() {

        viewModel.goAddScreen.observe(this, EventObserver {
            val intent = Intent(this@MainActivity, MeetAddActivity::class.java)
            startActivity(intent)

        })

    }
}



