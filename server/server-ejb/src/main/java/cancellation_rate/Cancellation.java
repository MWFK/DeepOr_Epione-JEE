package cancellation_rate;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
//package services;
import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.ResponseProcessingException;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.Response;

/**
 * Session Bean implementation class Patient
 */
@Stateless
@LocalBean
public class Cancellation implements CancellationRemote, CancellationLocal {

    /**
     * Default constructor. 
     */
    public Cancellation() {
        // TODO Auto-generated constructor stub
    }
    
    public String ConsommationDay()
    {
    	//create new Jax-RS client
    	Client client=ClientBuilder.newClient();
    	
    	//the base url of the service //consuming Treated_Patients_Day method
    	WebTarget targetDay=client.target("http://localhost:54656/api/Cancellation_Rate_Day");
    	
    	//get the response from the target url
    	Response responseDay=targetDay.request().get();
    	
    	//read the result as string 
    	String resultDay=responseDay.readEntity(String.class);
    	
    	//print the result to the standard output
    	System.out.println(resultDay);
    	responseDay.close();
    	return resultDay;
    }
    
    public String ConsommationWeek()
    {
    	//create new Jax-RS client
    	Client client=ClientBuilder.newClient();
    	
    	//the base url of the service //consuming Treated_Patients_Day method
    	WebTarget targetWeek=client.target("http://localhost:54656/api/Cancellation_Rate_Week");
    	
    	//get the response from the target url
    	Response responseWeek=targetWeek.request().get();
    	
    	//read the result as string 
    	String resultWeek=responseWeek.readEntity(String.class);
    	
    	//print the result to the standard output
    	System.out.println(resultWeek);
    	responseWeek.close();
    	return resultWeek;
    }
    
    public String ConsommationMonth()
    {
    	//create new Jax-RS client
    	Client client=ClientBuilder.newClient();
    	
    	//the base url of the service //consuming Treated_Patients_Day method
    	WebTarget targetMonth=client.target("http://localhost:54656/api/Cancellation_Rate_Month");
    	
    	//get the response from the target url
    	Response responseMonth=targetMonth.request().get();
    	
    	//read the result as string 
    	String resultMonth=responseMonth.readEntity(String.class);
    	
    	//print the result to the standard output
    	System.out.println(resultMonth);
    	responseMonth.close();
    	return resultMonth;
    }

	@Override
	public String Report_Numbers() {
		// TODO Auto-generated method stub
		return ConsommationDay()+"\n"+ConsommationWeek()+"\n"+ConsommationMonth()+"\n";
	}

	@Override
	public String Report_Description() {
		// TODO Auto-generated method stub
		String msg="Cancellation Rate per day: "+ConsommationDay()+"\n"+
				  "Cancellation Rate per day: "+ConsommationWeek()+"\n"+
				  "Cancellation Rate per day: "+ConsommationMonth()+"\n"+"\n";
		return  msg;
	}


}
