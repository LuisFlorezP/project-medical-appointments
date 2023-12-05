package mentoring.projectmedicalappointments.patient.domain.port.spi;

import mentoring.projectmedicalappointments.patient.domain.model.Patient;
import java.util.List;

public interface IPatientPersistencePort {

    Long savePatient(Patient patient);

    List<Patient> getPatients();
}
