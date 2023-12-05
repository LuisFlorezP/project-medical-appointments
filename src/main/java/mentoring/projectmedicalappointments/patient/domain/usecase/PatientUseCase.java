package mentoring.projectmedicalappointments.patient.domain.usecase;

import mentoring.projectmedicalappointments.patient.domain.model.Patient;
import mentoring.projectmedicalappointments.patient.domain.port.api.IPatientServicePort;
import mentoring.projectmedicalappointments.patient.domain.port.spi.IPatientPersistencePort;
import java.util.List;

public class PatientUseCase implements IPatientServicePort {

    private final IPatientPersistencePort patientPersistencePort;

    public PatientUseCase(IPatientPersistencePort patientPersistencePort) {
        this.patientPersistencePort = patientPersistencePort;
    }

    @Override
    public Long savePatient(Patient patient) {
        return patientPersistencePort.savePatient(patient);
    }

    @Override
    public List<Patient> getPatients() {
        return patientPersistencePort.getPatients();
    }
}
