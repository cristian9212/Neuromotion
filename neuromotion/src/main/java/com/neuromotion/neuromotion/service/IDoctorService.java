package com.neuromotion.neuromotion.service;

import com.neuromotion.neuromotion.dto.DoctorDto;
import com.neuromotion.neuromotion.model.entity.DoctorEntity;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface IDoctorService {

    ResponseEntity<DoctorEntity>  createDoctor(DoctorDto doctorEntity);

     ResponseEntity<DoctorEntity> getDoctorById(Long id);

     ResponseEntity<List<DoctorEntity>> getAllDoctors();

}
