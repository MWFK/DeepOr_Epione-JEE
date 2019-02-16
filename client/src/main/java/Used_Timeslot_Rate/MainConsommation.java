package Used_Timeslot_Rate;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

import nbr_treated_patient.PatientRemote;
import used_timeslot_rate.Used_Timeslot_Rate_Remote;

public class MainConsommation {

	public static void main(String[] args) throws NamingException {
		// TODO Auto-generated method stub

		Context ctx = new InitialContext();
		Object obj = ctx.lookup("/server-ear/server-ejb/Used_Timeslot_Rate!used_timeslot_rate.Used_Timeslot_Rate_Remote");
		Used_Timeslot_Rate_Remote proxy = (Used_Timeslot_Rate_Remote) obj;
		
		System.out.print("Used timeslot rate per Day: "+proxy.ConsommationDay()+"\n");
		System.out.print("Used timeslot rate per Week: "+proxy.ConsommationWeek()+"\n");
		System.out.print("Used timeslot rate per Month: "+proxy.ConsommationMonth()+"\n");
	}

}
