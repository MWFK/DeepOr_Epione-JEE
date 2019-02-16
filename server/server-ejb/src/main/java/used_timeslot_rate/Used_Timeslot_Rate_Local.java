package used_timeslot_rate;

import javax.ejb.Local;

@Local
public interface Used_Timeslot_Rate_Local {
	
	String ConsommationDay();
	
	String ConsommationWeek();
	
	String ConsommationMonth();
	
	String Report_Numbers();
	
	String Report_Description();

}
