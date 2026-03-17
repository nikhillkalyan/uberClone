package uber.uber.strategies;

import uber.uber.dto.RideRequestDto;
import uber.uber.entities.Driver;

import java.util.List;

public interface DriverMatchingStrategy {
    List<Driver> findMatchingDriver(RideRequestDto rideRequestDto);
}
