package cdu.csf.dao;

import cdu.csf.model.User;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserDao {

    List<User> findAll();
}
