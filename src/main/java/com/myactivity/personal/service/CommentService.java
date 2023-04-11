package com.myactivity.personal.service;

import com.myactivity.personal.crud.CommentCrud;
import com.myactivity.personal.entity.Comment;
import com.myactivity.personal.repository.CommentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CommentService implements CommentRepository {

    @Autowired
    private CommentCrud crud;

    /**
     * @return
     */
    @Override
    public List<Comment> findAll() {
        return (List<Comment>) crud.findAll();
    }

    /**
     * @param id
     * @return
     */
    @Override
    public Optional<Comment> findById(int id) {
        return (Optional<Comment>) crud.findById(id);
    }

    /**
     * @param comment
     * @return
     */
    @Override
    public Comment save(Comment comment) {
        return (Comment) crud.save(comment);
    }

    /**
     * @param id
     * @param comment
     * @return
     */
    @Override
    public Comment update(int id, Comment comment) {
        comment.setId(id);
        return (Comment) crud.saveAndFlush(comment);
    }

    /**
     * @param id
     * @return
     */
    @Override
    public Boolean delete(int id) {
        return crud.findById(id).map(item -> {
            crud.deleteById(id);
            return true;
        }).orElse(false);
    }
}
