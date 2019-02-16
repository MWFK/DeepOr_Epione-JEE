package reporting;

import java.util.List;

import javax.ejb.EJB;
import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.persistence.TypedQuery;

import cancellation_rate.CancellationLocal;
import entities.Cursus;
import entities.Reporting;
import nbr_treated_patient.PatientLocal;
import used_timeslot_rate.Used_Timeslot_Rate_Local;

/**
 * Session Bean implementation class ReportingService
 */
@Stateless
@LocalBean
public class ReportingService implements ReportingServiceRemote, ReportingServiceLocal {

    /**
     * Default constructor. 
     */
    public ReportingService() {
        // TODO Auto-generated constructor stub
    }
    
    @EJB
	PatientLocal PL;
	
	@EJB
	CancellationLocal CL;
	
	@EJB
	Used_Timeslot_Rate_Local UL;
	
	@PersistenceContext
    EntityManager em;
	
	
	
	//service consommer
	public String Nbr_Treated_Patient_Month()
	{
		return PL.ConsommationMonth();
	}
	
	
	
	
	
	
	@Override
	public void AddReports()//JPA does not have INSERT statement
	{	
		//String value=PL.ConsommationDay();
		//String name="nbr_treated_patient_day";
		/*1er methode*/
		 TypedQuery<Reporting> query = em.createQuery("INSERT INTO Reporting (NAME, VALUE) VALUES (:name, :value)",Reporting.class);
    	
		query.setParameter("name", "nbr_treated_patient_day");
		query.setParameter("value", "MK");
		query.executeUpdate();
		
/*	2eme methodes	
 * String q = "INSERT INTO Reporting (nbr_treated_patient_day)"
                    			+ " VALUES (:a)";

		em.createNativeQuery(q)
		   .setParameter("a", value)
		   .executeUpdate();
    	
		System.out.println("MK");
		*/
    	
		/*Query query = em.createNativeQuery("INSERT INTO Reporting (nbr_treated_patient_day) " + " VALUES('MK')");
	          //query.setParameter(1, "MK");
	          query.executeUpdate();
	        */
		
/*	3eme methode	
 * em.getTransaction().begin();

		Reporting R = new Reporting();
		R.setNbr_treated_patient_day("MK");
		
		em.persist(R);		
		em.getTransaction().commit();*/
		
	        System.out.println("MK");
		
	}
    

}
