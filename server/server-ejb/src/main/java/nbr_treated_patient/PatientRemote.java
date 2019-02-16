package nbr_treated_patient;

import javax.ejb.Remote;

@Remote
public interface PatientRemote {
	
	String ConsommationDay();
	
	String ConsommationWeek();
	
	String ConsommationMonth();
	
	
	String Report_Numbers();
	
	String Report_Description();

}
