package uber.uber.services.impl;

import org.springframework.stereotype.Service;
import uber.uber.dto.DriverDto;
import uber.uber.dto.RideDto;
import uber.uber.dto.RideRequestDto;
import uber.uber.dto.RiderDto;
import uber.uber.services.RiderService;

import java.util.List;

@Service
public class RiderServiceImpl implements RiderService {
    @Override
    public RideRequestDto requestRide(RideRequestDto rideRequestDto) {
        return null;
    }

    @Override
    public RideDto cancelRide(Long rideId) {
        return null;
    }

    @Override
    public DriverDto rateDriver(Long rideId, Integer rating) {
        return null;
    }

    @Override
    public RiderDto getMyProfile() {
        return null;
    }

    @Override
    public List<RideDto> getAllMyRides() {
        return List.of();
    }
}
