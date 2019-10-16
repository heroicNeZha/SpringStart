package edu.ustc.SpringStart.tmall.controller;

import com.alibaba.druid.stat.TableStat;
import edu.ustc.SpringStart.tmall.pojo.*;
import edu.ustc.SpringStart.tmall.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.util.HtmlUtils;

import javax.servlet.http.HttpSession;
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
    @Autowired
    ProductImageService productImageService;
    @Autowired
    PropertyValueService propertyValueService;
    @Autowired
    ReviewService reviewService;

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
    public String login(Model model, User user, HttpSession session) {
        user.setName(HtmlUtils.htmlEscape(user.getName()));
        User aUser = userService.get(user.getName(), user.getPassword());
        if (null != aUser) {
            session.setAttribute("user", aUser);
            return "redirect:home";
        } else {
            model.addAttribute("msg", "用户名密码错误");
            return "fore/login";
        }
    }

    @RequestMapping("forelogout")
    public String logout(HttpSession session) {
        session.removeAttribute("user");
        return "redirect:home";
    }

    @RequestMapping("foreproduct")
    public String product(Model model, int pid) {
        Product product = productService.get(pid);
        List<ProductImage> productSingleImages = productImageService.list(product.getId(), ProductImageService.type_single);
        List<ProductImage> productDetailImages = productImageService.list(product.getId(), ProductImageService.type_detail);
        product.setProductSingleImages(productSingleImages);
        product.setProductDetailImages(productDetailImages);

        List<PropertyValue> propertyValues = propertyValueService.list(pid);
        List<Review> reviews = reviewService.list(pid);
        productService.setSaleAndReviewNumber(product);
        model.addAttribute("product", product);
        model.addAttribute("propertyValues", propertyValues);
        model.addAttribute("reviews", reviews);
        return "fore/product";
    }
}
