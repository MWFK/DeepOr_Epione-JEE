package entities;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the Cursus database table.
 * 
 */
//the was a prob with entity (error: Table Cursus cannot be resolved)
//sol:http://adterrasperaspera.com/blog/2009/08/11/eclipselink-jpa-in-eclipse-dumb-error-message/
//but instead of the previous solution, i just created another table i the ssms, and i used JPA entities from table
@Entity
@Table(name="Cursus")
@NamedQuery(name="Cursus.findAll", query="SELECT c FROM Cursus c")
public class Cursus implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(unique=true, nullable=false)
	private int id;

	@Column(length=255)
	private String compte_rendu;

	@Column(length=255)
	private String report;

	@Column(length=255)
	private String treatment;
	

	private int idPatient;

	public Cursus() {
	}
	
	public Cursus(int Id,String Description, String Report,String Treatement) {
		this.id=Id;
		this.compte_rendu=Description;
		this.report=Report;
		this.treatment=Treatement;
	}

	public Cursus(int id2, int idPatient2, String description2, String report2, String treatment2) {
		// TODO Auto-generated constructor stub
		this.id=id2;
		this.idPatient=idPatient2;
		this.compte_rendu=description2;
		this.report=report2;
		this.treatment=treatment2;
	}
	
	public int getIdPatient() {
		return idPatient;
	}

	public void setIdPatient(int idPatient) {
		this.idPatient = idPatient;
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getReport() {
		return this.report;
	}

	public void setReport(String report) {
		this.report = report;
	}

	public String getTreatment() {
		return this.treatment;
	}

	public void setTreatment(String treatment) {
		this.treatment = treatment;
	}

	public String getCompte_rendu() {
		return compte_rendu;
	}

	public void setCompte_rendu(String compte_rendu) {
		this.compte_rendu = compte_rendu;
	}

}