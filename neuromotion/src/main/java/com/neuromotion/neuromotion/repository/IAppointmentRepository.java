package com.neuromotion.neuromotion.repository;

import com.neuromotion.neuromotion.model.entity.AppointmentEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IAppointmentRepository extends JpaRepository<AppointmentEntity,Long> {
}
