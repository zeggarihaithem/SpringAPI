package com.exemple.springapi.Controller;

import com.exemple.springapi.Model.Vendor;
import com.exemple.springapi.Service.VendorService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/vendor")
public class VendorController {
    VendorService vendorService;
    public VendorController(VendorService vendorService) {

        this.vendorService = vendorService;
    }

    // for one vendor
    @GetMapping("{vendorId}")
    public Vendor getVendor(@PathVariable String vendorId) {

        return vendorService.getVendor(vendorId);
    }
    // Read all vendors from database
    @GetMapping()
    public List<Vendor> getAllVendor() {

        return vendorService.getAllVendors();
    }

    @PostMapping
    @ResponseStatus(code = HttpStatus.CREATED, reason = "OK")
    public String createVendor(@RequestBody Vendor vendor) {
        vendorService.createVendor(vendor);
        return "Vendor created";
    }

    @PutMapping
    public String updateVendor(@RequestBody Vendor vendor) {
        vendorService.updateVendor(vendor);
        return "Vendor updated";
    }

    @DeleteMapping("{vendorId}")
    public String deleteVendor(@PathVariable("vendorId") String vendorId) {
        vendorService.deleteVendor(vendorId);
        return "Vendor deleted";
    }

}
