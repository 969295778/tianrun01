package cn.mg.tianrun01.service;

import cn.mg.tianrun01.entity.Cart;

import java.util.List;

public interface CartService {
    boolean add(Cart cart);
    boolean remove(Cart cart);
    boolean modify(Cart cart);
    List<Cart> findAll();
    Cart findById(Cart cart);
}
