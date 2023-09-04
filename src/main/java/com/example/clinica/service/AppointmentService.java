package com.example.clinica.service;

import com.example.clinica.controller.dto.AppointmentDto;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface AppointmentService {

    Mono<AppointmentDto> getAppointment(Integer appointmentId);
    Mono<AppointmentDto> createAppointment(AppointmentDto appointmentDto);
    Mono<AppointmentDto> updateAppointment(Integer appointmentId, AppointmentDto appointmentDto);
    Mono<Void> deleteAppointment(Integer appointmentId);
    Flux<AppointmentDto> getAllAppointments();

}