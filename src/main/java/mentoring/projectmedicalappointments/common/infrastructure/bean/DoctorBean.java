package mentoring.projectmedicalappointments.common.infrastructure.bean;

import lombok.RequiredArgsConstructor;
import mentoring.projectmedicalappointments.doctor.domain.port.api.IDoctorServicePort;
import mentoring.projectmedicalappointments.doctor.domain.port.spi.IDoctorPersistencePort;
import mentoring.projectmedicalappointments.doctor.domain.usecase.DoctorUseCase;
import mentoring.projectmedicalappointments.doctor.infrastructure.output.persistence.jpa.adapter.DoctorAdapter;
import mentoring.projectmedicalappointments.doctor.infrastructure.output.persistence.jpa.mapper.IDoctorEntityMapper;
import mentoring.projectmedicalappointments.doctor.infrastructure.output.persistence.jpa.repository.IDoctorRepository;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@RequiredArgsConstructor
public class DoctorBean {

    private final IDoctorRepository doctorRepository;
    private final IDoctorEntityMapper doctorEntityMapper;

    @Bean
    public IDoctorPersistencePort doctorPersistencePort() {
        return new DoctorAdapter(doctorRepository, doctorEntityMapper);
    }

    @Bean
    public IDoctorServicePort doctorServicePort() {
        return new DoctorUseCase(doctorPersistencePort());
    }
}
