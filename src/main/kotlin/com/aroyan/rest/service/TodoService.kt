package com.aroyan.rest.service

import com.aroyan.rest.model.Todo
import org.springframework.data.repository.CrudRepository
import org.springframework.stereotype.Service
import kotlin.jvm.optionals.toList

interface TodoRepository: CrudRepository<Todo, String>

@Service
class TodoService(val db: TodoRepository) {
    fun findTodos(): List<Todo> = db.findAll().toList()

    fun findTodoById(id: String): List<Todo>  = db.findById(id).toList()

    fun save(todo: Todo) {
        db.save(todo)
    }
}