package com.neuromotion.neuromotion.controller;

import com.neuromotion.neuromotion.controller.doc.IPatientDoc;
import com.neuromotion.neuromotion.dto.PatientDto;
import com.neuromotion.neuromotion.model.entity.PatientEntity;
import com.neuromotion.neuromotion.service.IPatientService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/patient")
@AllArgsConstructor
@CrossOrigin(origins = "*")
public class PatientController implements IPatientDoc {

    private IPatientService patientService;

    @Override
    public ResponseEntity<PatientEntity> create(PatientDto patient) {
        return patientService.createPatient(patient);
    }

    @Override
    public ResponseEntity<List<PatientEntity>> getAll() {
        return patientService.findAll();
    }

    @Override
    public ResponseEntity<PatientEntity> getById(Long id) {
        return patientService.findById(id);
    }

    @Override
    public ResponseEntity<PatientEntity> login(String email, String password) {
        return patientService.validateLogin(email, password);
    }
}
