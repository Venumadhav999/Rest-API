package com.example.clouddemo.model;

public class CloudVendor {
    private String vendorID;
    private String vendorName;
    private String vendorAddress;
    private String vendorPhno;

    // Empty constructor
    public CloudVendor() {
    }

    public CloudVendor(String vendorID, String vendorName, String vendorAddress, String vendorPhno) {
        this.vendorID = vendorID;
        this.vendorName = vendorName;
        this.vendorAddress = vendorAddress;
        this.vendorPhno = vendorPhno;
    }

    public void setVendorID(String vendorID) {
        this.vendorID = vendorID;
    }

    public void setVendorName(String vendorName) {
        this.vendorName = vendorName;
    }

    public void setVendorAddress(String vendorAddress) {
        this.vendorAddress = vendorAddress;
    }

    public void setVendorPhno(String vendorPhno) {
        this.vendorPhno = vendorPhno;
    }

    public String getVendorID() {
        return vendorID;
    }

    public String getVendorName() {
        return vendorName;
    }

    public String getVendorAddress() {
        return vendorAddress;
    }

    public String getVendorPhno() {
        return vendorPhno;
    }

    @Override
    public String toString() {
        return "CloudVendor [vendorID=" + vendorID + ", vendorName=" + vendorName + ", vendorAddress=" + vendorAddress
                + ", vendorPhno=" + vendorPhno + "]";
    }
}
