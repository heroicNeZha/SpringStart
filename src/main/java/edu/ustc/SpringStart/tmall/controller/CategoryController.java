package edu.ustc.SpringStart.tmall.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import edu.ustc.SpringStart.tmall.pojo.Category;
import edu.ustc.SpringStart.tmall.service.CategoryService;
import edu.ustc.SpringStart.tmall.util.ImageUtil;
import edu.ustc.SpringStart.tmall.util.Page;
import edu.ustc.SpringStart.tmall.util.UploadedImageFile;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;

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
        PageHelper.offsetPage(page.getStart(), 5);
        List<Category> categories = categoryService.list();
        page.setTotal((int) new PageInfo<>(categories).getTotal());
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

    @RequestMapping("admin_category_edit")
    public String edit(Model model, Category category) {
        if (category.getId() > 0) {
            category = categoryService.get(category.getId());
            model.addAttribute("category", category);
            return "admin/editCategory";
        }
        return "redirect:/tmall/admin_category_list";
    }

    @RequestMapping("admin_category_update")
    public String update(Category category, HttpSession session, UploadedImageFile uploadedImageFile) {
        try {
            int count = categoryService.update(category);
            MultipartFile image = uploadedImageFile.getImage();
            if (count > 0 && image != null && !image.isEmpty()) {
                File file = new File(session.getServletContext().getRealPath("statics/img/category"), category.getId() + ".jpg");
                image.transferTo(file);
                BufferedImage img = ImageUtil.change2jpg(file);
                ImageIO.write(img, "jpg", file);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return "redirect:/tmall/admin_category_list";
    }
}
