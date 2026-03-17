package uber.uber.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import uber.uber.entities.RideRequest;

@Repository
public interface RideRequestRepository extends JpaRepository<RideRequest, Long> {

}
