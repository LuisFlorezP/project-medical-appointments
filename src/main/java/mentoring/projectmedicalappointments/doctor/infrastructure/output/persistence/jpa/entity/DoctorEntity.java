package mentoring.projectmedicalappointments.doctor.infrastructure.output.persistence.jpa.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.*;
import javax.persistence.*;

@Setter
@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity(name = "doctor_entity")
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
}
