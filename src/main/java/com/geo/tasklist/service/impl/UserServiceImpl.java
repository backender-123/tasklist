package com.geo.tasklist.service.impl;

import com.geo.tasklist.domain.user.User;
import com.geo.tasklist.service.UserService;

public class UserServiceImpl implements UserService {

    @Override
    public User getById(Long id) {
        return null;
    }

    @Override
    public User getByUsername(String username) {
        return null;
    }

    @Override
    public User update(User user) {
        return null;
    }

    @Override
    public User create(User user) {
        return null;
    }

    @Override
    public boolean isTaskOwner(Long userId, Long taskId) {
        return false;
    }

    @Override
    public User getTaskAuthor(Long taskId) {
        return null;
    }

    @Override
    public void delete(Long id) {

    }

}
