package uber.uber.strategies.impl;

import org.springframework.stereotype.Service;
import uber.uber.dto.RideRequestDto;
import uber.uber.entities.Driver;
import uber.uber.strategies.DriverMatchingStrategy;

import java.util.List;

@Service
public class DriverMatchingNearestDriverStrategy implements DriverMatchingStrategy {
    @Override
    public List<Driver> findMatchingDriver(RideRequestDto rideRequestDto) {
        return List.of();
    }
}
