package mentoring.projectmedicalappointments.doctor.infrastructure.output.persistence.jpa.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;
import javax.persistence.*;
import java.util.List;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "specialization_entity")
public class SpecializationEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "specialization_id", nullable = false)
    private Long specializationId;

    @Column(name = "name", nullable = false)
    private String name;

    @OneToMany(mappedBy = "specialization", cascade = CascadeType.ALL, orphanRemoval = true)
    @JsonIgnore
    private List<DoctorEntity> doctors;

    public SpecializationEntity(Long specializationId) {
        this.specializationId = specializationId;
    }
}
