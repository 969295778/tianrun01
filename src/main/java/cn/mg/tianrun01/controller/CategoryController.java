package cn.mg.tianrun01.controller;

import cn.mg.tianrun01.entity.Category;
import cn.mg.tianrun01.service.CategoryService;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;

@Controller
@RequestMapping("/admin/category")
public class CategoryController extends UpFileUtil{
    @Autowired
    @Qualifier("categoryService")
    private CategoryService categoryService;

    @RequestMapping("/list") //  /admin/category/list
    public String list(Integer pageNum,Integer pageSize,Model model){

        if(pageNum==null){//如果没有传入pageNum
            pageNum=1;
        }

        if(pageSize==null){//如果没有传入pageSize
            pageSize=5;
        }

        PageHelper.startPage(pageNum,pageSize);

        List<Category> list=categoryService.findAll();

        Page<Category> mypage=(Page<Category>)list;

        System.out.println(mypage.getPageNum());//获取当前页
        System.out.println(mypage.getPages());//获取总页数
        System.out.println(mypage.getPageSize());//获取页大小
        System.out.println(mypage.getTotal());//获取总记录数
        if (list!=null){
            model.addAttribute("cats",list);
            model.addAttribute("mypage",mypage);
            return "admin/category/list";
        }else{
            return "admin/erroe";
        }
    }

    @RequestMapping("/add")
    public String add(){
        return "admin/category/add";
    }

    @RequestMapping("/update")
    public String update(Category category,Model model) {
        Category temp=categoryService.findById(category);
        if (temp!=null) {
            model.addAttribute("upd",temp);
            return "admin/category/update";
        }else {
            return "admin/error";
        }
    }
    @RequestMapping("/edit")
    public String edit(Category category){
        if (categoryService.modify(category)){
            return "forward:/admin/category/list";
        }else{
            return "admin/error";
        }
    }
    @RequestMapping("/save")
    public String add(Category category, HttpServletRequest request){
        String fileName=upFile(request);//上传返回文件名
        if(fileName!=null){
            category.setLogo(fileName);
        }
        if (categoryService.add(category)){
            return "forward:/admin/category/list";  //转发前后缀失效
            // 累上yml中的前后缀 /templates/success.html
        }else{
            return "admin/error";
        }
    }
    @RequestMapping("/remove")
    public String remove(Category category) {
        if (categoryService.remove(category)) {
            return "forward:/admin/category/list";
        }else{
            return "admin/error";
        }
    }
}
