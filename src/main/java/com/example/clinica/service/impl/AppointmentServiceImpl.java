package com.example.clinica.service.impl;

import com.example.clinica.controller.dto.AppointmentDto;
import com.example.clinica.repository.AppointmentRepository;
import com.example.clinica.repository.entity.AppointmentEntity;
import com.example.clinica.service.AppointmentService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RequiredArgsConstructor
@Service
public class AppointmentServiceImpl implements AppointmentService {

    private final AppointmentRepository appointmentRepository;

    @Override
    public Mono<AppointmentDto> getAppointment(Integer appointmentId) {
        return appointmentRepository.findById(appointmentId)
                .map(appointmentEntity -> new AppointmentDto(appointmentEntity.getId(),
                        appointmentEntity.getName(),
                        appointmentEntity.getDescription(),
                        appointmentEntity.getDuration_minutes(),
                        appointmentEntity.getColor_hex_code()
                ));
    }

    @Override
    public Mono<AppointmentDto> createAppointment(AppointmentDto appointmentDto) {
        return appointmentRepository.save(AppointmentEntity.builder()
                        .name(appointmentDto.name())
                        .description(appointmentDto.description())
                        .duration_minutes(appointmentDto.duration_minutes())
                        .color_hex_code(appointmentDto.color_hex_code())
                        .build())
                .map(appointmentEntity -> new AppointmentDto(appointmentEntity.getId(),
                            appointmentEntity.getName(),
                            appointmentEntity.getDescription(),
                            appointmentEntity.getDuration_minutes(),
                            appointmentEntity.getColor_hex_code()
                ));
    }

    @Override
    public Mono<AppointmentDto> updateAppointment(Integer appointmentId, AppointmentDto appointmentDto) {
        return appointmentRepository.save(AppointmentEntity.builder()
                        .id(appointmentId)
                        .name(appointmentDto.name())
                        .description(appointmentDto.description())
                        .duration_minutes(appointmentDto.duration_minutes())
                        .color_hex_code(appointmentDto.color_hex_code())
                        .build())
                .map(appointmentEntity -> new AppointmentDto(appointmentEntity.getId(),
                        appointmentEntity.getName(),
                        appointmentEntity.getDescription(),
                        appointmentEntity.getDuration_minutes(),
                        appointmentEntity.getColor_hex_code()
                    ));
    }

    @Override
    public Mono<Void> deleteAppointment(Integer appointmentId) {
        return appointmentRepository.deleteById(appointmentId);
    }

    @Override
    public Flux<AppointmentDto> getAllAppointments() {
        return appointmentRepository.findAll()
                .map(appointmentEntity -> new AppointmentDto(appointmentEntity.getId(),
                        appointmentEntity.getName(),
                        appointmentEntity.getDescription(),
                        appointmentEntity.getDuration_minutes(),
                        appointmentEntity.getColor_hex_code()
                ));
    }
}