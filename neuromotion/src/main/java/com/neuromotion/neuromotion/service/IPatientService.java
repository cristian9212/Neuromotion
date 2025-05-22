package com.neuromotion.neuromotion.service;

import com.neuromotion.neuromotion.dto.PatientDto;
import com.neuromotion.neuromotion.model.entity.PatientEntity;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface IPatientService {
    ResponseEntity<PatientEntity> createPatient(PatientDto patientDto);

    ResponseEntity<List<PatientEntity>> findAll();

    ResponseEntity<PatientEntity> findById(Long id);

    ResponseEntity<PatientEntity> validateLogin(String email, String password);
}
