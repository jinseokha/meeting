package com.devseok.meeting.data

class MeetEx {
    fun getAllData(): List<Meet> {
        return listOf(
            Meet(
                title = "모임1",
                category = "활동",
                memo = "메모",
                member = null
            ),
            Meet(
                title = "모임2",
                category = "활2",
                memo = "메모2222",
                member = null
            ),
            Meet(
                title = "모임3",
                category = "활동33",
                memo = "메모4454",
                member = null
            )
        )
    }
}