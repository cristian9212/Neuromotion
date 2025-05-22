package com.neuromotion.neuromotion.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class DoctorDto {
    private String doctorName;

    private String email;

    private String doctorPassword;

    private String phoneNumber;
}
