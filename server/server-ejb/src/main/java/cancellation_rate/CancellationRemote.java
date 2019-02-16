package cancellation_rate;

import javax.ejb.Remote;

@Remote
public interface CancellationRemote {
	
	String ConsommationDay();
	
	String ConsommationWeek();
	
	String ConsommationMonth();
	
	String Report_Numbers();
	
	String Report_Description();

}
