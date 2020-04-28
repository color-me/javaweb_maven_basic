package cdu.csf.dao;

import cdu.csf.model.User;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserDao {

    List<User> findAll();
    User findByNameAndPwd(User user);
    int insert(User user);
    int update(User user);
    int delete(int id);
    User find(int id);
    int count();
}
