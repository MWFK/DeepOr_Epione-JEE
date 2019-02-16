package nbr_treated_patient;

import javax.ejb.Local;

@Local
public interface PatientLocal {
	
	String ConsommationDay();
	
	String ConsommationWeek();
	
	String ConsommationMonth();

	
	String Report_Numbers();
	
	String Report_Description();

}
