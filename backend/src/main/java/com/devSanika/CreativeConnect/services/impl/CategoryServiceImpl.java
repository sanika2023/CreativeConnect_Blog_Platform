package com.devSanika.CreativeConnect.services.impl;

import com.devSanika.CreativeConnect.domain.entities.Category;
import com.devSanika.CreativeConnect.repositories.CategoryRepository;
import com.devSanika.CreativeConnect.services.CategoryService;
import jakarta.persistence.EntityNotFoundException;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
@RequiredArgsConstructor
public class CategoryServiceImpl implements CategoryService {

    private final CategoryRepository categoryRepository;
    @Override
    public List<Category> listCategories() {
        return categoryRepository.findAllWithPostCount(); //onlt findAll() returns a list of categories
    }

    @Override
    @Transactional //for multiple transactional calls
    public Category createCategory(Category category) {
        String categoryName = category.getName();
        if (categoryRepository.existsByNameIgnoreCase(category.getName())){
            throw new IllegalArgumentException("Category already exists with name: " + categoryName);
        }
        return categoryRepository.save(category);
    }

    @Override
    public void deleteCategory(UUID id) {
        //make sure that posts are not there under that category
        Optional<Category> category = categoryRepository.findById(id);
        if(category.isPresent()){
            if(!category.get().getPosts().isEmpty()){
                throw new IllegalStateException("Category has posts associated with it");
            }
            categoryRepository.deleteById(id);
        }

    }

    @Override
    public Category getCategoryById(UUID id) {
        return categoryRepository.findById(id)
                .orElseThrow(()-> new EntityNotFoundException("Category not found with id " + id));
    }

}
