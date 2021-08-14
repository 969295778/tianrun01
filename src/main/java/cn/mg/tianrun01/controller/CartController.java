package cn.mg.tianrun01.controller;

import cn.mg.tianrun01.entity.Cart;
import cn.mg.tianrun01.entity.Goods;
import cn.mg.tianrun01.entity.Orders;
import cn.mg.tianrun01.service.CartService;
import cn.mg.tianrun01.service.GoodsService;
import cn.mg.tianrun01.service.OrdersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/admin/cart")
public class CartController {
    @Autowired
    private CartService cartService;

    @Autowired
    private OrdersService ordersService;

    @Autowired
    private GoodsService goodsService;

    @RequestMapping("/list")
    public String list(Model model){
        List<Cart> cartList= cartService.findAll();
        if (cartList!=null){
            model.addAttribute("cl",cartList);
            return "admin/cart/list";
        }else{
            return "admin/error";
        }
    }
    @RequestMapping("/add")
    public String add(Model model){
        List<Orders> ulist= ordersService.findAll();
        List<Goods> glist=goodsService.findAll();
        if (ulist!=null&&glist!=null){
            model.addAttribute("glt",glist);
            model.addAttribute("clt",ulist);
            return "admin/cart/add";
        }else{
            return "admin/error";
        }
    }

    @RequestMapping("/save")
    public String save(Cart cart){
        if (cartService.add(cart)){
            return "forward:/admin/cart/list";
        }else{
            return "admin/error";
        }
    }
}
