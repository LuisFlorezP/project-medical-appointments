package mentoring.projectmedicalappointments.patient.domain.port.api;

import mentoring.projectmedicalappointments.patient.domain.model.Patient;
import java.util.List;

public interface IPatientServicePort {

    Long savePatient(Patient patient);

    List<Patient> getPatients();
}
