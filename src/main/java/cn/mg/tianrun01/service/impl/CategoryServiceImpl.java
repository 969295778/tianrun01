package cn.mg.tianrun01.service.impl;

import cn.mg.tianrun01.dao.CategoryDao;
import cn.mg.tianrun01.entity.Category;
import cn.mg.tianrun01.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("categoryService") //<bean id="categoryService" class="..."></bean>
public class CategoryServiceImpl implements CategoryService {
    @Autowired //自动注入
    @Qualifier("categoryDao")
    private CategoryDao categoryDao;
    @Override
    public boolean add(Category category) {
        return categoryDao.insert(category)>0;
    }

    @Override
    public boolean remove(Category category) {
        return categoryDao.delete(category)>0;
    }

    @Override
    public boolean modify(Category category) {
        return categoryDao.update(category)>0;
    }

    @Override
    public List<Category> findAll() {
        return categoryDao.selectAll();
    }

    @Override
    public Category findById(Category category) {
        return categoryDao.selectById(category);
    }
}
