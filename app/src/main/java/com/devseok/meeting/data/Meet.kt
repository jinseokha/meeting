package com.devseok.meeting.data

data class Meet(
    val title: String,
    val category: String?,
    val memo: String?,
    val member: Member?,
)
