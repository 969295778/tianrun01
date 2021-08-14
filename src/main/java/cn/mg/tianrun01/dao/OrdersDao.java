package cn.mg.tianrun01.dao;

import cn.mg.tianrun01.entity.Orders;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository("ordersDao")
@Mapper
public interface OrdersDao {
    int insert(Orders orders);
    int delete(Orders orders);
    int update(Orders orders);
    List<Orders> selectAll();
    Orders selectByid(Orders orders);
}
