package repository;

import model.Donor;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface DonorRepository extends JpaRepository<Donor, Long> {
    List<Donor> findByBloodGroupAndCityAndAvailableTrue(String bloodGroup, String city);
}
