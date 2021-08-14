package cn.mg.tianrun01.controller;

import cn.mg.tianrun01.entity.GoodPic;
import cn.mg.tianrun01.service.GoodPicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/admin/goodpic")
public class GoodPicController {
    @Autowired
    @Qualifier("goodPicService")
    private GoodPicService goodPicService;

    @RequestMapping("/list")
    public String list(GoodPic goodPic, Model model){
        List<GoodPic> list= goodPicService.findAll();
        if (list!=null){
            model.addAttribute("lis",list);
            return "admin/goodpic/list";
        }else{
            return "admin/error";
        }
    }

    @RequestMapping("/add")
    public String add(){
        return "admin/goodpic/add";
    }

    @RequestMapping("/save")
    public String save(GoodPic goodPic){
        if (goodPicService.add(goodPic)){
            return "forward:/admin/goodpic/list";
        }else{
            return "admin/error";
        }
    }

    @RequestMapping("/remove")
    public String remove(GoodPic goodPic){
        if (goodPicService.remove(goodPic)){
            return "forward:/admin/goodpic/list";
        }else{
            return "admin/error";
        }
    }

    @RequestMapping("/update")
    public String update(GoodPic goodPic,Model model){
        GoodPic temp=goodPicService.findById(goodPic);
        if (temp!=null){
            model.addAttribute("tem",temp);
            return "admin/goodpic/update";
        }else{
            return "admin/error";
        }
    }

    @RequestMapping("/edit")
    public String edit(GoodPic goodPic){
        if (goodPicService.modify(goodPic)){
            return "forward:/admin/goodpic/list";
        }else{
            return "admin/error";
        }
    }
}
