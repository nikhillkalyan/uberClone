package uber.uber.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import uber.uber.entities.Rider;

@Repository
public interface RiderRepository extends JpaRepository<Rider, Long> {
}
