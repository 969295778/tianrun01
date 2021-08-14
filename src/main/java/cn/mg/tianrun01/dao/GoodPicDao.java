package cn.mg.tianrun01.dao;

import cn.mg.tianrun01.entity.GoodPic;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository("goodPicDao")
@Mapper
public interface GoodPicDao {
    int insert(GoodPic gPic);
    int delete(GoodPic gPic);
    int update(GoodPic gPic);
    List<GoodPic> selectAll();
    GoodPic selectByid(GoodPic gPic);
}
