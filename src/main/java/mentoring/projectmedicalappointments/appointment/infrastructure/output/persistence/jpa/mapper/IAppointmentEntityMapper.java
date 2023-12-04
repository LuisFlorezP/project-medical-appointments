package mentoring.projectmedicalappointments.appointment.infrastructure.output.persistence.jpa.mapper;

import mentoring.projectmedicalappointments.appointment.domain.model.Appointment;
import mentoring.projectmedicalappointments.appointment.infrastructure.output.persistence.jpa.entity.AppointmentEntity;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.ReportingPolicy;
import java.util.List;

@Mapper(componentModel = "spring",
        unmappedSourcePolicy = ReportingPolicy.IGNORE,
        unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface IAppointmentEntityMapper {

    @Mapping(source = "state.appointmentStateId", target = "state.appointmentStateId")
    @Mapping(source = "doctor.doctorId", target = "doctor.doctorId")
    Appointment entityToModel(AppointmentEntity appointmentEntity);

    List<Appointment> entitiesToModels(List<AppointmentEntity> appointmentEntityList);

    @Mapping(source = "state.appointmentStateId", target = "state.appointmentStateId")
    @Mapping(source = "doctor.doctorId", target = "doctor.doctorId")
    AppointmentEntity modelToEntity(Appointment appointment);
}
