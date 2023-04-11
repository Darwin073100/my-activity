package com.myactivity.personal.service;

import com.myactivity.personal.crud.PictureCrud;
import com.myactivity.personal.entity.Picture;
import com.myactivity.personal.repository.PictureRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PictureService implements PictureRepository {

    @Autowired
    private PictureCrud crud;

    /**
     * @return
     */
    @Override
    public List<Picture> findAll() {
        return (List<Picture>) crud.findAll();
    }

    /**
     * @param id
     * @return
     */
    @Override
    public Optional<Picture> findById(int id) {
        return (Optional<Picture>) crud.findById(id);
    }

    /**
     * @param picture
     * @return
     */
    @Override
    public Picture save(Picture picture) {
        return (Picture) crud.save(picture);
    }

    /**
     * @param id
     * @param picture
     * @return Picture
     */
    @Override
    public Picture update(int id, Picture picture) {
        picture.setId(id);
        return crud.saveAndFlush(picture);
    }

    /**
     * @param id
     * @return
     */
    @Override
    public Boolean delete(int id) {
        return findById(id).map(item ->{
            crud.deleteById(id);
            return true;
        }).orElse(false);
    }
}
