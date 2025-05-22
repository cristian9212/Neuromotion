package com.neuromotion.neuromotion.dto;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class PatientDto {

    private String patientName;

    private String email;

    private String patientPassword;

    private String phoneNumber;
}
