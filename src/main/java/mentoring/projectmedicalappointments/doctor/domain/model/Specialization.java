package mentoring.projectmedicalappointments.doctor.domain.model;

public class Specialization {

    private Long specializationId;
    private String name;

    public Long getSpecializationId() {
        return specializationId;
    }

    public void setSpecializationId(Long specializationId) {
        this.specializationId = specializationId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
