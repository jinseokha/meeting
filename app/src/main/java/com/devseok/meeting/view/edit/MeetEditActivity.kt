package com.devseok.meeting.view.edit

import android.content.Context
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.lifecycle.ViewModelProvider
import com.devseok.meeting.utils.EventObserver

class MeetEditActivity : ComponentActivity() {

    private lateinit var viewModel: MeetEditViewModel
    var context: Context? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        viewModel = ViewModelProvider(this,
            ViewModelProvider.AndroidViewModelFactory(application))[MeetEditViewModel::class.java]

        context = this

        setContent {
            MeetEditScreen(viewModel = viewModel)
        }

        initIntent()
    }

    private fun initIntent() {
        viewModel.finishScreen.observe(this, EventObserver {
            finish()
        })
    }
}