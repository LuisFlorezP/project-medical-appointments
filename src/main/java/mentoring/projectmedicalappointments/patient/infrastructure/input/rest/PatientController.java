package mentoring.projectmedicalappointments.patient.infrastructure.input.rest;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import mentoring.projectmedicalappointments.patient.application.dto.request.PatientRequest;
import mentoring.projectmedicalappointments.patient.application.dto.response.PatientResponse;
import mentoring.projectmedicalappointments.patient.application.handler.IPatientHandler;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/patients")
@RequiredArgsConstructor
@Tag(name = "Patient Controller", description = "Controller to the Patient entity.")
public class PatientController {

    private final IPatientHandler patientHandler;

    @Operation(summary = "Allows you to create new patient")
    @PostMapping
    public ResponseEntity<Long> savePatient(@RequestBody PatientRequest request) {
        return new ResponseEntity<>(patientHandler.savePatient(request), HttpStatus.CREATED);
    }

    @Operation(summary = "Allows you to see all patients")
    @GetMapping
    public ResponseEntity<List<PatientResponse>> getPatients() {
        return new ResponseEntity<>(patientHandler.getPatients(), HttpStatus.OK);
    }
}
