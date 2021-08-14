package cn.mg.tianrun01.service;

import cn.mg.tianrun01.entity.Goods;

import java.util.List;

public interface GoodsService {
    boolean add(Goods goods);
    boolean remove(Goods goods);
    boolean modify(Goods goods);
    List<Goods> findAll();
    Goods findById(Goods goods);
}
