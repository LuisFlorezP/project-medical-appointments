package mentoring.projectmedicalappointments.patient.infrastructure.output.persistence.jpa.mapper;

import mentoring.projectmedicalappointments.patient.domain.model.Patient;
import mentoring.projectmedicalappointments.patient.infrastructure.output.persistence.jpa.entity.PatientEntity;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.ReportingPolicy;
import java.util.List;

@Mapper(componentModel = "spring",
        unmappedSourcePolicy = ReportingPolicy.IGNORE,
        unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface IPatientEntityMapper {

    @Mapping(source = "gender.genderId", target = "gender.genderId")
    Patient entityToModel(PatientEntity patientEntity);

    List<Patient> entitiesToModels(List<PatientEntity> patientEntityList);

    @Mapping(source = "gender.genderId", target = "gender.genderId")
    PatientEntity modelToEntity(Patient patient);
}
