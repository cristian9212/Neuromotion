package com.neuromotion.neuromotion.controller;

import com.neuromotion.neuromotion.controller.doc.IPatientDoc;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/usuario")
public class PatientController implements IPatientDoc {
    @Override
    public ResponseEntity create() {
        return null;
    }
}
