package com.exemple.springapi.Service;

import com.exemple.springapi.Model.Vendor;

import java.util.List;

public interface VendorService {
    public String createVendor(Vendor vendor);
    public String updateVendor(Vendor vendor);
    public String deleteVendor(String vendorId);
    public Vendor getVendor(String vendorId);
    public List<Vendor> getAllVendors();

}
