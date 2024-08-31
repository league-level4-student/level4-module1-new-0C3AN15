package _06_Hospital;

import java.util.ArrayList;

public abstract class Doctor {
	
	ArrayList<Patient> Patients = new ArrayList<Patient>();

	public void doMedicine() {
		for(int i=0;i<Patients.size();i++) {
			Patients.get(i).setCaredTrue();
		}
	}
	
	public ArrayList<Patient> getPatients() {
		
		return Patients;
	}
	
	public void assignPatient(Patient patient) {
		Patients.add(patient);
	}
	
}
