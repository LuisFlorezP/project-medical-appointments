package mentoring.projectmedicalappointments.patient.application.dto.response;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import java.time.LocalDate;

@Data
@AllArgsConstructor
@RequiredArgsConstructor
public class PatientResponse {

    private Long id;
    private String name;
    private String phone;
    private LocalDate birth;
    private String gender;
}
