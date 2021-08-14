package cn.mg.tianrun01.controller;

import cn.mg.tianrun01.entity.Users;
import cn.mg.tianrun01.service.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/admin/users")
public class UsersController {
    @Autowired
    @Qualifier("usersService")
    private UsersService usersService;

    @RequestMapping("/list")
    public String list(Model model){
        List<Users> list=usersService.findAll();
        if (list!=null){
            model.addAttribute("cts",list);
            return "admin/users/list";
        }else{
            return "admin/error";
        }
    }

    @RequestMapping("/save")
    public String save(Users users){
        if (usersService.add(users)){
            return "forward:/admin/users/list";
        }else{
            return "admin/error";
        }
    }
    @RequestMapping("/add")
    public String add(){
        return "admin/users/add";
    }

    @RequestMapping("/update")
    public String update(Users users,Model model){
        Users temp=usersService.findById(users);
        if (temp!=null){
            model.addAttribute("upd",temp);
            return "admin/users/update";
        }
        return "admin/error";
    }
    @RequestMapping("/edit")
    public String edit(Users users){
        if (usersService.modify(users)){
            return "forward:/admin/users/list";
        }else{
            return "admin/error";
        }
    }

    @RequestMapping("/remove")
    public String remove(Users users){
        if (usersService.remove(users)){
            return "forward:/admin/users/list";
        }else{
            return "admin/error";
        }
    }
    //http://localhost:8080/admin/users/ajax
    @RequestMapping("/ajax")
    public String  ajax(){
        return "admin/users/ajax";
    }
}
