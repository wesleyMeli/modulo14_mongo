package com.meli.modulo14_mongo.controller;

import com.meli.modulo14_mongo.dto.DentistDTO;
import com.meli.modulo14_mongo.service.DentistService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/dentist")
public class DentistController {

    public DentistService dentistService;

    @Autowired
    public DentistController(DentistService dentistService) {
        this.dentistService = dentistService;
    }

    @GetMapping("/agenda/{id}")
    @ResponseStatus(value = HttpStatus.OK)
    public DentistDTO getId(@PathVariable String id) {
        return dentistService.findById(id);
    }

}