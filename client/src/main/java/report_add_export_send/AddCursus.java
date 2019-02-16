//test add cursus (it works on wamp)
//Caused by: java.lang.ClassNotFoundException: com.microsoft.sqlserver.jdbc.SQLServerException
package report_add_export_send;

import java.util.List;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

import entities.Cursus;
import export_send_reports.Export_ReportRemote;

public class AddCursus {

	public static void main(String[] args) throws NamingException {
		// TODO Auto-generated method stub

		String jndiName="server-ear/server-ejb/Export_Report!export_send_reports.Export_ReportRemote";
		Context context = new InitialContext();
		Export_ReportRemote proxy = (Export_ReportRemote) context.lookup(jndiName);
		
		Cursus  C = new Cursus();
		C.setCompte_rendu("MK");
		C.setReport("Hibernate");
		C.setTreatment("Spring");
		proxy.addCursus(C);
		
		//cours entity manager(P7)
		//probleme de detached entity: client envoie une requte vers le serveur, le serveur serialize les dns==>c'est ca qui ns donne detached entity
		//donc pour remedier a ca, on utilise le merge, puisque les dns sont deja en memoire (persist c'est pour un entite non detahce)
		//donc le prob sagit de transfert des dns de ejb vers client, il reste dans la memoire
		
		//Autre chose: dans le service avec statsfull on utilise persist et avec stateless on utilise merge
		
		for(Cursus cursus : proxy.affiche_Cursus_Patient(1))
			{
				System.out.println(cursus.getReport());
			}
	}

}
