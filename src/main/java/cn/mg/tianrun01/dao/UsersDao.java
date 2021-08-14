package cn.mg.tianrun01.dao;

import cn.mg.tianrun01.entity.Users;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository("usersDao")
@Mapper
public interface UsersDao {
    int insert(Users users);
    int delete(Users users);
    int update(Users users);
    List<Users> selectAll();
    Users selectById(Users users);
    List<Users> selectByLikeUn(Users users);
}
