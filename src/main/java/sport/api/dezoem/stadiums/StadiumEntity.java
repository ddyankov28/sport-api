package sport.api.dezoem.stadiums;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Table(name = "Stadiums")
public class StadiumEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String team;
    private String city;
    private Integer capacity;
    private Double longitude;
    private Double latitude;
    private String shortCode;
}
