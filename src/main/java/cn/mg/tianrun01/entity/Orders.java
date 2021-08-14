package cn.mg.tianrun01.entity;

import java.io.Serializable;

public class Orders implements Serializable {
    private Integer id;
    private Users users;
    private Double price;
    private String savename;
    private String savephone;
    private String saveaddr;
    private Integer status;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Users getUsers() {
        return users;
    }

    public void setUsers(Users users) {
        this.users = users;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getSavename() {
        return savename;
    }

    public void setSavename(String savename) {
        this.savename = savename;
    }

    public String getSavephone() {
        return savephone;
    }

    public void setSavephone(String savephone) {
        this.savephone = savephone;
    }

    public String getSaveaddr() {
        return saveaddr;
    }

    public void setSaveaddr(String saveaddr) {
        this.saveaddr = saveaddr;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }
}
