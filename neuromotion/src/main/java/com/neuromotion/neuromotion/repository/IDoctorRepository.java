package com.neuromotion.neuromotion.repository;

import com.neuromotion.neuromotion.model.entity.DoctorEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IDoctorRepository  extends JpaRepository<DoctorEntity,Long> {
}
