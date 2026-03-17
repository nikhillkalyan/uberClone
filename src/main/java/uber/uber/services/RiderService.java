package uber.uber.services;

import uber.uber.dto.DriverDto;
import uber.uber.dto.RideDto;
import uber.uber.dto.RideRequestDto;
import uber.uber.dto.RiderDto;

import java.util.List;

public interface RiderService {

    RideRequestDto requestRide(RideRequestDto rideRequestDto);

    RideDto cancelRide(Long rideId);

    DriverDto rateDriver(Long rideId, Integer rating);

    RiderDto getMyProfile();

    List<RideDto> getAllMyRides();
}
