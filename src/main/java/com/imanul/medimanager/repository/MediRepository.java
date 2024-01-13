package com.imanul.medimanager.repository;

import com.imanul.medimanager.model.Medicine;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MediRepository extends JpaRepository<Medicine, Integer> {

}
