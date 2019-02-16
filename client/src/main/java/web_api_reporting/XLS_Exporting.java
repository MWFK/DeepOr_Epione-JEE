package web_api_reporting;

import java.io.File;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

import cancellation_rate.CancellationRemote;
import jxl.Workbook;
import jxl.write.Label;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;
import nbr_treated_patient.PatientRemote;
import used_timeslot_rate.Used_Timeslot_Rate_Remote;

public class XLS_Exporting {

	public static void main(String[] args) throws NamingException {
		// TODO Auto-generated method stub

		Context ctx1 = new InitialContext();
		Object obj1 = ctx1.lookup("/server-ear/server-ejb/Patient!nbr_treated_patient.PatientRemote");
		PatientRemote proxy1 = (PatientRemote) obj1;
		
		Context ctx2 = new InitialContext();
		Object obj2 = ctx2.lookup("/server-ear/server-ejb/Cancellation!cancellation_rate.CancellationRemote");
		CancellationRemote proxy2 = (CancellationRemote) obj2;
		
		Context ctx3 = new InitialContext();
		Object obj3 = ctx3.lookup("/server-ear/server-ejb/Used_Timeslot_Rate!used_timeslot_rate.Used_Timeslot_Rate_Remote");
		Used_Timeslot_Rate_Remote proxy3 = (Used_Timeslot_Rate_Remote) obj3;
		
		/**********************************************************************************************/
		/**********************************************************************************************/
		
		System.out.println("***   Reporting   ***\n");
		
		WritableWorkbook wworkbook;

		try {
			wworkbook = Workbook.createWorkbook(new File("G:/cours/PI/Jakarta/ide output files/Report.xls"));
			
			WritableSheet wsheet1 = wworkbook.createSheet("Number of Treated Patients", 0);
				Label label10 = new Label(0, 0, "Day");
					wsheet1.addCell(label10);
				Label label20 = new Label(1, 0, "Week");
					wsheet1.addCell(label20);
				Label label30 = new Label(2, 0, "Month");
					wsheet1.addCell(label30);
					
				Label label11 = new Label(0, 1, proxy1.ConsommationDay());
					wsheet1.addCell(label11);
				Label label12 = new Label(1, 1, proxy1.ConsommationWeek());
					wsheet1.addCell(label12);
				Label label13 = new Label(2, 1, proxy1.ConsommationMonth());
					wsheet1.addCell(label13);
					
					
			
			WritableSheet wsheet2 = wworkbook.createSheet("Cancellation Rate", 1);
				Label label100 = new Label(0, 0, "Day");
					wsheet2.addCell(label100);
				Label label200 = new Label(1, 0, "Week");
					wsheet2.addCell(label200);
				Label label300 = new Label(2, 0, "Month");
					wsheet2.addCell(label300);
					
				Label label21 = new Label(0, 1, proxy2.ConsommationDay());
					wsheet2.addCell(label21);
				Label label22 = new Label(1, 1, proxy2.ConsommationWeek());
					wsheet2.addCell(label22);
				Label label23 = new Label(2, 1, proxy2.ConsommationMonth());
				wsheet2.addCell(label23);
					
				
				
			WritableSheet wsheet3 = wworkbook.createSheet("TimeSlot Usage Rate", 2);
				Label label1000 = new Label(0, 0, "Day");
					wsheet3.addCell(label1000);
				Label label2000 = new Label(1, 0, "Week");
					wsheet3.addCell(label2000);
				Label label3000 = new Label(2, 0, "Month");
					wsheet3.addCell(label3000);
					
				Label label31 = new Label(0, 1, proxy3.ConsommationDay());
					wsheet3.addCell(label31);
				Label label32 = new Label(1, 1, proxy3.ConsommationWeek());
					wsheet3.addCell(label32);
				Label label33 = new Label(2, 1, proxy3.ConsommationMonth());
					wsheet3.addCell(label33);
					
			
					
			wworkbook.write();
			wworkbook.close();
			System.out.println("XLS file successfully created!");
		} 
		
		catch (Exception e) 
		{
			System.out.println(e);
		}
		
	}

}
