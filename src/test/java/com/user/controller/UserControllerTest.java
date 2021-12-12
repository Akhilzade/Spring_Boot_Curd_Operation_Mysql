package com.user.controller;

import com.user.model.User;
import com.user.services.UserServices;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(MockitoExtension.class)
class UserControllerTest {

    @InjectMocks
    UserController userController;

    @Mock
    UserServices userServices;

    User user;

    @BeforeEach
    void setUp() {
        user=new User();
        user.setId(1);
        user.setName("Akhil");
        user.setEmail("email@gmail.com");
        user.setPassword("12345");
        user.setAge(123);

    }

    @Test
    void getUser() {
       userServices.createUser(user);
    }

    @Test
    void getAll() {
        userServices.getUser();
    }

    @Test
    void getById() {
        userServices.getUserById(user.getId());
    }

    @Test
    void deleteById() {
        userServices.deleteById(user.getId());
    }

    @Test
    void updateUser(){ userServices.updateUser(user);}

}