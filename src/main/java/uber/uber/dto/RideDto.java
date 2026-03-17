package uber.uber.dto;

import org.locationtech.jts.geom.Point;
import uber.uber.entities.enums.PaymentMethod;
import uber.uber.entities.enums.RideStatus;

import java.time.LocalDateTime;

public class RideDto {

    private Long id;
    private Point pickupLocation;
    private Point dropOffLocation;

    private LocalDateTime createdTime;
    private RiderDto rider;
    private DriverDto driver;
    private PaymentMethod paymentMethod;

    private RideStatus rideStatus;

    private Double fare;
    private LocalDateTime startedAt;
    private LocalDateTime endedAt;
}
