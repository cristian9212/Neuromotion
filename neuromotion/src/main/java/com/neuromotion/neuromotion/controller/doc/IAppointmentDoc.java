package com.neuromotion.neuromotion.controller.doc;

import com.neuromotion.neuromotion.dto.AppointmentDto;
import com.neuromotion.neuromotion.model.entity.AppointmentEntity;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Tag(name = "Appointment" , description = "API exposed for management all Appointment")
public interface IAppointmentDoc {
    @Operation(summary = "create Appointment"
            ,description = "This operation is for creating Appointment")
    @ApiResponses(value = {
            @ApiResponse(
                    responseCode = "201",
                    description = "Appointment Created",
                    content = @Content(mediaType = MediaType.APPLICATION_JSON_VALUE)
            ),
            @ApiResponse(
                    responseCode = "500",
                    description = "Internal Server Error",
                    content = @Content(mediaType = MediaType.APPLICATION_JSON_VALUE)
            ),
            @ApiResponse(
                    responseCode = "404",
                    description = "endpoint not found",
                    content = @Content(mediaType = MediaType.APPLICATION_JSON_VALUE)
            )
    })
    @PostMapping
    ResponseEntity<AppointmentEntity> create(@RequestBody AppointmentDto doctorDto);

    @Operation(summary = "get all Appointment"
            ,description = "This operation is for getting Appointment")
    @ApiResponses(value = {
            @ApiResponse(
                    responseCode = "200",
                    description = "Appointment founded",
                    content = @Content(mediaType = MediaType.APPLICATION_JSON_VALUE)
            ),
            @ApiResponse(
                    responseCode = "500",
                    description = "Internal Server Error",
                    content = @Content(mediaType = MediaType.APPLICATION_JSON_VALUE)
            ),
            @ApiResponse(
                    responseCode = "404",
                    description = "endpoint not found",
                    content = @Content(mediaType = MediaType.APPLICATION_JSON_VALUE)
            )
    })
    @GetMapping
    ResponseEntity<List<AppointmentEntity>> getAll();

    @Operation(summary = "get Appointment by Id"
            ,description = "This operation is for getting")
    @ApiResponses(value = {
            @ApiResponse(
                    responseCode = "200",
                    description = "Appointment founded",
                    content = @Content(mediaType = MediaType.APPLICATION_JSON_VALUE)
            ),
            @ApiResponse(
                    responseCode = "500",
                    description = "Internal Server Error",
                    content = @Content(mediaType = MediaType.APPLICATION_JSON_VALUE)
            ),
            @ApiResponse(
                    responseCode = "404",
                    description = "endpoint not found",
                    content = @Content(mediaType = MediaType.APPLICATION_JSON_VALUE)
            )
    })
    @GetMapping("/{id}")
    ResponseEntity<AppointmentEntity> getById(@PathVariable("id")Long id);
}
