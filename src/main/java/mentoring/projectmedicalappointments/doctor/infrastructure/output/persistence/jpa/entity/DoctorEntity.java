package mentoring.projectmedicalappointments.doctor.infrastructure.output.persistence.jpa.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.*;
import mentoring.projectmedicalappointments.appointment.infrastructure.output.persistence.jpa.entity.AppointmentEntity;
import javax.persistence.*;
import java.util.List;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "doctor_entity")
public class DoctorEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "doctor_id", nullable = false)
    private Long doctorId;

    @Column(name = "name", nullable = false)
    private String name;

    @Column(name = "availability", nullable = false)
    private Boolean availability;

    @ManyToOne
    @JoinColumn(name = "id_specialization", referencedColumnName = "specialization_id")
    @JsonIgnoreProperties("doctors")
    private SpecializationEntity specialization;

    @ManyToOne
    @JoinColumn(name = "id_location", referencedColumnName = "location_id")
    @JsonIgnoreProperties("doctors")
    private LocationEntity location;

    @OneToMany(mappedBy = "doctor", cascade = CascadeType.ALL, orphanRemoval = true)
    @JsonIgnore
    private List<AppointmentEntity> appointments;

    public DoctorEntity(Long doctorId) {
        this.doctorId = doctorId;
    }
}
