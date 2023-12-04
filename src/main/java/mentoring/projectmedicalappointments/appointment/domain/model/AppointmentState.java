package mentoring.projectmedicalappointments.appointment.domain.model;

public class AppointmentState {

    private Long appointmentStateId;
    private String name;

    public Long getAppointmentStateId() {
        return appointmentStateId;
    }

    public void setAppointmentStateId(Long appointmentStateId) {
        this.appointmentStateId = appointmentStateId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
