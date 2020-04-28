package cdu.csf.service;

import cdu.csf.model.User;

import java.util.List;

public interface UserService {

    List<User> findAll();

    User checklogin(User user);

    User find(int id);

    boolean add(User user);

    boolean modify(User user);

    boolean delete(int id);

    int count();
}
