package cdu.csf.service.impl;

import cdu.csf.dao.UserDao;
import cdu.csf.model.User;
import cdu.csf.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Resource
    UserDao userDao;

    @Override
    public List<User> findAll() {
        return userDao.findAll();
    }
}
