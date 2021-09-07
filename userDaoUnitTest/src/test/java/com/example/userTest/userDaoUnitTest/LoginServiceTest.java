package com.example.userTest.userDaoUnitTest;

import com.example.userTest.userDaoUnitTest.model.User;
import com.example.userTest.userDaoUnitTest.repo.UserDao;
import com.example.userTest.userDaoUnitTest.service.LoginService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class LoginServiceTest {

    @Mock
    private UserDao userDao;

    @InjectMocks
    private LoginService loginService;

    @Test
    public void shouldTrueIfUserAndPasswordIsTrue()
    {
        String userName = "tugba";
        String userPassword = "123";

        User user = new User(userName,userPassword);

        when(userDao.findUserByName(userName)).thenReturn(user);

        assertTrue(loginService.login(userName,userPassword));
    }
}
