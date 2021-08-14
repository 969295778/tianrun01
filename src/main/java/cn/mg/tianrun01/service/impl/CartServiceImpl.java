package cn.mg.tianrun01.service.impl;

import cn.mg.tianrun01.dao.CartDao;
import cn.mg.tianrun01.entity.Cart;
import cn.mg.tianrun01.service.CartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;
@Service("cartService")
public class CartServiceImpl implements CartService {
    @Autowired
    @Qualifier("cartDao")
    private CartDao cartDao;
    @Override
    public boolean add(Cart cart) {
        return cartDao.insert(cart)>0;
    }

    @Override
    public boolean remove(Cart cart) {
        return cartDao.delete(cart)>0;
    }

    @Override
    public boolean modify(Cart cart) {
        return cartDao.update(cart)>0;
    }

    @Override
    public List<Cart> findAll() {
        return cartDao.selectAll();
    }

    @Override
    public Cart findById(Cart cart) {
        return cartDao.selectByid(cart);
    }
}
