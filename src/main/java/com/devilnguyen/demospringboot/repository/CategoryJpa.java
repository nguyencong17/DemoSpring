package com.devilnguyen.demospringboot.repository;

import com.devilnguyen.demospringboot.model.Category;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoryJpa extends CrudRepository<Category,Integer> {
}
