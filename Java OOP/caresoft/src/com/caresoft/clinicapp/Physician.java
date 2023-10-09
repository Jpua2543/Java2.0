package com.caresoft.clinicapp;

import java.util.ArrayList;
import java.util.Date;

public class Physician extends User implements HIPAACompliantUser {
	
    // Variables
    private ArrayList<String> patientNotes = new ArrayList<>();

    // Constructor
    public Physician(int id) {
		super(id);
	}

    // Check if pin is 4 digits
    @Override
    public boolean assignPin(int pin) {
        if(pin >= 1000 && pin <= 9999) {
			return true;
		} else {
			return false;
		}
    }

    // Check if the id matches
    @Override
    public boolean accessAuthorized(Integer confirmedAuthID) {
        if(this.id.equals(confirmedAuthID)) {
			return true;
		} else {
			return false;
		}
    }
	
    // Add notes for a patient
    public void newPatientNotes(String notes, String patientName, Date date) {
        String report = "Datetime Submitted: " + date + "\n" +
                        "Reported By ID: " + this.id + "\n" +
                        "Patient Name: " + patientName + "\n" +
                        "Notes: " + notes;
        patientNotes.add(report);
    }

    // Getter for patient notes
	public ArrayList<String> getPatientNotes() {
		return patientNotes;
	}

    // Setter for patient notes
	public void setPatientNotes(ArrayList<String> newNotes) {
		this.patientNotes = newNotes;
	}

}
