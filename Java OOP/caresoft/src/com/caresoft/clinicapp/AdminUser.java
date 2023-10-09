package com.caresoft.clinicapp;

import java.util.ArrayList;
import java.util.Date;

public class AdminUser extends User implements HIPAACompliantUser, HIPAACompliantAdmin {
	
    // Member variables
    private Integer employeeID;
    private String role;
    private ArrayList<String> securityIncidents;
    
    // Constructor
    public AdminUser(int id, String role) {
		super(id);
		this.role = role;
		securityIncidents = new ArrayList<>();
	}

    // Method to add a new incident
    public void newIncident(String notes) {
        String report = "Datetime Submitted: " + new Date() + 
                        "\n Reported By ID: " + this.id + 
                        "\n Notes: " + notes;
        securityIncidents.add(report);
    }

    // Method to report authorization incident
    public void authIncident() {
        String report = "Datetime Submitted: " + new Date() + 
                        "\n ID: " + this.id + 
                        "\n Notes: AUTHORIZATION ATTEMPT FAILED FOR THIS USER";
        securityIncidents.add(report);
    }

    // Method from HIPAACompliantAdmin interface
    @Override
	public ArrayList<String> reportSecurityIncidents() {
		return securityIncidents;
	}

    // Method from HIPAACompliantUser interface
	@Override
	public boolean assignPin(int pin) {
		if(pin > 99999 && pin < 1000000) {
			return true;
		} else {
			return false;
		}
	}

    // Method from HIPAACompliantUser interface
	@Override
	public boolean accessAuthorized(Integer confirmedAuthID) {
		if(this.id.equals(confirmedAuthID)) {
			return true;
		} else {
			authIncident();
			return false;
		}
	}

    // Getters and setters
	public Integer getEmployeeID() {
		return employeeID;
	}

	public void setEmployeeID(Integer empID) {
		this.employeeID = empID;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String r) {
		this.role = r;
	}

	public ArrayList<String> getSecurityIncidents() {
		return securityIncidents;
	}

	public void setSecurityIncidents(ArrayList<String> incidents) {
		this.securityIncidents = incidents;
	}
}
