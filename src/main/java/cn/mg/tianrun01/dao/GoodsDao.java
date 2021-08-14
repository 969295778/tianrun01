package cn.mg.tianrun01.dao;

import cn.mg.tianrun01.entity.Goods;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository("goodsDao")
@Mapper
public interface GoodsDao {
    int insert(Goods goods);
    int delete(Goods goods);
    int update(Goods goods);
    List<Goods> selectAll();
    Goods selectById(Goods goods);
}
