package cn.mg.tianrun01.service.impl;

import cn.mg.tianrun01.dao.GoodPicDao;
import cn.mg.tianrun01.entity.GoodPic;
import cn.mg.tianrun01.service.GoodPicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;
@Service("goodPicService")
public class GoodPicServiceImpl implements GoodPicService {
    @Autowired
    @Qualifier("goodPicDao")
    private GoodPicDao goodPicDao;

    @Override
    public boolean add(GoodPic goodPic) {
        return goodPicDao.insert(goodPic)>0;
    }

    @Override
    public boolean remove(GoodPic goodPic) {
        return goodPicDao.delete(goodPic)>0;
    }

    @Override
    public boolean modify(GoodPic goodPic) {
        return goodPicDao.update(goodPic)>0;
    }

    @Override
    public List<GoodPic> findAll() {
        return goodPicDao.selectAll();
    }

    @Override
    public GoodPic findById(GoodPic goodPic) {
        return goodPicDao.selectByid(goodPic);
    }
}
