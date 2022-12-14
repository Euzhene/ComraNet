package com.euzhene.comranet.chatRoom.data.remote.dto

import com.euzhene.comranet.chatRoom.domain.entity.ChatDataType
import com.google.firebase.database.ServerValue

data class FirebaseSendData(
    val timestamp: MutableMap<String, String> = ServerValue.TIMESTAMP,
    val senderUsername: String,
    val senderId:String,
    val type:ChatDataType,
    val data:Any,
)
