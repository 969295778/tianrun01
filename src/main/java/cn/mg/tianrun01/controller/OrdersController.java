package cn.mg.tianrun01.controller;

import cn.mg.tianrun01.dao.OrdersDao;
import cn.mg.tianrun01.entity.Goods;
import cn.mg.tianrun01.entity.Orders;
import cn.mg.tianrun01.entity.Users;
import cn.mg.tianrun01.service.GoodsService;
import cn.mg.tianrun01.service.OrdersService;
import cn.mg.tianrun01.service.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/admin/orders")
public class OrdersController {
    @Autowired
    @Qualifier("ordersService")
    private OrdersService ordersService;

    @Autowired
    private UsersService usersService;

    @RequestMapping("/list")
    public String list(Orders orders, Model model){
        List<Orders> list= ordersService.findAll();
        if (list!=null){
            model.addAttribute("ol",list);
            return "admin/orders/list";
        }else{
            return "admin/error";
        }
    }

    @RequestMapping("/add")
    public String add(Model model){
        List<Users> ulist= usersService.findAll();
        if (ulist!=null){
            model.addAttribute("ul",ulist);
            return "admin/orders/add";
        }else{
            return "admin/error";
        }

    }
    @RequestMapping("/save")
    public String save(Orders orders){
        if (ordersService.add(orders)){
            return "forward:/admin/orders/list";
        }else{
            return "admin/error";
        }
    }
    @RequestMapping("/delete")
    public String delete(Orders orders){
        if (ordersService.remove(orders)){
            return "forward:/admin/orders/list";
        }else{
            return "admin/error";
        }
    }
    @RequestMapping("/update")
    public String update(Orders orders,Model model){
        Orders temp=ordersService.findById(orders);
        if (temp!=null){
            model.addAttribute("tem",temp);
            return "admin/orders/update";
        }else{
            return "admin/error";
        }
    }
    @RequestMapping("/edit")
    public String edit(Orders orders){
        if (ordersService.modify(orders)){
            return "forward:/admin/orders/list";
        }else{
            return "admin.error";
        }
    }
}
