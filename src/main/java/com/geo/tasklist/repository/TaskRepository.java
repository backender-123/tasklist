package com.geo.tasklist.repository;

import com.geo.tasklist.domain.task.Task;
import org.springframework.data.repository.query.Param;

import java.sql.Timestamp;
import java.util.List;

public interface TaskRepository {

    List<Task> findAllByUserId(@Param("userId") Long userId);

    List<Task> findAllSoonTasks(@Param("start") Timestamp start,
                                @Param("end") Timestamp end);
    void assignTask(@Param("userId") Long userId, @Param("taskId") Long taskId);

    void addImage(@Param("id") Long id, @Param("fileName") String fileName);

}
