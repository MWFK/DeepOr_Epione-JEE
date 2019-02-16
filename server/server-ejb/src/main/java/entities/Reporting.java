package entities;

import java.io.Serializable;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: Reporting
 *
 */
@Entity
@Table(name="Reporting")
@NamedQuery(name="Reporting.findAll", query="SELECT r FROM Reporting r")
public class Reporting implements Serializable {

	   
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(unique=true, nullable=false)
	private int id;
	private String nbr_treated_patient_day;
	private String nbr_treated_patient_week;
	private String nbr_treated_patient_month;
	private String cancellation_rate_day;
	private String cancellation_rate_week;
	private String cancellation_rate_month;
	private String timeslot_usage_rate_day;
	private String timeslot_usage_rate_week;
	private String timeslot_usage_rate_month;
	private static final long serialVersionUID = 1L;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNbr_treated_patient_day() {
		return nbr_treated_patient_day;
	}
	public void setNbr_treated_patient_day(String nbr_treated_patient_day) {
		this.nbr_treated_patient_day = nbr_treated_patient_day;
	}
	public String getNbr_treated_patient_week() {
		return nbr_treated_patient_week;
	}
	public void setNbr_treated_patient_week(String nbr_treated_patient_week) {
		this.nbr_treated_patient_week = nbr_treated_patient_week;
	}
	public String getNbr_treated_patient_month() {
		return nbr_treated_patient_month;
	}
	public void setNbr_treated_patient_month(String nbr_treated_patient_month) {
		this.nbr_treated_patient_month = nbr_treated_patient_month;
	}
	public String getCancellation_rate_day() {
		return cancellation_rate_day;
	}
	public void setCancellation_rate_day(String cancellation_rate_day) {
		this.cancellation_rate_day = cancellation_rate_day;
	}
	public String getCancellation_rate_week() {
		return cancellation_rate_week;
	}
	public void setCancellation_rate_week(String cancellation_rate_week) {
		this.cancellation_rate_week = cancellation_rate_week;
	}
	public String getCancellation_rate_month() {
		return cancellation_rate_month;
	}
	public void setCancellation_rate_month(String cancellation_rate_month) {
		this.cancellation_rate_month = cancellation_rate_month;
	}
	public String getTimeslot_usage_rate_day() {
		return timeslot_usage_rate_day;
	}
	public void setTimeslot_usage_rate_day(String timeslot_usage_rate_day) {
		this.timeslot_usage_rate_day = timeslot_usage_rate_day;
	}
	public String getTimeslot_usage_rate_week() {
		return timeslot_usage_rate_week;
	}
	public void setTimeslot_usage_rate_week(String timeslot_usage_rate_week) {
		this.timeslot_usage_rate_week = timeslot_usage_rate_week;
	}
	public String getTimeslot_usage_rate_month() {
		return timeslot_usage_rate_month;
	}
	public void setTimeslot_usage_rate_month(String timeslot_usage_rate_month) {
		this.timeslot_usage_rate_month = timeslot_usage_rate_month;
	}

	
   
}
