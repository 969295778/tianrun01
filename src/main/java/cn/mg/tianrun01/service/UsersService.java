package cn.mg.tianrun01.service;

import cn.mg.tianrun01.entity.Users;

import java.util.List;

public interface UsersService {
    boolean add(Users users);
    boolean remove(Users users);
    boolean modify(Users users);
    List<Users> findAll();
    Users findById(Users users);

    List<Users> findByLikeUn(Users users);
}
