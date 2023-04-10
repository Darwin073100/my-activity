package com.myactivity.personal.repository;

import com.myactivity.personal.entity.Comment;

import java.util.List;
import java.util.Optional;

public interface CommentRepository {
    List<Comment> findAll();
    Optional<Comment> findById(int id);
    Comment save(Comment comment);
    Comment update(int id, Comment comment);
    Boolean delete(int id);
}
