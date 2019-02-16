package web_api_reporting;

import java.io.FileOutputStream;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

import com.itextpdf.text.Document;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;

import cancellation_rate.CancellationRemote;
import nbr_treated_patient.PatientRemote;
import used_timeslot_rate.Used_Timeslot_Rate_Remote;

public class PDF_Exporting {

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
		
		System.out.println(proxy1.Report_Description());
		System.out.println(proxy2.Report_Description());
		System.out.println(proxy3.Report_Description());

		try
		{
			Document document = new Document();
			PdfWriter.getInstance(document, new FileOutputStream("G:/cours/PI/Jakarta/ide output files/Report.pdf"));
			document.open();
			document.add(new Paragraph(proxy1.Report_Description()+proxy2.Report_Description()+proxy3.Report_Description()));
			document.close();
		}
		
		catch(Exception e)
		{
			System.out.println(e);
		}
		
		System.out.println("PDF created successfully");
	}

}