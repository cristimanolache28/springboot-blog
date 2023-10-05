package com.l2c.blog.service;

import com.l2c.blog.payload.CategoryDto;
import org.springframework.stereotype.Service;


public interface CategoryService {
    CategoryDto addCategory(CategoryDto categoryDto);
}
