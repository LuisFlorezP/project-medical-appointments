package mentoring.projectmedicalappointments.appointment.application.dto.request;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@RequiredArgsConstructor
public class AppointmentRequest {

    private LocalDateTime scheduledDate;
    private Long doctor;
}
