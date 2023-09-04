package com.example.clinica.controller.dto;

public record AppointmentDto(Integer Id, String name, String description, Integer duration_minutes, String color_hex_code) {
}