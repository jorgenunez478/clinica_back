package com.example.clinica.repository;

import com.example.clinica.repository.entity.AppointmentEntity;
import org.springframework.data.r2dbc.repository.R2dbcRepository;

public interface AppointmentRepository extends R2dbcRepository<AppointmentEntity, Integer> {
}