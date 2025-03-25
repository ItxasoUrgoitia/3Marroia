package businessLogic;

import java.util.Collection;

import java.util.Date;
import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebService;

import domain.ConcreteFlight;
import domain.Flight;
@WebService
public interface FlightManagerInterface {
	@WebMethod
	public List<String> getAllDepartingCities();
	
	@WebMethod
	public List<String> getArrivalCitiesFrom(String departingCity);
	
	@WebMethod
	public Collection<ConcreteFlight> getConcreteFlights2(String departingCity, String arrivingCity, Date date);
	
	@WebMethod
	public Flight getFlight(String flightCode);
	
	@WebMethod
	public List<Flight> getFlights();
	
	@WebMethod
	public ConcreteFlight getConcreteFlight(String concreFlightCode);
	
	@WebMethod
	public List<ConcreteFlight> getConcreteFlights();
	
	@WebMethod
	public List<ConcreteFlight> getDateConcreteFlights(Date d);
	
	@WebMethod
	public boolean bookSeat(ConcreteFlight cf1, String type);
	
}
