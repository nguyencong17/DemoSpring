package com.devilnguyen.demospringboot.controller.admin;

import com.devilnguyen.demospringboot.model.Category;
import com.devilnguyen.demospringboot.repository.CategoryJpa;
import com.devilnguyen.demospringboot.services.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
@Controller
public class CategoryController implements IController<Category>{

    @Autowired
    CategoryService categoryService;
    @Autowired
    CategoryJpa categoryJpa;


    @Override
    public String list(Model model, int page, int pageSize) {
        return null;
    }

    @Override
    @GetMapping("admin/category/add")
    public String add(Model model) {
        model.addAttribute("category", new Category());
        return "backend/category/add";
    }

    @Override
    @PostMapping("admin/category/postAdd")
    public String postAdd(Category user, RedirectAttributes attributes) {
        try{

        }catch (Exception e){
            throw e;
        }
        return "redirect:/admin/category/add";
    }

    @Override
    public String postAdd(Category user, RedirectAttributes attributes, MultipartFile file) {
        return null;
    }



    @Override
    public String edit(Model model, Long id) {
        return null;
    }

    @Override
    public String postEdit(Category user, RedirectAttributes attributes) {
        return null;
    }

    @Override
    public String delete(Model model, Long id, RedirectAttributes attributes) {
        return null;
    }
}
