package reporting;

import javax.ejb.Remote;

@Remote
public interface ReportingServiceRemote {
	
	void AddReports();
	
	String Nbr_Treated_Patient_Month();


}
