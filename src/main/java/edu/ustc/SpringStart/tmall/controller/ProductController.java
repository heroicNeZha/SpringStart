package edu.ustc.SpringStart.tmall.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import edu.ustc.SpringStart.tmall.pojo.Category;
import edu.ustc.SpringStart.tmall.pojo.Product;
import edu.ustc.SpringStart.tmall.service.CategoryService;
import edu.ustc.SpringStart.tmall.service.ProductService;
import edu.ustc.SpringStart.tmall.util.Page;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Date;
import java.util.List;

@Controller
@RequestMapping("/tmall")
public class ProductController {
    @Autowired
    private ProductService productService;
    @Autowired
    CategoryService categoryService;

    @RequestMapping("/admin_product_list")
    public String list(Model model, Page page, Integer cid) {
        PageHelper.offsetPage(page.getStart(), 5);
        List<Product> products = productService.list(cid);
        Category category = new Category();
        category.setId(cid);
        category = categoryService.query(category);
        page.setTotal((int) new PageInfo<>(products).getTotal());
        page.setParam("&cid=" + cid);
        model.addAttribute("products", products);
        model.addAttribute("page", page);
        model.addAttribute("category", category);
        return "admin/listProduct";
    }

    @RequestMapping("/admin_product_add")
    public String add(Product product) {
        product.setCreateDate(new Date());
        productService.add(product);
        return "redirect:admin_product_list?cid=" + product.getCid();
    }

    @RequestMapping("admin_product_delete")
    public String delete(Product product) {
        product = productService.query(product);
        productService.delete(product);
        return "redirect:admin_product_list?cid=" + product.getCid();
    }

    @RequestMapping("admin_product_edit")
    public String edit(Model model, Product product) {
        product = productService.query(product);
        model.addAttribute("product", product);
        model.addAttribute("category", product.getCategory());
        return "admin/editProduct";
    }

    @RequestMapping("admin_product_update")
    public String update(Product p) {
        productService.update(p);
        return "redirect:admin_product_list?cid=" + p.getCid();
    }

}
