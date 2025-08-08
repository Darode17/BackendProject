package com.backend.bloodbank_backend.controller;

import com.backend.bloodbank_backend.model.Donor;
import com.backend.bloodbank_backend.service.DonorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/donors")
public class DonorController {

    @Autowired
    private DonorService donorService;

    // ✅ Test endpoint
    @GetMapping("/test")
    public String testApi() {
        return "Donor API is working!";
    }

    // ✅ Create donor
    @PostMapping
    public ResponseEntity<Donor> addDonor(@RequestBody Donor donor) {
        return new ResponseEntity<>(donorService.createDonor(donor), HttpStatus.CREATED);
    }

    // ✅ Get all donors
    @GetMapping
    public List<Donor> getAllDonors() {
        return donorService.getAllDonors();
    }

    // ✅ Get donor by ID
    @GetMapping("/{id}")
    public Donor getDonorById(@PathVariable Long id) {
        return donorService.getDonor(id);
    }

    // ✅ Delete donor
    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteDonor(@PathVariable Long id) {
        donorService.deleteDonor(id);
        return ResponseEntity.ok("Donor deleted successfully");
    }
}
