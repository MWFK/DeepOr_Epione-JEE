package entities;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;


/**
 * The persistent class for the Calendars database table.
 * 
 */
@Entity
@Table(name="Calendars")
@NamedQuery(name="Calendar.findAll", query="SELECT c FROM Calendar c")
public class Calendar implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="ID")
	private int id;

	private Timestamp dateCal;

	private boolean dispo;

	@Column(name="IdDoctor")
	private int idDoctor;

	public Calendar() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Timestamp getDateCal() {
		return this.dateCal;
	}

	public void setDateCal(Timestamp dateCal) {
		this.dateCal = dateCal;
	}

	public boolean getDispo() {
		return this.dispo;
	}

	public void setDispo(boolean dispo) {
		this.dispo = dispo;
	}

	public int getIdDoctor() {
		return this.idDoctor;
	}

	public void setIdDoctor(int idDoctor) {
		this.idDoctor = idDoctor;
	}

}