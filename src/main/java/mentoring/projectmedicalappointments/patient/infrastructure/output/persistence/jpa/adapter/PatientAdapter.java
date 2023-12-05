package mentoring.projectmedicalappointments.patient.infrastructure.output.persistence.jpa.adapter;

import lombok.RequiredArgsConstructor;
import mentoring.projectmedicalappointments.patient.domain.model.Patient;
import mentoring.projectmedicalappointments.patient.domain.port.spi.IPatientPersistencePort;
import mentoring.projectmedicalappointments.patient.infrastructure.output.persistence.jpa.mapper.IPatientEntityMapper;
import mentoring.projectmedicalappointments.patient.infrastructure.output.persistence.jpa.repository.IPatientRepository;
import java.util.List;

@RequiredArgsConstructor
public class PatientAdapter implements IPatientPersistencePort {

    private final IPatientRepository patientRepository;
    private final IPatientEntityMapper patientEntityMapper;

    @Override
    public Long savePatient(Patient patient) {
        return patientRepository.save(patientEntityMapper.modelToEntity(patient)).getPatientId();
    }

    @Override
    public List<Patient> getPatients() {
        return patientEntityMapper.entitiesToModels(patientRepository.findAll());
    }
}
