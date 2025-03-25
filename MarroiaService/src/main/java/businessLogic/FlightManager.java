package businessLogic;

import java.util.ArrayList;



import java.util.Calendar;
import java.util.Collection;
import java.util.Date;
import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.persistence.*;

import domain.ConcreteFlight;
import domain.Flight;



@WebService(endpointInterface = "businessLogic.FlightManagerInterface")
public class FlightManager implements FlightManagerInterface {
	private EntityManager db;
	private EntityManagerFactory emf;
	String fileName = "flights.odb";
	
		public FlightManager () {
			emf = Persistence.createEntityManagerFactory("objectdb:"+fileName);
			db = emf.createEntityManager();
			System.out.println("DataBase opened");
			TypedQuery<Flight> query = db.createQuery("SELECT f FROM Flight f", Flight.class);
		    List<Flight> existingFlights = query.getResultList();
		    
		    if (existingFlights.isEmpty()) {
		        System.out.println("Creating new flights in the database...");
		        
		        Flight f1 = new Flight("F1","Donostia","Bilbo");
		        f1.addConcreteFlight("CF1-1",newDate(2025,1,23),0,2,3,"12:00");
		        f1.addConcreteFlight("CF1-2",newDate(2025,1,23),3,0,3,"12:30");
		        f1.addConcreteFlight("CF1-3",newDate(2025,1,23),1,2,2,"13:00");
		        f1.addConcreteFlight("CF1-4",newDate(2025,1,23),3,3,0,"14:00");
		        f1.addConcreteFlight("CF1-5",newDate(2025,1,23),3,3,0,"15:00");
		        f1.addConcreteFlight("CF1-6",newDate(2025,1,23),3,3,0,"16:00");
		        f1.addConcreteFlight("CF1-7",newDate(2025,1,23),3,3,0,"17:00");
			
		        Flight f2 = new Flight("F2","Donostia","Madrid");
		        f2.addConcreteFlight("CF2-1",newDate(2025,1,23),1,2,3,"12:00");
		        f2.addConcreteFlight("CF2-2",newDate(2025,1,23),3,0,3,"12:30");
		        f2.addConcreteFlight("CF2-3",newDate(2025,1,23),1,2,2,"13:00");
		        f2.addConcreteFlight("CF2-4",newDate(2025,1,23),3,3,0,"14:00");
		        f2.addConcreteFlight("CF2-5",newDate(2025,1,23),3,3,0,"15:00");
		        f2.addConcreteFlight("CF2-6",newDate(2025,1,23),3,3,0,"16:00");
		        f2.addConcreteFlight("CF2-7",newDate(2025,1,23),3,3,0,"17:00");
					
		        Flight f3 = new Flight("F3","Barcelona","Donostia");
		        f3.addConcreteFlight("CF3-1",newDate(2025,1,23),1,2,3,"10:00");
		        f3.addConcreteFlight("CF3-2",newDate(2025,1,23),3,0,3,"11:00");
		        f3.addConcreteFlight("CF3-3",newDate(2025,1,23),1,2,2,"12:00");
		        f3.addConcreteFlight("CF3-4",newDate(2025,1,23),3,3,0,"13:00");
		        f3.addConcreteFlight("CF3-5",newDate(2025,1,23),3,3,0,"15:00");
		        f3.addConcreteFlight("CF3-6",newDate(2025,1,23),3,3,0,"19:00");
		        f3.addConcreteFlight("CF3-7",newDate(2025,1,23),3,3,0,"21:00");
			
		        Flight f4 = new Flight("F4","Barcelona","Malaga");
		        f4.addConcreteFlight("CF4-1",newDate(2025,1,22),1,2,3,"9:00");
		        f4.addConcreteFlight("CF4-2",newDate(2025,1,23),3,0,3,"11:00");
		        f4.addConcreteFlight("CF4-3",newDate(2025,1,23),1,2,2,"13:00");
		        f4.addConcreteFlight("CF4-4",newDate(2025,1,23),3,3,0,"15:00");
		        f4.addConcreteFlight("CF4-5",newDate(2025,1,23),3,3,0,"17:00");
		        f4.addConcreteFlight("CF4-6",newDate(2025,1,23),3,3,0,"19:00");
		        f4.addConcreteFlight("CF4-7",newDate(2025,1,23),3,3,0,"21:00");
			
		        Flight f5 = new Flight("F5","Malaga","Madrid");
		        f5.addConcreteFlight("CF5-1",newDate(2025,1,22),1,2,3,"8:00");
		        f5.addConcreteFlight("CF5-2",newDate(2025,1,23),3,0,3,"10:00");
		        f5.addConcreteFlight("CF5-3",newDate(2025,1,23),1,2,2,"12:00");
		        f5.addConcreteFlight("CF5-4",newDate(2025,1,23),3,3,0,"14:00");
		        f5.addConcreteFlight("CF5-5",newDate(2025,1,23),3,3,0,"16:00");
		        f5.addConcreteFlight("CF5-6",newDate(2025,1,23),3,3,0,"18:00");
		        f5.addConcreteFlight("CF5-7",newDate(2025,1,23),3,3,0,"20:00");
			
			
		        Flight f6 = new Flight("F6","Malaga","Santander");
		        f6.addConcreteFlight("CF6-1",newDate(2024,1,22),1,2,3,"8:30");
		        f6.addConcreteFlight("CF6-2",newDate(2024,1,23),3,0,3,"10:30");
		        f6.addConcreteFlight("CF6-3",newDate(2024,1,23),1,2,2,"12:30");
		        f6.addConcreteFlight("CF6-4",newDate(2024,1,23),3,3,0,"14:30");
		        f6.addConcreteFlight("CF6-5",newDate(2024,1,23),3,3,0,"16:30");
		        f6.addConcreteFlight("CF6-6",newDate(2024,1,23),3,3,0,"18:30");
		        f6.addConcreteFlight("CF6-7",newDate(2024,1,23),3,3,0,"20:30");
			
		        Flight f7 = new Flight("F7","Malaga","Granada");
		        
		        storeFlight(f1);
				storeFlight(f2);
				storeFlight(f3);
				storeFlight(f4);
				storeFlight(f5);
				storeFlight(f6);
				storeFlight(f7);
		    }else {
		        System.out.println("Using existing flights from database");
		    }
		
		        /*flightsDB.add(f1);
		        flightsDB.add(f2);
		        flightsDB.add(f3);
		        flightsDB.add(f4);
		        flightsDB.add(f5);
		        flightsDB.add(f6);
		        flightsDB.add(f7);*/

			
		}
		public void close(){
			 if (db != null) db.close();
		     if (emf != null) emf.close();
		}
		@WebMethod	
		public boolean storeFlight(Flight flight) {
			try {
		        db.getTransaction().begin();
		        Flight existingFlight = db.find(Flight.class, flight.getFlightCode());
		        if (existingFlight == null) {
		            db.persist(flight);
		            db.getTransaction().commit();
		            System.out.println("Flight stored successfully: " + flight);
		            return true;
		        } else {
		            db.getTransaction().rollback();
		            System.out.println("Flight already exists with the code: " + flight.getFlightCode());
		            return false;
		        }
		    } catch (Exception e) {
		        db.getTransaction().rollback();
		        System.err.println("Error storing flight: " + e.getMessage());
		        return false;
		    }
		}
		@WebMethod
		public List<String> getAllDepartingCities(){
			 TypedQuery<String> query = db.createQuery("SELECT DISTINCT f.departingCity FROM Flight f", String.class);
			 return query.getResultList(); 
			/*if (flightsDB.isEmpty()) return new ArrayList<String>();
			//A set is used to avoid duplicates
			SortedSet<String> setDepartingCities = new TreeSet<String>();
			Iterator<Flight> i=flightsDB.iterator();
			while (i.hasNext())
				setDepartingCities.add(i.next().getDepartingCity());
			return new ArrayList<String>(setDepartingCities);*/		
		}
		@WebMethod
		public List<String> getArrivalCitiesFrom(String departingCity){
			 TypedQuery<String> query = db.createQuery(
				        "SELECT DISTINCT f.arrivingCity FROM Flight f WHERE f.departingCity = :departingCity", 
				        String.class
				    );
				    query.setParameter("departingCity", departingCity);
				    
				    return query.getResultList();
		}

			/*List<String> arrivalCities = new ArrayList<String>();
			Iterator<Flight> i=flightsDB.iterator();
			Flight f;
			while (i.hasNext()) {
				f=i.next();
				if (f.getDepartingCity().compareTo(departingCity)==0)
					arrivalCities.add(f.getArrivingCity());
			}
			Collections.sort(arrivalCities);
			return arrivalCities;*/		
		
		@WebMethod
		public Collection<ConcreteFlight> getConcreteFlights2(String departingCity, String arrivingCity, Date date) {
			TypedQuery<Flight> query = db.createQuery("SELECT f FROM Flight f",Flight.class);
			List<Flight> flights = query.getResultList();
			ArrayList<ConcreteFlight> res = new ArrayList<ConcreteFlight>();
			for (Flight a : flights) {
				if ((a.getArrivingCity().equals(arrivingCity))&&(a.getDepartingCity().equals(departingCity)))
					for (ConcreteFlight c : a.getConcreteFlights())
						if (c.getDate().equals(date)) res.add(c);
						
			}
			return res;	
			/*ArrayList<ConcreteFlight> res = new ArrayList<ConcreteFlight>();
			for (Flight a : flightsDB) {
				if ((a.getArrivingCity().equals(arrivingCity))&&(a.getDepartingCity().equals(departingCity)))
					for (ConcreteFlight c : a.getConcreteFlights())
						if (c.getDate().equals(date)) res.add(c);
						
			}
			return res;	*/			
		}
		
		private Date newDate(int year,int month,int day) {

		     Calendar calendar = Calendar.getInstance();
		     calendar.set(year, month, day,0,0,0);
		     calendar.set(Calendar.MILLISECOND, 0);

		     return calendar.getTime();
		}
		@WebMethod
		public boolean bookSeat(ConcreteFlight cf1, String type) {
			boolean ok = true;
			db.getTransaction().begin();
			ConcreteFlight cf=db.find(ConcreteFlight.class,cf1.getConcreteFlightCode());
			 
			 switch(type) {
			 	case "business":
			 		if (cf.getBusinessNumber() >= 1 ) { 
			 			cf.setBusinessNumber(cf.getBusinessNumber()-1);
			 		} else { 
			 			return false;
			 		}
					break;
			 	case "first":
			 		if  (cf.getFirstNumber() >= 1 ) {
			 			cf.setFirstNumber(cf.getFirstNumber()-1);
			 		} else { 
			 			return false;
			 		}
			 		break;
			 	case "tourist":
			 		if  (cf.getTouristNumber() >= 1 ) {
			 			cf.setTouristNumber(cf.getTouristNumber()-1);
			 		} else { 
			 			return false;
			 		}
			 		break;
			 }	 
		 db.getTransaction().commit();
		 return ok;	 	
	}
		@WebMethod
		public Flight getFlight(String flightCode) {
			return db.find(Flight.class, flightCode);
		}
		@WebMethod
		public List<Flight> getFlights(){
			 TypedQuery<Flight> query = db.createQuery("SELECT f FROM Flight f", Flight.class);
		     return query.getResultList();
		}
		@WebMethod
		public ConcreteFlight getConcreteFlight(String concreteFlightCode) {
	        return db.find(ConcreteFlight.class, concreteFlightCode);
	    }
		@WebMethod
		public List<ConcreteFlight> getConcreteFlights() {
		       TypedQuery<ConcreteFlight> query = db.createQuery("SELECT cf FROM ConcreteFlight cf", ConcreteFlight.class);
		       return query.getResultList();
		}
		@WebMethod
		public List<ConcreteFlight> getDateConcreteFlights(Date date) {
	        TypedQuery<ConcreteFlight> query = db.createQuery("SELECT cf FROM ConcreteFlight cf WHERE cf.date = :date", ConcreteFlight.class);
	        query.setParameter("date", date);
	        return query.getResultList();
	    }
}
