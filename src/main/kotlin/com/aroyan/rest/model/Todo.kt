package com.aroyan.rest.model

import org.springframework.data.annotation.Id
import org.springframework.data.relational.core.mapping.Table

@Table("TODOS")
data class Todo(@Id var id: String?, val name: String, val isCompleted: Boolean?)