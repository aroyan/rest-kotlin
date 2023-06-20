package com.aroyan.rest.service

import com.aroyan.rest.model.Message
import org.springframework.data.repository.CrudRepository
import org.springframework.stereotype.Service
import java.util.*

interface MessageRepository: CrudRepository<Message, String>

@Service
class MessageService(val db: MessageRepository) {
    fun findMessages(): List<Message> = db.findAll().toList()

    fun findMessageById(id: String): List<Message> = db.findById(id).toList()

    fun save(message: Message) {
        db.save(message)
    }

    fun <T : Any> Optional<out T>.toList(): List<T> =
        if (isPresent) listOf(get()) else emptyList()
}

