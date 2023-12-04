package mentoring.projectmedicalappointments.appointment.application.handler;

import mentoring.projectmedicalappointments.appointment.application.dto.request.AppointmentRequest;
import mentoring.projectmedicalappointments.appointment.application.dto.response.AppointmentResponse;
import java.util.List;

public interface IAppointmentHandler {

    Long saveAppointment(AppointmentRequest request);

    List<AppointmentResponse> getAppointments();
}
