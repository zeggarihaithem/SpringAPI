package com.exemple.springapi.Service.Impl;

import com.exemple.springapi.Model.Vendor;
import com.exemple.springapi.Repository.VendorRepository;
import com.exemple.springapi.Service.VendorService;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class VendorServiceImpl implements VendorService {
    VendorRepository vendorRepository;

    public VendorServiceImpl(VendorRepository vendorRepository) {
        this.vendorRepository = vendorRepository;
    }

    @Override
    public String createVendor(Vendor vendor) {
        //Sauvegarder à la base de données
        vendorRepository.save(vendor);
        return "Success";
    }

    @Override
    public String updateVendor(Vendor vendor) {
        //Sauvegarder à la base de données
        vendorRepository.save(vendor);
        return "Success";
    }

    @Override
    public Vendor getVendor(String vendorId) {
        return vendorRepository.findById(vendorId).get();
    }

    @Override
    public String deleteVendor(String vendorId) {
        vendorRepository.deleteById(vendorId);
       return "success";
    }

    @Override
    public List<Vendor> getAllVendors() {
        return vendorRepository.findAll();
    }
}
