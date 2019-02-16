package used_timeslot_rate;

import javax.ejb.Remote;

@Remote
public interface Used_Timeslot_Rate_Remote {
	
	String ConsommationDay();
	
	String ConsommationWeek();
	
	String ConsommationMonth();
	
	String Report_Numbers();
	
	String Report_Description();

}
