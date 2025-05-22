package com.neuromotion.neuromotion.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.time.LocalTime;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class AppointmentDto {

    private Long doctorId;

    private Long patientId;

    private LocalDate appointmentDate;

    private LocalTime appointmentTime;

    private String location;

    private Boolean reminder;
}
