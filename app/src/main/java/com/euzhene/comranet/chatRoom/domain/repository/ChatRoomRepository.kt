package com.euzhene.comranet.chatRoom.domain.repository

import android.net.Uri
import androidx.paging.PagingData
import com.euzhene.comranet.chatRoom.domain.entity.ChatData
import com.euzhene.comranet.util.Response
import com.google.firebase.auth.FirebaseUser
import kotlinx.coroutines.flow.Flow

interface ChatRoomRepository {
    fun getChatData(): Flow<PagingData<ChatData>>
    suspend fun sendChatImage(imageUri: Uri): Response<Boolean>
    suspend fun sendChatMessage(message: String): Response<Boolean>
    fun observeChatData(): Flow<ChatData>

    fun setUser(user: FirebaseUser)

}