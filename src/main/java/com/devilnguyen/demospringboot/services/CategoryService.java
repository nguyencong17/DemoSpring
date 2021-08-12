package com.devilnguyen.demospringboot.services;

import com.devilnguyen.demospringboot.model.Category;
import com.devilnguyen.demospringboot.repository.CategoryJpa;
import org.springframework.stereotype.Service;

@Service
public class CategoryService {
    private CategoryJpa categoryJpa;

    public boolean saveCategory(Category category){
        try{
            categoryJpa.save(category);
        }catch (Exception e){
            e.printStackTrace();
            throw e;
        }
        return true;
    }
}
