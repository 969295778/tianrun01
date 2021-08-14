package cn.mg.tianrun01.dao;

import cn.mg.tianrun01.entity.GoodIntroduct;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;
@Repository("goodIntroductDao")
@Mapper
public interface GoodIntroductDao {
    int insert(GoodIntroduct goodIntroduct);
    int delete(GoodIntroduct goodIntroduct);
    int update(GoodIntroduct goodIntroduct);
    List<GoodIntroduct> selectAll();
    GoodIntroduct selectByid(GoodIntroduct goodIntroduct);
}
