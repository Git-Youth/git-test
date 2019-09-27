package controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("user")
public class UserController  {
    public static void main(String[] args) {
        System.out.println("这个是dev1分支");
        System.out.println("master");
    }
}
