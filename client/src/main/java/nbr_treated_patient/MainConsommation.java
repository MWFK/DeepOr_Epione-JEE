//the WebAPi should be working in Visual Studio, in order for the Java client to consume the service
package nbr_treated_patient;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

import nbr_treated_patient.PatientRemote;

public class MainConsommation {

	public static void main(String[] args) throws NamingException {
		// TODO Auto-generated method stub
		
		Context ctx = new InitialContext();
		Object obj = ctx.lookup("/server-ear/server-ejb/Patient!nbr_treated_patient.PatientRemote");
		PatientRemote proxy = (PatientRemote) obj;
		
		System.out.print("Number of treated patients per day: "+proxy.ConsommationDay()+"\n");
		System.out.print("Number of treated patients per Week: "+proxy.ConsommationWeek()+"\n");
		System.out.print("Number of treated patients per Month: "+proxy.ConsommationMonth()+"\n");

	}

}
