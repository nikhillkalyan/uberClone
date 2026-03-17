package uber.uber.services.impl;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;
import uber.uber.dto.RideRequestDto;
import uber.uber.entities.Ride;
import uber.uber.entities.enums.RideStatus;
import uber.uber.services.RideService;

import java.sql.Driver;

@Service
public class RideServiceImpl implements RideService {
    @Override
    public Ride getRideById(Long rideId) {
        return null;
    }

    @Override
    public void matchWithDrivers(RideRequestDto rideRequestDto) {

    }

    @Override
    public Ride createNewRide(RideRequestDto rideRequestDto, Driver driver) {
        return null;
    }

    @Override
    public Ride updateRideStatus(Long rideId, RideStatus rideStatus) {
        return null;
    }

    @Override
    public Page<Ride> getAllRidesOfRider(Long riderId, PageRequest pageRequest) {
        return null;
    }

    @Override
    public Page<Ride> getAllRidesOfDriver(Long driverId, PageRequest pageRequest) {
        return null;
    }
}