package com.example.android.architecture.blueprints.todoapp.domain.usecase

import com.example.android.architecture.blueprints.todoapp.data.Task
import com.example.android.architecture.blueprints.todoapp.domain.repository.TasksRepository
import com.example.android.architecture.blueprints.todoapp.util.wrapEspressoIdlingResource

class SaveTaskUseCase(
    private val tasksRepository: TasksRepository
) {
    suspend operator fun invoke(task: Task) {

        wrapEspressoIdlingResource {
            return tasksRepository.saveTask(task)
        }
    }

}