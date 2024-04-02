package com.devseok.meeting.view.main

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData
import com.devseok.meeting.utils.Event
import com.devseok.meeting.utils.SingleLiveEvent

class MainViewModel(application: Application) : AndroidViewModel(application)  {

    val context = getApplication<Application>()

    private val _goAddScreen = SingleLiveEvent<Event<Boolean>>()
    val goAddScreen: LiveData<Event<Boolean>>
        get() = _goAddScreen

    fun goMeetAdd() {
        _goAddScreen.value = Event(true)
    }

}