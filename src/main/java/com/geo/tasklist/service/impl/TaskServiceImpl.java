package com.geo.tasklist.service.impl;

import com.geo.tasklist.domain.task.Task;
import com.geo.tasklist.service.TaskService;
import org.springframework.stereotype.Service;

import java.time.Duration;
import java.util.List;

@Service
public class TaskServiceImpl implements TaskService {

    @Override
    public Task getById(Long id) {
        return null;
    }

    @Override
    public List<Task> getAllByUserId(Long id) {
        return null;
    }

    @Override
    public List<Task> getAllSoonTasks(Duration duration) {
        return null;
    }

    @Override
    public Task update(Task task) {
        return null;
    }

    @Override
    public Task create(Task task, Long userId) {
        return null;
    }

    @Override
    public void delete(Long id) {

    }

}
