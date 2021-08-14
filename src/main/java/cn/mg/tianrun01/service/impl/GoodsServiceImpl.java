package cn.mg.tianrun01.service.impl;

import cn.mg.tianrun01.dao.GoodsDao;
import cn.mg.tianrun01.entity.Goods;
import cn.mg.tianrun01.service.GoodsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("goodsService")
public class GoodsServiceImpl implements GoodsService {
    @Autowired
    @Qualifier("goodsDao")
    private GoodsDao goodsDao;
    @Override
    public boolean add(Goods goods) {
        return goodsDao.insert(goods)>0;
    }

    @Override
    public boolean remove(Goods goods) {
        return goodsDao.delete(goods)>0;
    }

    @Override
    public boolean modify(Goods goods) {
        return goodsDao.update(goods)>0;
    }

    @Override
    public List<Goods> findAll() {
        return goodsDao.selectAll();
    }

    @Override
    public Goods findById(Goods goods) {
        return goodsDao.selectById(goods);
    }
}
