package com.meli.modulo14_mongo.service;

import com.meli.modulo14_mongo.domain.Dentist;
import com.meli.modulo14_mongo.dto.DentistDTO;
import com.meli.modulo14_mongo.repository.DentistRepository;
import com.meli.modulo14_mongo.utils.ConvertUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.Optional;

@Service
public class DentistService {

    public DentistRepository dentistRepository;

    @Autowired
    public DentistService(DentistRepository dentistRepository) {
        this.dentistRepository = dentistRepository;
    }

    public DentistDTO findById(String id) {

        Optional<Dentist> dentist = dentistRepository.findById(id);
        if (!dentist.isEmpty())
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "Nenhum dentista encontrado");

        return ConvertUtils.map(dentist.get(), DentistDTO.class);
    }

}