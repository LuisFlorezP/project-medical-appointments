package mentoring.projectmedicalappointments.appointment.infrastructure.output.persistence.jpa.adapter;

import lombok.RequiredArgsConstructor;
import mentoring.projectmedicalappointments.appointment.domain.model.Appointment;
import mentoring.projectmedicalappointments.appointment.domain.port.spi.IAppointmentPersistencePort;
import mentoring.projectmedicalappointments.appointment.infrastructure.output.persistence.jpa.mapper.IAppointmentEntityMapper;
import mentoring.projectmedicalappointments.appointment.infrastructure.output.persistence.jpa.repository.IAppointmentRepository;
import mentoring.projectmedicalappointments.doctor.infrastructure.output.persistence.jpa.entity.DoctorEntity;
import java.time.LocalDateTime;
import java.util.List;

@RequiredArgsConstructor
public class AppointmentAdapter implements IAppointmentPersistencePort {

    private final IAppointmentRepository appointmentRepository;
    private final IAppointmentEntityMapper appointmentEntityMapper;

    @Override
    public Long saveAppointment(Appointment appointment) {
        return appointmentRepository.save(appointmentEntityMapper.modelToEntity(appointment)).getAppointmentId();
    }

    @Override
    public Boolean existsAppointmentByDoctorAndScheduledDate(Long doctorId, LocalDateTime scheduledDate) {
        DoctorEntity doctorEntity = new DoctorEntity(doctorId);
        return appointmentRepository.existsByDoctorAndScheduledDate(doctorEntity, scheduledDate);
    }

    @Override
    public List<Appointment> getAppointments() {
        return appointmentEntityMapper.entitiesToModels(appointmentRepository.findAll());
    }
}
