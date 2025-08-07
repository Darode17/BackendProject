package repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import model.Donar;

public interface DonorRepository extends JpaRepository<Donar, Long> {
    List<Donar> findByBloodGroupAndCityAndAvailableTrue(String bloodGroup, String city);
}