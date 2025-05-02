package com.e_commerce.store.mapper;

import com.e_commerce.store.model.Category;
import com.e_commerce.store.dto.CategoryDTO;
import org.mapstruct.Mapper;

@Mapper
public interface CategoryMapper {

    CategoryDTO categoryToCategoryDTO(Category category);

    Category categoryDTOToCategory(CategoryDTO categoryDTO);
}