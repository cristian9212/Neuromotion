package com.neuromotion.neuromotion.controller.doc;

import com.neuromotion.neuromotion.dto.DoctorDto;
import com.neuromotion.neuromotion.model.entity.DoctorEntity;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Tag(name = "Doctor" , description = "API exposed for management all Doctor")
@RequestMapping("/doctor")
public interface IDoctorDoc {
    @Operation(summary = "create Doctor"
            ,description = "This operation is for creating Patient")
    @ApiResponses(value = {
            @ApiResponse(
                    responseCode = "201",
                    description = "Patient Created",
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
    ResponseEntity<DoctorEntity> create(@RequestBody DoctorDto doctorDto);

    @Operation(summary = "get all Doctor"
            ,description = "This operation is for getting Patient")
    @ApiResponses(value = {
            @ApiResponse(
                    responseCode = "200",
                    description = "Patient founded",
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
    ResponseEntity<List<DoctorEntity>> getAll();

    @Operation(summary = "get Doctor by Id"
            ,description = "This operation is for getting")
    @ApiResponses(value = {
            @ApiResponse(
                    responseCode = "200",
                    description = "Patient founded",
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
    ResponseEntity<DoctorEntity> getById(@PathVariable("id")Long id);
}
