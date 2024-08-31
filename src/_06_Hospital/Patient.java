package _06_Hospital;

public class Patient {
	boolean cared = false;
	boolean feelsCaredFor() {
		
		return cared;
	}
	
	int checkPulse() {
		cared = true;
		return 9999;
	}
	
	void setCaredTrue() {
		cared = true;
	}
	
}
