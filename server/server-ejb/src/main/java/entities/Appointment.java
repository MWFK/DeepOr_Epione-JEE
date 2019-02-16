//the tables are extracted from sqlserver(ssms), but the updates happens in phpmyadmin
package entities;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;


/**
 * The persistent class for the Appointments database table.
 * 
 */
@Entity
@Table(name="Appointments")
@NamedQuery(name="Appointment.findAll", query="SELECT a FROM Appointment a")
public class Appointment implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="ID")
	private int id;

	private Timestamp date;

	@Column(name="IdDoctor")
	private int idDoctor;

	private boolean status;

	public Appointment() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Timestamp getDate() {
		return this.date;
	}

	public void setDate(Timestamp date) {
		this.date = date;
	}

	public int getIdDoctor() {
		return this.idDoctor;
	}

	public void setIdDoctor(int idDoctor) {
		this.idDoctor = idDoctor;
	}

	public boolean getStatus() {
		return this.status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}

}