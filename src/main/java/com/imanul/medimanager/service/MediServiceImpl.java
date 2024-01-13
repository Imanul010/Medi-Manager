package com.imanul.medimanager.service;

import com.imanul.medimanager.model.Medicine;
import com.imanul.medimanager.repository.MediRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MediServiceImpl implements MediService {

    @Autowired
    private MediRepository medRepo;

    @Override
    public List<Medicine> findAll() {
        return medRepo.findAll();
    }

    @Override
    public Medicine findById(int mediId) {
        Optional<Medicine> result = medRepo.findById(mediId);

        Medicine medicine = null;
        if (result.isPresent()){
            medicine = result.get();
        }else {
            throw new RuntimeException("Did not find employee id - " + mediId);
        }
        return medicine;
    }

    @Override
    public Medicine save(Medicine med) {

        return medRepo.save(med);
    }
}
