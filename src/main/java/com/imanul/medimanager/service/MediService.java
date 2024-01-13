package com.imanul.medimanager.service;

import com.imanul.medimanager.model.Medicine;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;

import java.util.List;


public interface MediService {

    public List<Medicine> findAll();
    public Medicine save(Medicine med);


    Medicine findById(int mediId);

}
