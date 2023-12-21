package com.example.clouddemo.controller;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.clouddemo.model.CloudVendor;

@RestController
@RequestMapping("/venu533")
public class CloudVendorAPIService {
    CloudVendor cloudVendor;

    @GetMapping("/{vendorID}")
    public CloudVendor getCloudVendorDetails(@PathVariable String vendorID) {
        if (cloudVendor != null && cloudVendor.getVendorID().equals(vendorID)) {
            return cloudVendor;
        } else {
            // Handle the case when the vendorID is not found
            return null;
        }
    }

    @PostMapping
    public String postCloudVendorDetails(@RequestBody CloudVendor cloudVendor) {
        this.cloudVendor = cloudVendor;
        return "Cloud vendor added successfully";
    }

    @PutMapping
    public String updateCloudVendorDetails(@RequestBody CloudVendor cloudVendor) {
        this.cloudVendor = cloudVendor;
        return "Cloud vendor updated successfully";
    }

    @DeleteMapping("/{vendorID}")
    public String deleteCloudVendorDetails(@PathVariable String vendorID) {
        if (cloudVendor != null && cloudVendor.getVendorID().equals(vendorID)) {
            this.cloudVendor = null;
            return "Cloud vendor deleted successfully";
        } else {
            // Handle the case when the vendorID is not found
            return "Cloud vendor not found for deletion";
        }
    }
}
