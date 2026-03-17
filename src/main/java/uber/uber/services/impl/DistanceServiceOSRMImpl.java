package uber.uber.services.impl;


import org.locationtech.jts.geom.Point;
import org.springframework.stereotype.Service;
import uber.uber.services.DistanceService;

@Service
public class DistanceServiceOSRMImpl implements DistanceService {
    @Override
    public double calculateDistance(org.locationtech.jts.geom.Point src, Point dest) {
        return 0;
    }
}