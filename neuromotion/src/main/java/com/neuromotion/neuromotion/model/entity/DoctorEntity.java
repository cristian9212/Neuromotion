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
@Table(name = "doctor")
public class DoctorEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "doctor_id") // Asegúrate de que el nombre coincida con la columna en la DB
    private Integer doctorId;

    @Column(name = "doctor_name", length = 50, nullable = false)
    private String doctorName;

    @Column(name = "email", length = 50, nullable = false)
    private String email;

    @Column(name = "doctor_password", length = 50, nullable = false)
    private String doctorPassword;

    @Column(name = "phone_number", length = 20, nullable = false)
    private String phoneNumber;
}
