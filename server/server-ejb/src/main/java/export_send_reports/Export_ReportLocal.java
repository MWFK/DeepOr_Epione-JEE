package export_send_reports;

import java.util.List;

import javax.ejb.Local;

import entities.Cursus;

@Local
public interface Export_ReportLocal {

	List<Cursus> cursus_data();

	void addCursus(Cursus cursus);
	
	List<Cursus> affiche_Cursus_Patient(int idPatient);

}
