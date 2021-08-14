package cn.mg.tianrun01.service.impl;

import cn.mg.tianrun01.dao.OrdersDao;
import cn.mg.tianrun01.entity.Orders;
import cn.mg.tianrun01.service.OrdersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;
@Service("ordersService")
public class OrdersServiceImpl implements OrdersService {
    @Autowired
    @Qualifier("ordersDao")
    private OrdersDao ordersDao;
    @Override
    public boolean add(Orders orders) {
        return ordersDao.insert(orders)>0;
    }

    @Override
    public boolean remove(Orders orders) {
        return ordersDao.delete(orders)>0;
    }

    @Override
    public boolean modify(Orders orders) {
        return ordersDao.update(orders)>0;
    }

    @Override
    public List<Orders> findAll() {
        return ordersDao.selectAll();
    }

    @Override
    public Orders findById(Orders orders) {
        return ordersDao.selectByid(orders);
    }
}
