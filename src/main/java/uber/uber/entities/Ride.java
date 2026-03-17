package uber.uber.entities;

import lombok.Getter;
import lombok.Setter;
import uber.uber.entities.enums.PaymentMethod;
import uber.uber.entities.enums.RideRequestStatus;
import uber.uber.entities.enums.RideStatus;

import java.time.LocalDateTime;

import org.locationtech.jts.geom.Point;

import org.hibernate.annotations.CreationTimestamp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.ManyToOne;

@Getter
@Setter
@Entity
public class Ride {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(columnDefinition = "Geometry(Point, 4326)")
    private Point pickupLocation;
    @Column(columnDefinition = "Geometry(Point, 4326)")
    private Point dropoffLocation;

    @CreationTimestamp
    private LocalDateTime createdTime;

    @ManyToOne(fetch = FetchType.LAZY)
    private Rider rider;

    @ManyToOne(fetch = FetchType.LAZY)
    private Driver driver;

    @Enumerated(EnumType.STRING)
    private RideRequestStatus rideRequestStatus;

    @Enumerated(EnumType.STRING)
    private PaymentMethod paymentMethod;

    @Enumerated(EnumType.STRING)
    private RideStatus rideStatus;
    private Double fare;
    private LocalDateTime startedAt;
    private LocalDateTime endedAt;
}
