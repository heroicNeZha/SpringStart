package edu.ustc.SpringStart.tmall.controller;

import edu.ustc.SpringStart.tmall.pojo.Category;
import edu.ustc.SpringStart.tmall.service.CategoryService;
import edu.ustc.SpringStart.tmall.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping()
public class ForeController {
    @Autowired
    CategoryService categoryService;
    @Autowired
    ProductService productService;

    @RequestMapping("/home")
    public String home(Model model) {
        List<Category> categories = categoryService.list();
        productService.fill(categories);
        productService.fillByRow(categories);
        model.addAttribute("categories", categories);
        return "fore/home";
    }

}
