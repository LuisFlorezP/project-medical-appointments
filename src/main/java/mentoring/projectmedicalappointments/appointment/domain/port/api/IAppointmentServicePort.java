package mentoring.projectmedicalappointments.appointment.domain.port.api;

import mentoring.projectmedicalappointments.appointment.domain.model.Appointment;
import java.util.List;

public interface IAppointmentServicePort {

    Long saveAppointment(Appointment appointment);

    List<Appointment> getAppointments();
}
