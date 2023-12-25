package com.geo.tasklist.service;

import com.geo.tasklist.domain.user.User;

public interface UserService {

    User getById(Long id);

    User getByUsername(String username);

    User update(User user);

    User create(User user);

    boolean isTaskOwner(Long userId, Long taskId);

    User getTaskAuthor(Long taskId);

    void delete(Long id);

}