package cancellation_rate;

import javax.ejb.Local;

@Local
public interface CancellationLocal {
	
	String ConsommationDay();
	
	String ConsommationWeek();
	
	String ConsommationMonth();
	
	String Report_Numbers();
	
	String Report_Description();

}
