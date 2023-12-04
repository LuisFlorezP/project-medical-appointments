package mentoring.projectmedicalappointments.doctor.infrastructure.output.persistence.jpa.mapper;

import mentoring.projectmedicalappointments.doctor.domain.model.Doctor;
import mentoring.projectmedicalappointments.doctor.infrastructure.output.persistence.jpa.entity.DoctorEntity;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.ReportingPolicy;

import java.util.List;

@Mapper(componentModel = "spring",
        unmappedSourcePolicy = ReportingPolicy.IGNORE,
        unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface IDoctorEntityMapper {

    @Mapping(source = "location.locationId", target = "location.locationId")
    @Mapping(source = "specialization.specializationId", target = "specialization.specializationId")
    Doctor entityToModel(DoctorEntity doctorEntity);

    List<Doctor> entitiesToModels(List<DoctorEntity> doctorEntityList);

    @Mapping(source = "location.locationId", target = "location.locationId")
    @Mapping(source = "specialization.specializationId", target = "specialization.specializationId")
    DoctorEntity modelToEntity(Doctor doctor);
}
