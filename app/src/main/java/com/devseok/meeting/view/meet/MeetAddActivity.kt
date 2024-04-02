package com.devseok.meeting.view.meet

import android.content.Context
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.lifecycle.ViewModelProvider
import com.devseok.meeting.utils.EventObserver

class MeetAddActivity : ComponentActivity() {

    private lateinit var viewModel: MeetAddViewModel
    var context: Context? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        viewModel = ViewModelProvider(this,
            ViewModelProvider.AndroidViewModelFactory(application))[MeetAddViewModel::class.java]

        context = this

        setContent {
            MeetAddScreen(viewModel = viewModel)
        }

        initIntent()
    }

    private fun initIntent() {
        viewModel.finishScreen.observe(this, EventObserver {
            finish()
        })

    }
}