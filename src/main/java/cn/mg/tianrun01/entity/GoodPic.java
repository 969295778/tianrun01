package cn.mg.tianrun01.entity;

import java.io.Serializable;

public class GoodPic implements Serializable {
    private Integer id;
    private String adv_pic;
    private Goods goods;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getAdv_pic() {
        return adv_pic;
    }

    public void setAdv_pic(String adv_pic) {
        this.adv_pic = adv_pic;
    }

    public Goods getGoods() {
        return goods;
    }

    public void setGoods(Goods goods) {
        this.goods = goods;
    }
}
