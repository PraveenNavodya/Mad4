package com.example.myapplication.ui

import androidx.lifecycle.ViewModel
import com.example.myapplication.data.TaskRepository

class TaskViewModel(private val repository: TaskRepository) : ViewModel() {

    var taskName: String = ""
    var taskDescription: String = ""

    var selectedPriority: Int = 0

    var selectedYear: Int = 0
    var selectedMonth: Int = 0
    var selectedDay: Int = 0

    fun addTask() {
        repository.addTask(taskName, taskDescription, selectedPriority, selectedYear, selectedMonth, selectedDay)
    }
}
