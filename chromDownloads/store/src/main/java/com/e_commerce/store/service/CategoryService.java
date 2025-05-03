package com.e_commerce.store.service;

import com.e_commerce.store.dto.CategoryDTO;

public interface CategoryService {
    CategoryDTO createCategory(CategoryDTO categoryDTO);
    CategoryDTO getCategoryById(Long id);
    CategoryDTO updateCategory(CategoryDTO categoryDTO);
    void deleteCategory(Long id);
    Iterable<CategoryDTO> getAllCategories();
}
