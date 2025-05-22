package com.neuromotion.neuromotion.service.impl;

import com.neuromotion.neuromotion.dto.DoctorDto;
import com.neuromotion.neuromotion.model.entity.DoctorEntity;
import com.neuromotion.neuromotion.repository.IDoctorRepository;
import com.neuromotion.neuromotion.service.IDoctorService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class DoctorServiceImpl implements IDoctorService {

    private IDoctorRepository doctorRepository;

    @Override
    public ResponseEntity<DoctorEntity> createDoctor(DoctorDto doctorEntity) {

        DoctorEntity doctor = DoctorEntity
                .builder()
                .doctorPassword(doctorEntity.getDoctorPassword())
                .doctorName(doctorEntity.getDoctorName())
                .phoneNumber(doctorEntity.getPhoneNumber())
                .email(doctorEntity.getEmail())
                .build();
        var newDoctor = doctorRepository.save(doctor);
        return ResponseEntity.ok(newDoctor);
    }

    @Override
    public ResponseEntity<DoctorEntity> getDoctorById(Long id) {
        var doctor  = doctorRepository.findById(id).orElseThrow();
        return ResponseEntity.ok(doctor);
    }

    @Override
    public ResponseEntity<List<DoctorEntity>> getAllDoctors() {
        var doctors = doctorRepository.findAll();
        return ResponseEntity.ok(doctors);
    }
}
