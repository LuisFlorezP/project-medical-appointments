package mentoring.projectmedicalappointments.common.infrastructure.bean;

import lombok.RequiredArgsConstructor;
import mentoring.projectmedicalappointments.patient.domain.port.api.IPatientServicePort;
import mentoring.projectmedicalappointments.patient.domain.port.spi.IPatientPersistencePort;
import mentoring.projectmedicalappointments.patient.domain.usecase.PatientUseCase;
import mentoring.projectmedicalappointments.patient.infrastructure.output.persistence.jpa.adapter.PatientAdapter;
import mentoring.projectmedicalappointments.patient.infrastructure.output.persistence.jpa.mapper.IPatientEntityMapper;
import mentoring.projectmedicalappointments.patient.infrastructure.output.persistence.jpa.repository.IPatientRepository;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@RequiredArgsConstructor
public class PatientBean {

    private final IPatientRepository patientRepository;
    private final IPatientEntityMapper patientEntityMapper;

    @Bean
    public IPatientPersistencePort patientPersistencePort() {
        return new PatientAdapter(patientRepository, patientEntityMapper);
    }

    @Bean
    public IPatientServicePort patientServicePort() {
        return new PatientUseCase(patientPersistencePort());
    }
}
