package com.neuromotion.neuromotion.controller;

import com.neuromotion.neuromotion.controller.doc.IDoctorDoc;
import com.neuromotion.neuromotion.dto.DoctorDto;
import com.neuromotion.neuromotion.model.entity.DoctorEntity;
import com.neuromotion.neuromotion.service.IDoctorService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@AllArgsConstructor
@RestController
@RequestMapping("/doctor")
@CrossOrigin(origins = "*")
public class DoctorController implements IDoctorDoc {

    private IDoctorService doctorService;

    @Override
    public ResponseEntity<DoctorEntity> create(DoctorDto doctorDto) {
        return doctorService.createDoctor(doctorDto);
    }

    @Override
    public ResponseEntity<List<DoctorEntity>> getAll() {
        return doctorService.getAllDoctors();
    }

    @Override
    public ResponseEntity<DoctorEntity> getById(Long id) {
        return doctorService.getDoctorById(id);
    }
}
