package uber.uber.strategies.impl;

import uber.uber.dto.RideRequestDto;
import uber.uber.entities.Driver;
import uber.uber.strategies.DriverMatchingStrategy;

import java.util.List;

public class DriverMatchingHighestRatedDriverStrategy implements DriverMatchingStrategy {
    @Override
    public List<Driver> findMatchingDriver(RideRequestDto rideRequestDto) {
        return List.of();
    }
}
