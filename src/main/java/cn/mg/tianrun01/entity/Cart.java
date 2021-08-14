package cn.mg.tianrun01.entity;

import java.io.Serializable;

public class Cart implements Serializable {
    private Integer id;
    private Orders orders;
    private Goods goods;
    private Integer gcount;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Orders getOrders() {
        return orders;
    }

    public void setOrders(Orders orders) {
        this.orders = orders;
    }

    public Goods getGoods() {
        return goods;
    }

    public void setGoods(Goods goods) {
        this.goods = goods;
    }

    public Integer getGcount() {
        return gcount;
    }

    public void setGcount(Integer gcount) {
        this.gcount = gcount;
    }
}
