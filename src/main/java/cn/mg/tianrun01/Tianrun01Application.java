package cn.mg.tianrun01;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@Controller
public class Tianrun01Application {

    @RequestMapping("/")
    public String home(){
        return "admin/index";
    }//   /templates/admin/index.html

    public static void main(String[] args) {
        SpringApplication.run(Tianrun01Application.class, args);
    }

}
