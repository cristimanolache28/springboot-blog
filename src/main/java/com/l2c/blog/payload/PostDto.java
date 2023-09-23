package com.l2c.blog.payload;

import lombok.Data;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;
import java.util.Set;

@Data
public class PostDto {
    private long id;
    @NotEmpty
    @Size(min = 2, message = "Post title should have at least two characters.")
    private String title;
    @NotEmpty
    @Size(min = 10, message = "Post description should have at least ten characters.")
    private String description;
    @NotEmpty
    private String content;
    private Set<CommentDto> comments;
}
