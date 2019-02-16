package report_export;

import java.io.FileOutputStream;
import java.io.Serializable;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;

import entities.Cursus;
import export_send_reports.Export_Report;
import export_send_reports.Export_ReportLocal;
import reporting.ReportingServiceLocal;

@ManagedBean  //import javax.faces.bean.ManagedBean;
@SessionScoped	//import javax.faces.bean.SessionScoped;
public class ReportExportBean implements Serializable{
	
	private int id;
	private String compte_rendu;
	private String report;
	private String treatment;
	private int idPatient;
	private String image;
	
	private Cursus curs;//pour ajouter un cursus
	private List<Cursus> cursus;//pour afficher tt les cursusu dans la table cursus
	private List<Cursus> cursus_patient;//pour afficher le cursus d'un patient specifique

	@EJB
	Export_ReportLocal export_report_locale;
	
	@EJB
    ReportingServiceLocal RSL;
	
	@PostConstruct
	public void init() 
	{
		cursus_patient=export_report_locale.affiche_Cursus_Patient(1);//this one dosen't
		cursus = export_report_locale.cursus_data();//this one works
	}
	
	public void Ajouter() {
		
		curs=new Cursus(id,idPatient,compte_rendu,report,treatment);//les champs de formulaire (et jai un ajouter un constructeur au niveau  de l'entite Cursus ejb)
		export_report_locale.addCursus(curs);
	}
	
	public String Redirection_Export()
	{
		return"/pages/epione/Export_Report";
	}
	
	public String Redirection_Send()
	{
		return"/pages/epione/Send_Reference_Doctor";
	}
	
	
	
	
	
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCompte_rendu() {
		return compte_rendu;
	}

	public void setCompte_rendu(String compte_rendu) {
		this.compte_rendu = compte_rendu;
	}

	public String getReport() {
		return report;
	}

	public void setReport(String report) {
		this.report = report;
	}

	public String getTreatment() {
		return treatment;
	}

	public void setTreatment(String treatment) {
		this.treatment = treatment;
	}

	public int getIdPatient() {
		return idPatient;
	}

	public void setIdPatient(int idPatient) {
		this.idPatient = idPatient;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	public List<Cursus> getCursus() {
		return cursus;
	}
	
	public void setCursus(List<Cursus> cursus) {
		this.cursus = cursus;
	}
	
	public Cursus getCurs() {
		return curs;
	}

	public void setCurs(Cursus curs) {
		this.curs = curs;
	}

	public List<Cursus> getCursus_patient() {
		return cursus_patient;
	}

	public void setCursus_patient(List<Cursus> cursus_patient) {
		this.cursus_patient = cursus_patient;
	}

	
}
