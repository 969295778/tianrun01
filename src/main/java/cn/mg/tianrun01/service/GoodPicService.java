package cn.mg.tianrun01.service;

import cn.mg.tianrun01.entity.GoodPic;

import java.util.List;

public interface GoodPicService {
    boolean add(GoodPic goodPic);
    boolean remove(GoodPic goodPic);
    boolean modify(GoodPic goodPic);
    List<GoodPic> findAll();
    GoodPic findById(GoodPic goodPic);
}
