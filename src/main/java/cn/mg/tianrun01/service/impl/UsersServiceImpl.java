package cn.mg.tianrun01.service.impl;

import cn.mg.tianrun01.dao.UsersDao;
import cn.mg.tianrun01.entity.Users;
import cn.mg.tianrun01.service.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;
@Service("usersService")
public class UsersServiceImpl implements UsersService {
    @Autowired
    @Qualifier("usersDao")
    private UsersDao usersDao;
    @Override
    public boolean add(Users users) {
        return usersDao.insert(users)>0;
    }

    @Override
    public boolean remove(Users users) {
        return usersDao.delete(users)>0;
    }

    @Override
    public boolean modify(Users users) {
        return usersDao.update(users)>0;
    }

    @Override
    public List<Users> findAll() {
        return usersDao.selectAll();
    }

    @Override
    public Users findById(Users users) {
        return usersDao.selectById(users);
    }

    @Override
    public List<Users> findByLikeUn(Users users) {
        return usersDao.selectByLikeUn(users);
    }
}
