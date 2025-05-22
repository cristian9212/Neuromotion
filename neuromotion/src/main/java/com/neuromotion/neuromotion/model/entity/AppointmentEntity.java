package com.neuromotion.neuromotion.model.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.time.LocalTime;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Builder
@Table(name = "appointment")
public class AppointmentEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "appointment_id") // Llave primaria de la tabla "appointment"
    private Long appointmentId;

    @ManyToOne
    @JoinColumn(name = "doctor_id", nullable = false) // Relación con DoctorEntity
    private DoctorEntity doctor;

    @ManyToOne
    @JoinColumn(name = "patient_id", nullable = false) // Relación con PatientEntity
    private PatientEntity patient;

    @Column(name = "appointment_date", nullable = false)
    private LocalDate appointmentDate;

    @Column(name = "appointment_time", nullable = false)
    private LocalTime appointmentTime;

    @Column(name = "location", length = 50, nullable = false)
    private String location;

    @Column(name = "reminder", nullable = false)
    private Boolean reminder;
}
