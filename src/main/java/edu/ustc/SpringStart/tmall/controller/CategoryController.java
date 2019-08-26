package edu.ustc.SpringStart.tmall.controller;

import edu.ustc.SpringStart.tmall.pojo.Category;
import edu.ustc.SpringStart.tmall.service.CategoryService;
import edu.ustc.SpringStart.tmall.util.Page;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/tmall")
public class CategoryController {
    @Autowired
    CategoryService categoryService;

    @RequestMapping("/admin_category_list")
    public String list(Model model, Page page) {
        page.setTotal(categoryService.total());
        List<Category> categories = categoryService.list(page);
        model.addAttribute("categories", categories);
        model.addAttribute("page", page);
        return "admin/listCategory";
    }
}
