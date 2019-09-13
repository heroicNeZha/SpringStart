package edu.ustc.SpringStart.tmall.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import edu.ustc.SpringStart.tmall.pojo.Category;
import edu.ustc.SpringStart.tmall.pojo.Property;
import edu.ustc.SpringStart.tmall.service.CategoryService;
import edu.ustc.SpringStart.tmall.service.PropertyService;
import edu.ustc.SpringStart.tmall.util.Page;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/tmall")
public class PropertyController {
    @Autowired
    PropertyService propertyService;
    @Autowired
    CategoryService categoryService;

    @RequestMapping("/admin_property_list")
    public String adminPropertyList(Model model, Page page, Integer cid) {
        PageHelper.offsetPage(page.getStart(), 5);
        List<Property> properties = propertyService.list(cid);
        page.setTotal((int) new PageInfo<>(properties).getTotal());
        page.setParam("&cid=" + cid);
        model.addAttribute("properties", properties);
        model.addAttribute("page", page);
        Category category = categoryService.get(cid);
        model.addAttribute("category", category);
        return "admin/listProperty";
    }

    @RequestMapping("/admin_property_add")
    public String adminPropertyAdd(Model model, Property property) {
        if (property.getName() != null && property.getCid() != null && !property.getName().equals("")) {
            propertyService.add(property);
        }
        return "redirect:/tmall/admin_property_list?cid=" + property.getCid();
    }

    @RequestMapping("/admin_property_delete")
    public String delete(Property property) {
        if (property.getId() != null && property.getId() > 0) {
            Property p = propertyService.get(property.getId());
            propertyService.delete(property);
            return "redirect:/tmall/admin_property_list?cid=" + p.getCid();
        }
        return "redirect:/tmall/admin_category_list";
    }

    @RequestMapping("/admin_property_edit")
    public String edit(Model model, Property property) {
        if (property.getId() != null) {
            Property p = propertyService.get(property.getId());
            model.addAttribute("property", p);
            Category category = categoryService.get(property.getCid());
            model.addAttribute("category", category);
        }
        return "admin/editProperty";
    }

    @RequestMapping("/admin_property_update")
    public String update(Property property) {
        if (property.getId() != null && property.getName() != null && !property.getName().equals("")) {
            propertyService.update(property);
        }
        return "redirect:/tmall/admin_property_list?cid=" + property.getCid();
    }


}
