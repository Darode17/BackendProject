package controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import jakarta.validation.Valid;
import model.Donor;
import service.DonorService;

@RestController
@RequestMapping("/api/donors")
public class DonorController {

    @Autowired
    private DonorService donorService;

    @PostMapping
    public ResponseEntity<Donor> addDonor(@Valid @RequestBody Donor donor) {
        return new ResponseEntity<>(donorService.createDonor(donor), HttpStatus.CREATED);
    }

    @GetMapping
    public List<Donor> getAll() {
        return donorService.getAllDonors();
    }

    @GetMapping("/{id}")
    public Donor getById(@PathVariable Long id) {
        return donorService.getDonor(id);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> delete(@PathVariable Long id) {
        donorService.deleteDonor(id);
        return ResponseEntity.ok("Donor deleted successfully");
    }
}
