package com.myactivity.personal.repository;

import com.myactivity.personal.entity.Picture;

import javax.swing.text.html.Option;
import java.util.List;
import java.util.Optional;

public interface PictureRepository {
    List<Picture> findAll();
    Optional<Picture> findById(int id);
    Picture save(Picture picture);
    Picture update(int id, Picture picture);
}
