package edu.ustc.SpringStart.tmall.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import edu.ustc.SpringStart.tmall.pojo.Category;
import edu.ustc.SpringStart.tmall.pojo.Property;
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

    @RequestMapping("/admin_property_list")
    public String adminPropertyList(Model model, Page page, int cid) {
        PageHelper.offsetPage(page.getStart(), 5);
        List<Property> properties = propertyService.list(cid);
        page.setTotal((int) new PageInfo<>(properties).getTotal());
        model.addAttribute("properties", properties);
        model.addAttribute("page", page);
        return "admin/listProperty";
    }

    @RequestMapping("/admin_property_add")
    public String adminPropertyAdd(Property property) {
        if (property.getName() != null && property.getCid() != null && !property.getName().equals("")) {
            propertyService.add(property);
        }
        return "redirect:/tmall/admin_property_list";
    }
}
