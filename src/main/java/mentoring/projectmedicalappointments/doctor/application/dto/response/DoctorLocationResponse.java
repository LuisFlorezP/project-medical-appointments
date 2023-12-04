package mentoring.projectmedicalappointments.doctor.application.dto.response;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
@AllArgsConstructor
@RequiredArgsConstructor
public class DoctorLocationResponse {

    private Long id;
    private String name;
    private Boolean availability;
    private String specialization;
}
