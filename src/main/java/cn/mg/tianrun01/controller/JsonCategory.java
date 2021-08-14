package cn.mg.tianrun01.controller;

import cn.mg.tianrun01.entity.Category;
import cn.mg.tianrun01.service.CategoryService;
import cn.mg.tianrun01.util.AjaxResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController// @Controller+@ResonseBody
@RequestMapping("/api")
@CrossOrigin   //跨域访问
public class JsonCategory {
    @Autowired
    private CategoryService categoryService;

    @RequestMapping(value = "/category",method = RequestMethod.POST)
    public AjaxResponse add(Category category){
        if(categoryService.add(category)){
            return AjaxResponse.success();
        }else{
            return AjaxResponse.error();
        }
    }

    @RequestMapping(value = "/category",method = RequestMethod.DELETE)
    public AjaxResponse remove(Category category){
        if(categoryService.remove(category)){
            return AjaxResponse.success();
        }else{
            return AjaxResponse.error();
        }
    }

    @RequestMapping(value = "/category",method = RequestMethod.PUT)
    public AjaxResponse modify(Category category){
        if(categoryService.remove(category)){
            return AjaxResponse.success();
        }else{
            return AjaxResponse.error();
        }
    }

    @RequestMapping(value = "/category",method = RequestMethod.GET)
    public AjaxResponse list(Category category){

        List<Category> list=categoryService.findAll();
        if(list!=null){
            return AjaxResponse.success(list);
        }else{
            return AjaxResponse.error();
        }
    }

    @RequestMapping(value = "/category/{id}",method = RequestMethod.GET)
    public AjaxResponse findById(@PathVariable("id") Integer id){
        Category category=new Category();
        category.setId(id);
        Category c=categoryService.findById(category);
        if(c!=null){
            return AjaxResponse.success(c);
        }else{
            return AjaxResponse.error();
        }
    }






}
