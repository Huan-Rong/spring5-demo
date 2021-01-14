package site.bulibucai.dao;

import org.springframework.stereotype.Repository;
import site.bulibucai.bean.User;

@Repository
public class UserDaoImpl implements UserDao {
    @Override
    public User getOne(Integer id) {
        return new User(id);
    }
}
