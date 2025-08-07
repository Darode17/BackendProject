package repository;

import org.springframework.data.jpa.repository.JpaRepository;

import model.BloodRequest;

public interface BloodRequestRepository extends JpaRepository<BloodRequest, Long> {

}
