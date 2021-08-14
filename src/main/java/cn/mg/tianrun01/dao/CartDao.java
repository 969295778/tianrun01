package cn.mg.tianrun01.dao;

import cn.mg.tianrun01.entity.Cart;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository("cartDao")
@Mapper
public interface CartDao {
    int insert(Cart cart);
    int delete(Cart cart);
    int update(Cart cart);
    List<Cart> selectAll();
    Cart selectByid(Cart cart);
}
