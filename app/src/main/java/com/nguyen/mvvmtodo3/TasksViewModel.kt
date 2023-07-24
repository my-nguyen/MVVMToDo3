package com.nguyen.mvvmtodo3

import androidx.lifecycle.ViewModel
import androidx.lifecycle.asLiveData
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class TasksViewModel @Inject constructor(private val taskDao: TaskDao): ViewModel() {
    // turn Flow into LiveData
    val tasks = taskDao.getTasks().asLiveData()
}