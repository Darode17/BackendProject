package com.backend.bloodbank_backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.backend.bloodbank_backend.model.Donor;

public interface DonorRepository extends JpaRepository<Donor, Long> {
}
