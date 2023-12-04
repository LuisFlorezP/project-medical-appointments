package mentoring.projectmedicalappointments.appointment.application.handler.impl;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import mentoring.projectmedicalappointments.appointment.application.dto.request.AppointmentRequest;
import mentoring.projectmedicalappointments.appointment.application.dto.response.AppointmentResponse;
import mentoring.projectmedicalappointments.appointment.application.handler.IAppointmentHandler;
import mentoring.projectmedicalappointments.appointment.application.mapper.IAppointmentMapper;
import mentoring.projectmedicalappointments.appointment.domain.model.Appointment;
import mentoring.projectmedicalappointments.appointment.domain.port.api.IAppointmentServicePort;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import java.util.List;
import static mentoring.projectmedicalappointments.common.application.utils.Constants.*;

@Slf4j
@Service
@Transactional
@RequiredArgsConstructor
public class AppointmentHandler implements IAppointmentHandler {

    private final IAppointmentServicePort appointmentServicePort;
    private final IAppointmentMapper appointmentMapper;

    @Override
    public Long saveAppointment(AppointmentRequest request) {
        log.info(LOG_START_SAVE_APPOINTMENT);

        Appointment appointment = appointmentMapper.requestToModel(request);
        Long appointmentId = appointmentServicePort.saveAppointment(appointment);

        log.info(LOG_END_SAVE_APPOINTMENT);
        return appointmentId;
    }

    @Override
    public List<AppointmentResponse> getAppointments() {
        log.info(LOG_START_GET_APPOINTMENTS);

        List<Appointment> appointmentList = appointmentServicePort.getAppointments();
        List<AppointmentResponse> responseList = appointmentMapper.modelsToResponses(appointmentList);

        log.info(LOG_END_GET_APPOINTMENTS);
        return responseList;
    }
}
