package mentoring.projectmedicalappointments.appointment.application.dto.response;

import lombok.*;
import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@RequiredArgsConstructor
public class AppointmentResponse {

    private Long id;
    private LocalDateTime scheduledDate;
    private Long state;
    private DoctorResponse doctor;

    @Data
    @AllArgsConstructor
    @NoArgsConstructor
    public static class DoctorResponse {
        private String id;
        private String name;
    }
}
