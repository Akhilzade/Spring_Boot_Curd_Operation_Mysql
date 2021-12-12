package com.user.services;

import com.user.mapper.MyRepository;
import com.user.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServicesImpl implements UserServices {

    @Autowired
    private MyRepository myRepository;

    @Override
    public User createUser(User user) {
        return myRepository.save(user);
    }

    @Override
    public List<User> getUser() {
        return myRepository.findAll();
    }

    @Override
    public User getUserById(long id) {
        return myRepository.findById(id).orElse(null);
    }

    @Override
    public void deleteById(long id) {
        myRepository.deleteById(id);
    }

    @Override
    public User updateUser(User user) {

        return myRepository.save(user);
    }


}
