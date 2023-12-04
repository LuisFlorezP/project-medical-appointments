package mentoring.projectmedicalappointments.doctor.application.handler;

import mentoring.projectmedicalappointments.doctor.application.dto.request.DoctorRequest;
import mentoring.projectmedicalappointments.doctor.application.dto.response.DoctorResponse;
import java.util.List;

public interface IDoctorHandler {

    Long saveDoctor(DoctorRequest request);

    DoctorResponse getDoctorById(Long doctorId);

    List<DoctorResponse> getDoctors();
}
