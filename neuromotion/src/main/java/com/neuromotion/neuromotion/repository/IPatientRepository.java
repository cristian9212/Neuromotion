package com.neuromotion.neuromotion.repository;

import com.neuromotion.neuromotion.model.entity.PatientEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface IPatientRepository extends JpaRepository<PatientEntity,Long> {

    Optional<PatientEntity> findByEmailAndPatientPassword(String email, String patientPassword);
}
