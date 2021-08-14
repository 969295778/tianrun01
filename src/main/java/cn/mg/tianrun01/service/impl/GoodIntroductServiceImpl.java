package cn.mg.tianrun01.service.impl;

import cn.mg.tianrun01.dao.GoodIntroductDao;
import cn.mg.tianrun01.entity.GoodIntroduct;
import cn.mg.tianrun01.service.GoodIntroductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;
@Service("goodIntroductService")
public class GoodIntroductServiceImpl implements GoodIntroductService {
    @Autowired
    @Qualifier("goodIntroductDao")
    private GoodIntroductDao goodIntroductDao;
    @Override
    public boolean add(GoodIntroduct goodIntroduct) {
        return goodIntroductDao.insert(goodIntroduct)>0;
    }

    @Override
    public boolean remove(GoodIntroduct goodIntroduct) {
        return goodIntroductDao.delete(goodIntroduct)>0;
    }

    @Override
    public boolean modify(GoodIntroduct goodIntroduct) {
        return goodIntroductDao.update(goodIntroduct)>0;
    }

    @Override
    public List<GoodIntroduct> findAll() {
        return goodIntroductDao.selectAll();
    }

    @Override
    public GoodIntroduct findById(GoodIntroduct goodIntroduct) {
        return goodIntroductDao.selectByid(goodIntroduct);
    }
}
