package com.neuromotion.neuromotion.controller;

import com.neuromotion.neuromotion.controller.doc.IAppointmentDoc;
import com.neuromotion.neuromotion.dto.AppointmentDto;
import com.neuromotion.neuromotion.model.entity.AppointmentEntity;
import com.neuromotion.neuromotion.service.IAppointmentService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@CrossOrigin(origins = "*")
@AllArgsConstructor
@RestController
@RequestMapping("/appointment")
public class AppointmentController implements IAppointmentDoc {

    private IAppointmentService appointmentService;

    @Override
    public ResponseEntity<AppointmentEntity> create(AppointmentDto doctorDto) {
        return appointmentService.createAppointment(doctorDto);
    }

    @Override
    public ResponseEntity<List<AppointmentEntity>> getAll() {
        return this.appointmentService.getAllAppointments();
    }

    @Override
    public ResponseEntity<AppointmentEntity> getById(Long id) {
        return this.appointmentService.getAppointmentById(id);
    }
}
