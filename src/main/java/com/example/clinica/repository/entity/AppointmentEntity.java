package com.example.clinica.repository.entity;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;

@Getter
@Setter
@Builder
@Table("appointment_type")
public class AppointmentEntity {

    @Id
    Integer id;

    String name;

    String description;

    Integer duration_minutes;

    String color_hex_code;
}