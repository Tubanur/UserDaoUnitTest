package com.example.userTest.userDaoUnitTest.service;

import com.example.userTest.userDaoUnitTest.model.User;
import com.example.userTest.userDaoUnitTest.repo.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LoginService {

    @Autowired
    private UserDao userDao;

    public Boolean login(String userName, String userPassword)
    {
        User user = userDao.findUserByName(userName);
        if(user.getUserName().equals(userName) && user.getUserPassword().equals(userPassword))
            return true;
        return false;
    }
}
