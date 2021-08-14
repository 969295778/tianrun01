package cn.mg.tianrun01.service;


import cn.mg.tianrun01.entity.Category;

import java.util.List;

public interface CategoryService {
    boolean add(Category category);
    boolean remove(Category category);
    boolean modify(Category category);
    List<Category> findAll();
    Category findById(Category category);

}
