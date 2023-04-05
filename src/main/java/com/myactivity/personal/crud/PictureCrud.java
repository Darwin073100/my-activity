package com.myactivity.personal.crud;

import com.myactivity.personal.entity.Picture;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PictureCrud extends JpaRepository<Picture, Integer> {
}
