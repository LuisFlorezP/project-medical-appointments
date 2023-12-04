package mentoring.projectmedicalappointments.doctor.infrastructure.adapter.input.rest;

import io.swagger.v3.oas.annotations.Operation;
import lombok.RequiredArgsConstructor;
import mentoring.projectmedicalappointments.doctor.application.dto.request.DoctorRequest;
import mentoring.projectmedicalappointments.doctor.application.dto.response.DoctorResponse;
import mentoring.projectmedicalappointments.doctor.application.handler.IDoctorHandler;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/doctors")
@RequiredArgsConstructor
public class DoctorController {

    private final IDoctorHandler doctorHandler;

    @Operation(summary = "Allows you to create new doctor")
    @PostMapping
    public ResponseEntity<Long> saveDoctor(@RequestBody DoctorRequest request) {
        return new ResponseEntity<>(doctorHandler.saveDoctor(request), HttpStatus.CREATED);
    }

    @Operation(summary = "Allows you to see a doctor by id")
    @GetMapping("/{id}")
    public ResponseEntity<DoctorResponse> saveDoctor(@PathVariable("id") Long id) {
        return new ResponseEntity<>(doctorHandler.getDoctorById(id), HttpStatus.OK);
    }

    @Operation(summary = "Allows you to see all doctors")
    @GetMapping
    public ResponseEntity<List<DoctorResponse>> saveDoctor() {
        return new ResponseEntity<>(doctorHandler.getDoctors(), HttpStatus.OK);
    }
}
