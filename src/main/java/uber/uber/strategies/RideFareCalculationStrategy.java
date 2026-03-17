package uber.uber.strategies;

import uber.uber.dto.RideRequestDto;

public interface RideFareCalculationStrategy {
    double calculateFare(RideRequestDto rideRequestDto);
}
