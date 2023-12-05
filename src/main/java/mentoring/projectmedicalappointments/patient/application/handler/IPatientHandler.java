package mentoring.projectmedicalappointments.patient.application.handler;

import mentoring.projectmedicalappointments.patient.application.dto.request.PatientRequest;
import mentoring.projectmedicalappointments.patient.application.dto.response.PatientResponse;
import java.util.List;

public interface IPatientHandler {

    Long savePatient(PatientRequest request);

    List<PatientResponse> getPatients();
}
