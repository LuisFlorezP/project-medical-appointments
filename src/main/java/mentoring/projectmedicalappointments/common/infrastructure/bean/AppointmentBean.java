package mentoring.projectmedicalappointments.common.infrastructure.bean;

import lombok.RequiredArgsConstructor;
import mentoring.projectmedicalappointments.appointment.domain.port.api.IAppointmentServicePort;
import mentoring.projectmedicalappointments.appointment.domain.port.spi.IAppointmentPersistencePort;
import mentoring.projectmedicalappointments.appointment.domain.usecase.AppointmentUseCase;
import mentoring.projectmedicalappointments.appointment.infrastructure.output.persistence.jpa.adapter.AppointmentAdapter;
import mentoring.projectmedicalappointments.appointment.infrastructure.output.persistence.jpa.mapper.IAppointmentEntityMapper;
import mentoring.projectmedicalappointments.appointment.infrastructure.output.persistence.jpa.repository.IAppointmentRepository;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@RequiredArgsConstructor
public class AppointmentBean {

    private final IAppointmentRepository appointmentRepository;
    private final IAppointmentEntityMapper appointmentEntityMapper;

    @Bean
    public IAppointmentPersistencePort appointmentPersistencePort() {
        return new AppointmentAdapter(appointmentRepository, appointmentEntityMapper);
    }

    @Bean
    public IAppointmentServicePort appointmentServicePort() {
        return new AppointmentUseCase(appointmentPersistencePort());
    }
}
