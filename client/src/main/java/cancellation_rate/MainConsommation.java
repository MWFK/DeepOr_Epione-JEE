package cancellation_rate;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

import nbr_treated_patient.PatientRemote;

public class MainConsommation {

	public static void main(String[] args) throws NamingException {
		// TODO Auto-generated method stub

		Context ctx = new InitialContext();
		Object obj = ctx.lookup("/server-ear/server-ejb/Cancellation!cancellation_rate.CancellationRemote");
		CancellationRemote proxy = (CancellationRemote) obj;
		
		System.out.print("Cancellation rate per day: "+proxy.ConsommationDay()+"\n");
		System.out.print("Cancellation rate per Week: "+proxy.ConsommationWeek()+"\n");
		System.out.print("Cancellation rate per Month: "+proxy.ConsommationMonth()+"\n");
	}

}
