package site.bulibucai.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import site.bulibucai.bean.User;
import site.bulibucai.dao.UserDao;

@Service
public class UserService {

    private UserDao userDao;

    @Autowired
    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    public User getOne(Integer id) {
        return userDao.getOne(id);
    }
}
