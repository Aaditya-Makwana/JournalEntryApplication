package com.aaditya.journalApp.service;

import com.aaditya.journalApp.repository.UserRepository;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.ArgumentMatchers;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;

import static org.mockito.Mockito.*;

public class UserDetailServiceImplTests {
    @InjectMocks
    private UserDetailServiceImpl userDetailServiceImpl;

    @Mock
    private UserRepository userRepository;

    @BeforeEach
    void setUp(){
        MockitoAnnotations.initMocks(this);
    }
//
//    @Test
//    void loadUserByUserNameTest(){
//        when(userRepository.findByUsername(ArgumentMatchers.anyString()))
//                .thenReturn(new com.aaditya.journalApp.entity.User("Ram", "testpass"));
//        UserDetails user = userDetailServiceImpl.loadUserByUsername("Ram");
//
//        Assertions.assertNotNull(user);
//    }
}
