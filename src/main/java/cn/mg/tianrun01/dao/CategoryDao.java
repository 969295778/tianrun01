package cn.mg.tianrun01.dao;

import cn.mg.tianrun01.entity.Category;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository("categoryDao") //<bean id="CategoryDao" class=></bean>
@Mapper
public interface CategoryDao {
    int insert(Category category);
    int delete(Category category);
    int update(Category category);
    List<Category> selectAll();
    Category selectById(Category category);

}
