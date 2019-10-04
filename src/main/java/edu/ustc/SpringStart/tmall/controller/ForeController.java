package edu.ustc.SpringStart.tmall.controller;

import edu.ustc.SpringStart.tmall.pojo.Category;
import edu.ustc.SpringStart.tmall.pojo.User;
import edu.ustc.SpringStart.tmall.service.CategoryService;
import edu.ustc.SpringStart.tmall.service.ProductService;
import edu.ustc.SpringStart.tmall.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.util.HtmlUtils;

import java.util.List;

@Controller
@RequestMapping()
public class ForeController {
    @Autowired
    CategoryService categoryService;
    @Autowired
    ProductService productService;
    @Autowired
    UserService userService;

    @RequestMapping("/home")
    public String home(Model model) {
        List<Category> categories = categoryService.list();
        productService.fill(categories);
        productService.fillByRow(categories);
        model.addAttribute("categories", categories);
        return "fore/home";
    }

    @RequestMapping("/register")
    public String register(Model model, User user) {
        user.setName(HtmlUtils.htmlEscape(user.getName()));
        if (userService.isExist(user.getName())) {
            String m = "用户名已经被使用！";
            model.addAttribute("msg", m);
            model.addAttribute("user", null);
            return "redirect:registerPage";
        } else {
            userService.add(user);
            return "redirect:registerSuccessPage";
        }
    }

    @RequestMapping("forelogin")
    public String login(Model model, User user) {
        user.setName(HtmlUtils.htmlEscape(user.getName()));
        User aUser = userService.get(user.getName(), user.getPassword());
        if (null != aUser) {
            model.addAttribute("user", aUser);
            return "redirect:home";
        }else{
            model.addAttribute("msg", "用户名密码错误");
            return "fore/login";
        }
    }

}
