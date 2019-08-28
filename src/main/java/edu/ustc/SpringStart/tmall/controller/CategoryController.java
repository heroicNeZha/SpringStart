package edu.ustc.SpringStart.tmall.controller;

import edu.ustc.SpringStart.tmall.pojo.Category;
import edu.ustc.SpringStart.tmall.service.CategoryService;
import edu.ustc.SpringStart.tmall.util.ImageUtil;
import edu.ustc.SpringStart.tmall.util.Page;
import edu.ustc.SpringStart.tmall.util.UploadedImageFile;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.imageio.ImageIO;
import javax.servlet.Filter;
import javax.servlet.http.HttpSession;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
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

    @RequestMapping("admin_category_add")
    public String add(Category category, HttpSession session, UploadedImageFile uploadedImageFile) throws IOException {

        int count = categoryService.add(category);
        if (count > 0) {
            File imageFolder = new File(session.getServletContext().getRealPath("statics/img/category"));
            File file = new File(imageFolder, category.getId() + ".jpg");
            if (!imageFolder.exists()) {
                imageFolder.mkdir();
            }
            uploadedImageFile.getImage().transferTo(file);
            BufferedImage img = ImageUtil.change2jpg(file);
            ImageIO.write(img, "jpg", file);
        }
        return "redirect:/tmall/admin_category_list";
    }

    @RequestMapping("admin_category_delete")
    public String delete(Category category, HttpSession session) {
        if (category.getId() > 0) {
            categoryService.delete(category);
            File imageFolder = new File(session.getServletContext().getRealPath("statics/img/category"));
            File file = new File(imageFolder, category.getId() + ".jpg");
            file.delete();
        }
        return "redirect:/tmall/admin_category_list";
    }
}
