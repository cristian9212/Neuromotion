package com.neuromotion.neuromotion.service.impl;

import com.neuromotion.neuromotion.dto.PatientDto;
import com.neuromotion.neuromotion.model.entity.PatientEntity;
import com.neuromotion.neuromotion.repository.IPatientRepository;
import com.neuromotion.neuromotion.service.IPatientService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class PatientServiceImpl implements IPatientService {

    private IPatientRepository patientRepository;


    @Override
    public ResponseEntity<PatientEntity> createPatient(PatientDto patientDto) {

        PatientEntity patientEntity = PatientEntity
                                    .builder()
                                    .email(patientDto.getEmail())
                                    .patientPassword(patientDto.getPatientPassword())
                                    .phoneNumber(patientDto.getPhoneNumber())
                                    .patientName(patientDto.getPatientName())
                                    .build();

        PatientEntity newPatient = patientRepository.save(patientEntity);

        return ResponseEntity.ok(newPatient);
    }

    @Override
    public ResponseEntity<List<PatientEntity>> findAll() {

        var patients = patientRepository.findAll();
        return ResponseEntity.ok(patients);
    }

    @Override
    public ResponseEntity<PatientEntity> findById(Long id) {
        var patients = patientRepository.findById(id).orElseThrow();
        return ResponseEntity.ok(patients);
    }

    @Override
    public ResponseEntity<PatientEntity> validateLogin(String email, String password) {
        var patients = patientRepository.findByEmailAndPatientPassword(email, password).orElseThrow();
        return ResponseEntity.ok(patients);
    }
}
