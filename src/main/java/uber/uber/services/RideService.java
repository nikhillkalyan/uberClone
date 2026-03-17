package uber.uber.services;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import uber.uber.dto.RideRequestDto;
import uber.uber.entities.Ride;
import uber.uber.entities.enums.RideStatus;

import java.sql.Driver;

public interface RideService {

    Ride getRideById(Long rideId);

    void matchWithDrivers(RideRequestDto rideRequestDto);

    Ride createNewRide(RideRequestDto rideRequestDto, Driver driver);

    Ride updateRideStatus(Long rideId, RideStatus rideStatus);

    Page<Ride> getAllRidesOfRider(Long riderId, PageRequest pageRequest);

    Page<Ride> getAllRidesOfDriver(Long driverId, PageRequest pageRequest);
}
