package com.backend.bloodbank_backend.service;

import com.backend.bloodbank_backend.model.Donor;
import com.backend.bloodbank_backend.repository.DonorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class DonorService {

    @Autowired
    private DonorRepository donorRepo;

    public Donor createDonor(Donor donor) {
        return donorRepo.save(donor);
    }

    public List<Donor> getAllDonors() {
        return donorRepo.findAll();
    }

    public Donor getDonor(Long id) {
        return donorRepo.findById(id).orElse(null);
    }

    public void deleteDonor(Long id) {
        donorRepo.deleteById(id);
    }
}
