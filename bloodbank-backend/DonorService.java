package service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.backend.bloodbank_backend.model.Donor;
import com.backend.bloodbank_backend.repository.DonorRepository;

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
        return donorRepo.findById(id)
                .orElseThrow(() -> new RuntimeException("Donor not found"));
    }

    public void deleteDonor(Long id) {
        donorRepo.deleteById(id);
    }
}
