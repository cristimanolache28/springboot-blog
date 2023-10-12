package com.l2c.blog.payload;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class CategoryDto {
    private Long id;
    private String name;
    private String description;

    public CategoryDto(String name, String description) {
        this.name = name;
        this.description = description;
    }
}
