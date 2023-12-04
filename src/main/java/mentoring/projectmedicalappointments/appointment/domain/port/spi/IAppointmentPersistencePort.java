package mentoring.projectmedicalappointments.appointment.domain.port.spi;

import mentoring.projectmedicalappointments.appointment.domain.model.Appointment;
import java.time.LocalDateTime;
import java.util.List;

public interface IAppointmentPersistencePort {

    Long saveAppointment(Appointment appointment);

    Boolean existsAppointmentByDoctorAndScheduledDate(Long doctorId, LocalDateTime scheduledDate);

    List<Appointment> getAppointments();
}
