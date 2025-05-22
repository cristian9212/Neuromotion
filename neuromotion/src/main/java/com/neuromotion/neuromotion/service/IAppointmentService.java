package com.neuromotion.neuromotion.service;

import com.neuromotion.neuromotion.dto.AppointmentDto;
import com.neuromotion.neuromotion.model.entity.AppointmentEntity;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface IAppointmentService {
    ResponseEntity<AppointmentEntity> createAppointment(AppointmentDto appointmentDto);
    ResponseEntity<AppointmentEntity> getAppointmentById(Long id);
    ResponseEntity<List<AppointmentEntity>> getAllAppointments();
}
