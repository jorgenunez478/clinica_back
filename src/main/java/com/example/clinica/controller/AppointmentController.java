package com.example.clinica.controller;

import com.example.clinica.controller.dto.AppointmentDto;
import com.example.clinica.service.AppointmentService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@CrossOrigin(maxAge = 3600)
@RequiredArgsConstructor
@RestController
@RequestMapping("/appointment_type")
public class AppointmentController {

    private final AppointmentService appointmentService;

    @GetMapping("/{Id}")
    Mono<AppointmentDto> getAppointment(@PathVariable("Id") Integer appointmentId) {
        return appointmentService.getAppointment(appointmentId);
    }

    @PostMapping
    Mono<AppointmentDto> createAppointment(@RequestBody AppointmentDto appointmentDto) {
        return appointmentService.createAppointment(appointmentDto);
    }

    @PutMapping("/{appointmentId}")
    Mono<AppointmentDto> updateAppointment(@PathVariable("appointmentId") Integer appointmentId, @RequestBody AppointmentDto appointmentDto) {
        return appointmentService.updateAppointment(appointmentId, appointmentDto);
    }

    @DeleteMapping("/{appointmentId}")
    Mono<Void> deleteAppointment(@PathVariable("appointmentId") Integer appointmentId) {
        return appointmentService.deleteAppointment(appointmentId);
    }

    @GetMapping("/all")
    Flux<AppointmentDto> getAllAppointments() {
        return appointmentService.getAllAppointments();
    }
}