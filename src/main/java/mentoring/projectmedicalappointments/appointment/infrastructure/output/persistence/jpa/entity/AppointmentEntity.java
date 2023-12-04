package mentoring.projectmedicalappointments.appointment.infrastructure.output.persistence.jpa.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import mentoring.projectmedicalappointments.doctor.infrastructure.output.persistence.jpa.entity.DoctorEntity;
import javax.persistence.*;
import java.time.LocalDateTime;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "appointment_entity")
public class AppointmentEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "appointment_id", nullable = false)
    private Long appointmentId;

    @Column(name = "scheduled_date", nullable = false)
    private LocalDateTime scheduledDate;

    @ManyToOne
    @JoinColumn(name = "id_appointment_state", referencedColumnName = "appointment_state_id")
    @JsonIgnoreProperties("appointments")
    private AppointmentStateEntity state;

    @ManyToOne
    @JoinColumn(name = "id_doctor", referencedColumnName = "doctor_id")
    @JsonIgnoreProperties("appointments")
    private DoctorEntity doctor;
}
