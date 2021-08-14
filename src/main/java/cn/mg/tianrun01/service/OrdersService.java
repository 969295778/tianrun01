package cn.mg.tianrun01.service;

import cn.mg.tianrun01.entity.Orders;

import java.util.List;

public interface OrdersService {
    boolean add(Orders orders);
    boolean remove(Orders orders);
    boolean modify(Orders orders);
    List<Orders> findAll();
    Orders findById(Orders orders);
}
