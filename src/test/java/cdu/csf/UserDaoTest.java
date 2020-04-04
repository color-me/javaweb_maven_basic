package cdu.csf;

import cdu.csf.dao.UserDao;
import cdu.csf.model.User;
import org.junit.Test;

import javax.annotation.Resource;
import java.util.List;

public class UserDaoTest extends BaseJUnitTest{
    @Resource
    private UserDao userDao;

    @Test
    public void testFindAll(){
        List<User> userList=userDao.findAll();
        System.out.println(userList.size());
    }
}
