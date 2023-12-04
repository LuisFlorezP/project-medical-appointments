package mentoring.projectmedicalappointments.appointment.infrastructure.input.rest;

import io.swagger.v3.oas.annotations.Operation;
import lombok.RequiredArgsConstructor;
import mentoring.projectmedicalappointments.appointment.application.dto.request.AppointmentRequest;
import mentoring.projectmedicalappointments.appointment.application.dto.response.AppointmentResponse;
import mentoring.projectmedicalappointments.appointment.application.handler.IAppointmentHandler;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/appointments")
@RequiredArgsConstructor
public class AppointmentController {

    private final IAppointmentHandler appointmentHandler;

    @Operation(summary = "Allows you to create new appointment")
    @PostMapping
    public ResponseEntity<Long> saveAppointment(@RequestBody AppointmentRequest request) {
        return new ResponseEntity<>(appointmentHandler.saveAppointment(request), HttpStatus.CREATED);
    }

    @Operation(summary = "Allows you to see all appointments")
    @GetMapping
    public ResponseEntity<List<AppointmentResponse>> getAppointments() {
        return new ResponseEntity<>(appointmentHandler.getAppointments(), HttpStatus.OK);
    }
}
