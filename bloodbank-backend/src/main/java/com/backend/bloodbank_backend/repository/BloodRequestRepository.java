package com.backend.bloodbank_backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.backend.bloodbank_backend.model.BloodRequest;

public interface BloodRequestRepository extends JpaRepository<BloodRequest, Long> {

}
