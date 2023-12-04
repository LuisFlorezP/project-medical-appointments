package mentoring.projectmedicalappointments.appointment.domain.usecase;

import mentoring.projectmedicalappointments.appointment.domain.model.Appointment;
import mentoring.projectmedicalappointments.appointment.domain.port.api.IAppointmentServicePort;
import mentoring.projectmedicalappointments.appointment.domain.port.spi.IAppointmentPersistencePort;
import mentoring.projectmedicalappointments.common.infrastructure.exception.OccupiedSpaceException;
import java.time.LocalDateTime;
import java.util.List;

public class AppointmentUseCase implements IAppointmentServicePort {

    private final IAppointmentPersistencePort appointmentPersistencePort;

    public AppointmentUseCase(IAppointmentPersistencePort appointmentPersistencePort) {
        this.appointmentPersistencePort = appointmentPersistencePort;
    }

    @Override
    public Long saveAppointment(Appointment appointment) {
        Long doctorId = appointment.getDoctor().getDoctorId();
        LocalDateTime scheduledDate = appointment.getScheduledDate();

        boolean existing = appointmentPersistencePort.existsAppointmentByDoctorAndScheduledDate(doctorId, scheduledDate);
        if (existing) {
            throw new OccupiedSpaceException();
        }

        return appointmentPersistencePort.saveAppointment(appointment);
    }

    @Override
    public List<Appointment> getAppointments() {
        return appointmentPersistencePort.getAppointments();
    }
}
