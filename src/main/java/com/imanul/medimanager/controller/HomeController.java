package com.imanul.medimanager.controller;

import com.imanul.medimanager.model.Medicine;
import com.imanul.medimanager.service.MediService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class HomeController {

    @Autowired
    private MediService mediService;

    @GetMapping("/medicine")
    public List<Medicine> findAll(){
        return mediService.findAll();
    }

    @GetMapping("/medicine/{mediId}")
    public Medicine getMedicine(@PathVariable int mediId){
        Medicine medicine = mediService.findById(mediId);
        if (medicine == null){
            throw new RuntimeException("Medicine id not found - "+ mediId);
        }
        return medicine;
    }

    @PostMapping("/add/medicine")
    public Medicine addMedicine(@RequestBody Medicine med)
    {
//        logger.info("Request received");
//        System.out.println(med);
        Medicine dbMed = mediService.save(med);
        return dbMed;
    }
}
