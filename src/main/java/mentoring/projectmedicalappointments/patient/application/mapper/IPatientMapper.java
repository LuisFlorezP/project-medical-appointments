package mentoring.projectmedicalappointments.patient.application.mapper;

import mentoring.projectmedicalappointments.patient.application.dto.request.PatientRequest;
import mentoring.projectmedicalappointments.patient.application.dto.response.PatientResponse;
import mentoring.projectmedicalappointments.patient.domain.model.Patient;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.ReportingPolicy;
import java.util.List;

@Mapper(componentModel = "spring",
        unmappedSourcePolicy = ReportingPolicy.IGNORE,
        unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface IPatientMapper {

    @Mapping(source = "gender.name", target = "gender")
    @Mapping(source = "patientId", target = "id")
    PatientResponse modelToResponse(Patient patient);

    List<PatientResponse> modelsToResponses(List<Patient> patientList);

    @Mapping(source = "gender", target = "gender.genderId")
    Patient requestToModel(PatientRequest request);
}
