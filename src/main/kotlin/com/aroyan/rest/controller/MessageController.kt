package com.aroyan.rest.controller

import com.aroyan.rest.model.Message
import com.aroyan.rest.service.MessageService
import org.springframework.web.bind.annotation.*

@RestController
class MessageController (val service: MessageService) {
    @GetMapping("/")
    fun index(): List<Message> = service.findMessages()

    @GetMapping("/{id}")
    fun index(@PathVariable id: String): List<Message> =
        service.findMessageById(id)

    @PostMapping("/")
    fun post(@RequestBody message: Message) {
        service.save(message)
    }

}