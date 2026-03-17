package uber.uber.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.locationtech.jts.geom.Point;
import uber.uber.entities.enums.PaymentMethod;
import uber.uber.entities.enums.RideRequestStatus;

import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class RideRequestDto {

    private Long id;

    private Point pickupLocation;

    private Point dropOffLocation;

    private LocalDateTime requestedTime;

    private RiderDto rider;

    private PaymentMethod paymentMethod;

    private RideRequestStatus rideRequestStatus;
}
