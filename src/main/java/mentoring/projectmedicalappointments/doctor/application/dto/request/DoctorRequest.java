package mentoring.projectmedicalappointments.doctor.application.dto.request;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
@AllArgsConstructor
@RequiredArgsConstructor
public class DoctorRequest {

    private String name;
    private Long specialization;
    private Long location;
}
