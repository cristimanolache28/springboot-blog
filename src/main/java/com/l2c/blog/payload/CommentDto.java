package com.l2c.blog.payload;

import lombok.Data;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

@Data
public class CommentDto {
    private long id;

    @NotEmpty(message = "Name should not be null or empty.")
    @Size(min = 3, message = "Name should have at least 3 characters.")
    private String name;

    @NotEmpty(message = "Email should not be empty.")
    @Email
    private String email;

    @NotEmpty(message = "Body should not be null or empty.")
    @Size(min = 10, message = "Body should have at lest 10 characters.")
    private String body;

}
