package reporting;

import javax.ejb.Local;

@Local
public interface ReportingServiceLocal {

	void AddReports();
	
	String Nbr_Treated_Patient_Month();

}
