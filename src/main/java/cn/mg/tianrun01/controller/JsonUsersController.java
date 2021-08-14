package cn.mg.tianrun01.controller;

import cn.mg.tianrun01.entity.Users;
import cn.mg.tianrun01.service.UsersService;
import cn.mg.tianrun01.util.AjaxResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class JsonUsersController {

    @Autowired
    private UsersService usersService;

    @RequestMapping(value="/likeusers",method = RequestMethod.GET)
    public AjaxResponse findByLikeUn(Users users){
       List<Users>  temp=usersService.findByLikeUn(users);
       if(temp!=null){
           return AjaxResponse.success(temp);
       }else{
           return AjaxResponse.error();
       }
    }



}
