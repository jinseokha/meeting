package com.devseok.meeting.view.meet

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData
import com.devseok.meeting.utils.Event
import com.devseok.meeting.utils.SingleLiveEvent

class MeetAddViewModel(application: Application) : AndroidViewModel(application) {

    val context = getApplication<Application>()

    private val _finishScreen = SingleLiveEvent<Event<Boolean>>()
    val finishScreen: LiveData<Event<Boolean>>
        get() = _finishScreen

    fun back() {
        _finishScreen.value = Event(true)
    }


}