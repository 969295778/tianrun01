package cn.mg.tianrun01.service;

import cn.mg.tianrun01.entity.GoodIntroduct;

import java.util.List;

public interface GoodIntroductService {
    boolean add(GoodIntroduct goodIntroduct);
    boolean remove(GoodIntroduct goodIntroduct);
    boolean modify(GoodIntroduct goodIntroduct);
    List<GoodIntroduct> findAll();
    GoodIntroduct findById(GoodIntroduct goodIntroduct);
}
