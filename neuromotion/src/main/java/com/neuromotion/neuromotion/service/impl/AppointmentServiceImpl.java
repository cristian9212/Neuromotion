package com.neuromotion.neuromotion.service.impl;

import com.neuromotion.neuromotion.dto.AppointmentDto;
import com.neuromotion.neuromotion.model.entity.AppointmentEntity;
import com.neuromotion.neuromotion.model.entity.DoctorEntity;
import com.neuromotion.neuromotion.model.entity.PatientEntity;
import com.neuromotion.neuromotion.repository.IAppointmentRepository;
import com.neuromotion.neuromotion.repository.IDoctorRepository;
import com.neuromotion.neuromotion.repository.IPatientRepository;
import com.neuromotion.neuromotion.service.IAppointmentService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class AppointmentServiceImpl implements IAppointmentService {

    private final IAppointmentRepository appointmentRepository;
    private final IDoctorRepository doctorRepository;
    private final IPatientRepository patientRepository;

    @Override
    public ResponseEntity<AppointmentEntity> createAppointment(AppointmentDto appointmentDto) {
        DoctorEntity doctor = doctorRepository.findById(appointmentDto.getDoctorId()).orElseThrow();
        PatientEntity patient = patientRepository.findById(appointmentDto.getPatientId()).orElseThrow();
        var appointment=AppointmentEntity
                .builder()
                .patient(patient)
                .doctor(doctor)
                .appointmentDate(appointmentDto.getAppointmentDate())
                .location(appointmentDto.getLocation())
                .reminder(appointmentDto.getReminder())
                .build();
        var newAppointment=appointmentRepository.save(appointment);
        return ResponseEntity.ok(newAppointment);
    }

    @Override
    public ResponseEntity<AppointmentEntity> getAppointmentById(Long id) {
        var appointment = this.appointmentRepository.findById(id).orElseThrow();
        return ResponseEntity.ok(appointment);
    }

    @Override
    public ResponseEntity<List<AppointmentEntity>> getAllAppointments() {
        var appointment = this.appointmentRepository.findAll();
        return ResponseEntity.ok(appointment);
    }
}
