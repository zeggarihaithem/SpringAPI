package com.exemple.springapi.Repository;

import com.exemple.springapi.Model.Vendor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VendorRepository extends JpaRepository<Vendor, String> {

}
