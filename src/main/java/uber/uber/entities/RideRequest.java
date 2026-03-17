package uber.uber.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import lombok.Getter;
import lombok.Setter;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.EnumType;
import jakarta.persistence.FetchType;

import java.time.LocalDateTime;

import uber.uber.entities.enums.PaymentMethod;
import uber.uber.entities.enums.RideRequestStatus;

import org.hibernate.annotations.CreationTimestamp;
import org.locationtech.jts.geom.Point;

@Entity
@Getter
@Setter
public class RideRequest {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(columnDefinition = "Geometry(Point, 4326)")
    private Point pickupLocation;
    @Column(columnDefinition = "Geometry(Point, 4326)")
    private Point dropoffLocation;

    @CreationTimestamp
    private LocalDateTime requestedTime;

    @ManyToOne(fetch = FetchType.LAZY)
    private Rider rider;

    @Enumerated(EnumType.STRING)
    private RideRequestStatus rideRequestStatus;

    @Enumerated(EnumType.STRING)
    private PaymentMethod paymentMethod;
}