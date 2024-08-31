package _06_Hospital;

import java.util.ArrayList;

import javax.swing.JOptionPane;

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
	
	public void assignPatientsToDoctors() throws DoctorFullException{
		int count = 0;
		for(int i=0;i<unassignedPatients.size();i++) {
			if(Doctors.get(count).getPatients().size() < 3) {
				Doctors.get(count).assignPatient(unassignedPatients.get(i));
			}
			else {
				count++;
				throw new DoctorFullException();
				//JOptionPane.showMessageDialog(null, "nah");
			}
		}
	}
	
	
		
}
