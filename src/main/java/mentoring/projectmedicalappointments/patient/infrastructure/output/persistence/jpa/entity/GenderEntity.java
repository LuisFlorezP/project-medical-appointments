package mentoring.projectmedicalappointments.patient.infrastructure.output.persistence.jpa.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import javax.persistence.*;
import java.util.List;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "gender_entity")
public class GenderEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "gender_id", nullable = false)
    private Long genderId;

    @Column(name = "name", nullable = false)
    private String name;

    @OneToMany(mappedBy = "gender", cascade = CascadeType.ALL, orphanRemoval = true)
    @JsonIgnore
    private List<PatientEntity> patients;
}
