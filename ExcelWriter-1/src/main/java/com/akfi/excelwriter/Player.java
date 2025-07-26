package com.akfi.excelwriter;

public class Player {
    private String name;
    private String fatherName;
    private String aadhaar;
    private String email;
    private String mobile1;
    private String mobile2;
    private String address;
    private String state;
    private String pin;
    private String bloodGroup;
    private String dob;

    // ✅ Generate Getters and Setters (Very important)
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getFatherName() { return fatherName; }
    public void setFatherName(String fatherName) { this.fatherName = fatherName; }

    public String getAadhaar() { return aadhaar; }
    public void setAadhaar(String aadhaar) { this.aadhaar = aadhaar; }

    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }

    public String getMobile1() { return mobile1; }
    public void setMobile1(String mobile1) { this.mobile1 = mobile1; }

    public String getMobile2() { return mobile2; }
    public void setMobile2(String mobile2) { this.mobile2 = mobile2; }

    public String getAddress() { return address; }
    public void setAddress(String address) { this.address = address; }

    public String getState() { return state; }
    public void setState(String state) { this.state = state; }

    public String getPin() { return pin; }
    public void setPin(String pin) { this.pin = pin; }

    public String getBloodGroup() { return bloodGroup; }
    public void setBloodGroup(String bloodGroup) { this.bloodGroup = bloodGroup; }

    public String getDob() { return dob; }
    public void setDob(String dob) { this.dob = dob; }
}
