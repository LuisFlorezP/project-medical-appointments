package mentoring.projectmedicalappointments.doctor.application.handler;

import mentoring.projectmedicalappointments.doctor.application.dto.request.DoctorRequest;
import mentoring.projectmedicalappointments.doctor.application.dto.response.DoctorLocationResponse;
import mentoring.projectmedicalappointments.doctor.application.dto.response.DoctorResponse;
import mentoring.projectmedicalappointments.doctor.application.dto.response.DoctorSpecializationResponse;
import java.util.List;

public interface IDoctorHandler {

    Long saveDoctor(DoctorRequest request);

    DoctorResponse getDoctorById(Long doctorId);

    List<DoctorResponse> getDoctors();

    List<DoctorLocationResponse> getDoctorsByLocation(Long locationId);

    List<DoctorSpecializationResponse> getDoctorsBySpecialization(Long specializationId);
}
