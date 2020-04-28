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
    private UserDao userDao;

    @Override
    public List<User> findAll() {
        return userDao.findAll();
    }

    @Override
    public User checklogin(User user) {
        return userDao.findByNameAndPwd(user);
    }

    @Override
    public User find(int id) {
        return userDao.find(id);
    }

    @Override
    public boolean add(User user) {
        return userDao.insert(user) == 1 ? true : false;
    }

    @Override
    public boolean modify(User user) {
        return userDao.update(user) == 1 ? true : false;
    }

    @Override
    public boolean delete(int id) {
        return userDao.delete(id) == 1 ? true : false;
    }

    @Override
    public int count() {
        return userDao.count();
    }
}
