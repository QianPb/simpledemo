package com.simpledemo.repository;

import com.simpledemo.domain.Lecturer;
import org.springframework.data.repository.CrudRepository;

import java.util.ArrayList;

public interface LecturerRepository extends CrudRepository<Lecturer, Long> {
    public ArrayList<Lecturer> findAll();
}
