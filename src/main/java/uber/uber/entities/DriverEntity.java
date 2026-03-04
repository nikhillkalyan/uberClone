package uber.uber.entities;

import jakarta.persistence.*;
import org.locationtech.jts.geom.Point;

@Entity
public class DriverEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne
    @JoinColumn(name = "user_id")
    private UserEntity user;

    private Double rating;
    private Boolean available;

    @Column(columnDefinition = "geometry(Point, 4326)")  // Use PostGIS geometry type for location. 4326 is used for Earth coordinates (latitude and longitude).
    Point currentLocation;
}
