package _06_Hospital;

import java.util.ArrayList;

public class Hospital {

	ArrayList<Doctor> Doctors = new ArrayList<Doctor>();
	ArrayList<Patient> unassignedPatients = new ArrayList<Patient>();
	
	void addDoctor(Doctor doctor) {
		Doctors.add(doctor);
	}
	
	public void addPatient(Patient patient) {
		unassignedPatients.add(patient);
	}
	
	public ArrayList<Doctor> getDoctors() {
		return Doctors;
	}
	
	public ArrayList<Patient> getPatients() {
		return unassignedPatients;
	}
	
	void assignPatientsToDoctors() {
		//no nah #6 & #5
	}
	
}
