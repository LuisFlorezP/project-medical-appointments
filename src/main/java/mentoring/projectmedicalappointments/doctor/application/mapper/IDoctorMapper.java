package mentoring.projectmedicalappointments.doctor.application.mapper;

import mentoring.projectmedicalappointments.doctor.application.dto.request.DoctorRequest;
import mentoring.projectmedicalappointments.doctor.application.dto.response.DoctorLocationResponse;
import mentoring.projectmedicalappointments.doctor.application.dto.response.DoctorResponse;
import mentoring.projectmedicalappointments.doctor.application.dto.response.DoctorSpecializationResponse;
import mentoring.projectmedicalappointments.doctor.domain.model.Doctor;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.ReportingPolicy;
import java.util.List;

@Mapper(componentModel = "spring",
        unmappedSourcePolicy = ReportingPolicy.IGNORE,
        unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface IDoctorMapper {

    @Mapping(source = "specialization.name", target = "specialization")
    @Mapping(source = "location.name", target = "location")
    @Mapping(source = "doctorId", target = "id")
    DoctorResponse modelToResponse(Doctor doctor);

    List<DoctorResponse> modelsToResponses(List<Doctor> doctorList);

    @Mapping(source = "specialization.name", target = "specialization")
    @Mapping(source = "doctorId", target = "id")
    DoctorLocationResponse modelLocationToResponse(Doctor doctor);

    List<DoctorLocationResponse> modelsLocationToResponses(List<Doctor> doctorList);

    @Mapping(source = "location.name", target = "location")
    @Mapping(source = "doctorId", target = "id")
    DoctorSpecializationResponse modelSpecializationToResponse(Doctor doctor);

    List<DoctorSpecializationResponse> modelsSpecializationToResponses(List<Doctor> doctorList);

    @Mapping(source = "specialization", target = "specialization.specializationId")
    @Mapping(source = "location", target = "location.locationId")
    Doctor requestToModel(DoctorRequest request);
}
