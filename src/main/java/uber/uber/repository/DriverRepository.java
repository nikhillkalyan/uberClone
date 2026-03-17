package uber.uber.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import uber.uber.entities.Driver;

@Repository
public interface DriverRepository extends JpaRepository<Driver, Long> {
}
