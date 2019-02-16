package export_send_reports;

import java.util.List;

import javax.ejb.LocalBean;
import javax.ejb.Stateful;
import javax.ejb.Stateless;
import javax.persistence.Column;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.xml.registry.SaveException;

import entities.Cursus;

/**
 * Session Bean implementation class Export_Report
 */
@Stateless
@LocalBean
public class Export_Report implements Export_ReportRemote, Export_ReportLocal {

    /**
     * Default constructor. 
     */
    public Export_Report() {
        // TODO Auto-generated constructor stub
    }
	
    @PersistenceContext
    EntityManager em;
    
    @Override
    public void addCursus(Cursus cursus)
    { 
    	em.merge(cursus);
    }
    
    @Override
    public List<Cursus> cursus_data()
    {
    	TypedQuery<Cursus> query = em.createQuery("SELECT c FROM Cursus c",Cursus.class);
    	
    	List<Cursus> data = query.getResultList();
    	
    	return data;
    }
    
    public List<Cursus> affiche_Cursus_Patient(int idPatient)
    {
    	TypedQuery<Cursus> query = em.createQuery("Select c from Cursus c where c.idPatient=:idPatient",Cursus.class);
    	
    	query.setParameter("idPatient",idPatient);
    	
    	List<Cursus> data = query.getResultList();
    	
    	return data;
    }

}
