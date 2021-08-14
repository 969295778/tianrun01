package cn.mg.tianrun01.entity;

import java.io.Serializable;

public class GoodIntroduct implements Serializable {
    private Integer id;
    private String intr_pic;
    private Goods goods;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getIntr_pic() {
        return intr_pic;
    }

    public void setIntr_pic(String intr_pic) {
        this.intr_pic = intr_pic;
    }

    public Goods getGoods() {
        return goods;
    }

    public void setGoods(Goods goods) {
        this.goods = goods;
    }
}
