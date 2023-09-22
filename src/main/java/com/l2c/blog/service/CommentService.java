package com.l2c.blog.service;

import com.l2c.blog.payload.CommentDto;

import java.util.List;


public interface CommentService {
    CommentDto createComment(long postId, CommentDto commentDto);

    List<CommentDto> getCommentsByPostId(long postId);

    CommentDto getCommentById(Long postId, Long commentId);

    CommentDto updateComment(Long postId, long commentId, CommentDto commentRequest);

    void deleteComment(Long postId, Long commentId);

    // TODO: implement a future that get all the comments from a post

}
