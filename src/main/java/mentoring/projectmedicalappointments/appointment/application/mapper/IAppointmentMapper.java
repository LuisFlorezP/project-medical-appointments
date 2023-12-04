package mentoring.projectmedicalappointments.appointment.application.mapper;

import mentoring.projectmedicalappointments.appointment.application.dto.request.AppointmentRequest;
import mentoring.projectmedicalappointments.appointment.application.dto.response.AppointmentResponse;
import mentoring.projectmedicalappointments.appointment.domain.model.Appointment;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.ReportingPolicy;
import java.util.List;

@Mapper(componentModel = "spring",
        unmappedSourcePolicy = ReportingPolicy.IGNORE,
        unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface IAppointmentMapper {

    @Mapping(source = "state.appointmentStateId", target = "state")
    @Mapping(source = "doctor.doctorId", target = "doctor.id")
    @Mapping(source = "doctor.name", target = "doctor.name")
    @Mapping(source = "appointmentId", target = "id")
    AppointmentResponse modelToResponse(Appointment appointment);

    List<AppointmentResponse> modelsToResponses(List<Appointment> appointment);

    @Mapping(source = "doctor", target = "doctor.doctorId")
    @Mapping(target = "state.appointmentStateId", constant = "1L")
    Appointment requestToModel(AppointmentRequest request);
}
