package mentoring.projectmedicalappointments.patient.application.dto.request;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import java.time.LocalDate;

@Data
@AllArgsConstructor
@RequiredArgsConstructor
public class PatientRequest {

    private String name;
    private String phone;
    private LocalDate birth;
    private Long gender;
}
