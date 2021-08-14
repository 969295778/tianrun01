package cn.mg.tianrun01.controller;

import cn.mg.tianrun01.entity.Category;
import cn.mg.tianrun01.entity.Goods;
import cn.mg.tianrun01.service.CategoryService;
import cn.mg.tianrun01.service.GoodsService;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/admin/goods")
public class GoodsController {
    @Autowired
    @Qualifier("goodsService")
    private GoodsService goodsService;

    @Autowired
    private CategoryService categoryService;

    @RequestMapping("/list")
    public String list(Goods goods, Model model){
        List<Goods> list=goodsService.findAll();
        if (list!=null){
            model.addAttribute("lis",list);
            return "admin/goods/list";
        }else{
            return "admin/error";
        }
    }
    @RequestMapping("/add")
    public String add(Model model){
        List<Category> categoryList= categoryService.findAll();
        if (categoryList!=null){
            model.addAttribute("catlist",categoryList);
            return "admin/goods/add";
        }else{
            return "admin/error";
        }
    }
    @RequestMapping("/save")
    public String save(Goods goods){
        if (goodsService.add(goods)){
            return "forward:/admin/goods/list";
        }else {
            return  "admin/error";
        }
    }

    @RequestMapping("/remove")
    public String remove(Goods goods){
        if (goodsService.remove(goods)){
            return "forward:/admin/goods/list";
        }else {
            return "admin/error";
        }
    }

    @RequestMapping("/update")
    public String update(Goods goods,Model model){
        Goods temp=goodsService.findById(goods);
        if (temp!=null){
            model.addAttribute("tem",temp);
            return "admin/goods/update";
        }else {
            return "admin/error";
        }
    }

    @RequestMapping("/edit")
    public String edit(Goods goods){
        if (goodsService.modify(goods)){
            return "forward:/admin/goods/list";
        }else{
            return "admin/error";
        }
    }
}
