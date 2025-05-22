package com.neuromotion.neuromotion.model.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Builder
@Table(name = "patient")
public class PatientEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "patient_id") // Asegúrate de que el nombre coincida con la columna en la DB
    private int patientId;

    @Column(name = "patient_name", length = 50, nullable = false)
    private String patientName;

    @Column(name = "email", length = 50, nullable = false)
    private String email;

    @Column(name = "patient_password", length = 50, nullable = false)
    private String patientPassword;

    @Column(name = "phone_number", length = 20, nullable = false)
    private String phoneNumber;
}
