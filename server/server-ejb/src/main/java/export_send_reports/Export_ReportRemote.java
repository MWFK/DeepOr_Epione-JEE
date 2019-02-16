package export_send_reports;

import java.util.List;

import javax.ejb.Remote;

import entities.Cursus;

@Remote
public interface Export_ReportRemote {

	List<Cursus> cursus_data();
	
	void addCursus(Cursus cursus);
	
	List<Cursus> affiche_Cursus_Patient(int idPatient);

}
