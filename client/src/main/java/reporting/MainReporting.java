//JPA has no INSERT statement
package reporting;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

import export_send_reports.Export_ReportRemote;

public class MainReporting {

	public static void main(String[] args) throws NamingException {
		// TODO Auto-generated method stub
	
		String jndiName="server-ear/server-ejb/ReportingService!reporting.ReportingServiceRemote";
		Context context = new InitialContext();
		ReportingServiceRemote proxy = (ReportingServiceRemote) context.lookup(jndiName);
		
		proxy.AddReports();
		
	}

}
