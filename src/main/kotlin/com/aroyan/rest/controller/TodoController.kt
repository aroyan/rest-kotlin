package com.aroyan.rest.controller

import com.aroyan.rest.model.Todo
import com.aroyan.rest.service.TodoService
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RestController

@RestController
class TodoController(val service: TodoService) {
    @GetMapping("/todo")
    fun index(): List<Todo> = listOf(
        Todo("123", "Hello", false),
        Todo("124", "Hello World", true)
    )

    @GetMapping("/todo/{id}")
    fun index(@PathVariable id: String): List<Todo> = service.findTodoById(id)

    @PostMapping("/todo")
    fun post(@RequestBody todo: Todo){
        service.save(todo)
    }
}