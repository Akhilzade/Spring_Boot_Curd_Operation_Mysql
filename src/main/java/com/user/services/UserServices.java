package com.user.services;

import com.user.model.User;

import java.util.List;

public interface UserServices {

    public User createUser(User user);

    public List<User> getUser();

    public User getUserById(long id);

    public void deleteById(long id);

    public User updateUser(User user);




}
