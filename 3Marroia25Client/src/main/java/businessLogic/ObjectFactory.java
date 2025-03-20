
package businessLogic;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the businessLogic package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _BookSeat_QNAME = new QName("http://businessLogic/", "bookSeat");
    private final static QName _BookSeatResponse_QNAME = new QName("http://businessLogic/", "bookSeatResponse");
    private final static QName _Close_QNAME = new QName("http://businessLogic/", "close");
    private final static QName _CloseResponse_QNAME = new QName("http://businessLogic/", "closeResponse");
    private final static QName _GetAllDepartingCities_QNAME = new QName("http://businessLogic/", "getAllDepartingCities");
    private final static QName _GetAllDepartingCitiesResponse_QNAME = new QName("http://businessLogic/", "getAllDepartingCitiesResponse");
    private final static QName _GetArrivalCitiesFrom_QNAME = new QName("http://businessLogic/", "getArrivalCitiesFrom");
    private final static QName _GetArrivalCitiesFromResponse_QNAME = new QName("http://businessLogic/", "getArrivalCitiesFromResponse");
    private final static QName _GetConcreteFlight_QNAME = new QName("http://businessLogic/", "getConcreteFlight");
    private final static QName _GetConcreteFlightResponse_QNAME = new QName("http://businessLogic/", "getConcreteFlightResponse");
    private final static QName _GetConcreteFlights_QNAME = new QName("http://businessLogic/", "getConcreteFlights");
    private final static QName _GetConcreteFlightsResponse_QNAME = new QName("http://businessLogic/", "getConcreteFlightsResponse");
    private final static QName _GetDateConcreteFlights_QNAME = new QName("http://businessLogic/", "getDateConcreteFlights");
    private final static QName _GetDateConcreteFlightsResponse_QNAME = new QName("http://businessLogic/", "getDateConcreteFlightsResponse");
    private final static QName _GetFlight_QNAME = new QName("http://businessLogic/", "getFlight");
    private final static QName _GetFlightResponse_QNAME = new QName("http://businessLogic/", "getFlightResponse");
    private final static QName _GetFlights_QNAME = new QName("http://businessLogic/", "getFlights");
    private final static QName _GetFlightsResponse_QNAME = new QName("http://businessLogic/", "getFlightsResponse");
    private final static QName _StoreFlight_QNAME = new QName("http://businessLogic/", "storeFlight");
    private final static QName _StoreFlightResponse_QNAME = new QName("http://businessLogic/", "storeFlightResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: businessLogic
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link BookSeat }
     * 
     */
    public BookSeat createBookSeat() {
        return new BookSeat();
    }

    /**
     * Create an instance of {@link BookSeatResponse }
     * 
     */
    public BookSeatResponse createBookSeatResponse() {
        return new BookSeatResponse();
    }

    /**
     * Create an instance of {@link Close }
     * 
     */
    public Close createClose() {
        return new Close();
    }

    /**
     * Create an instance of {@link CloseResponse }
     * 
     */
    public CloseResponse createCloseResponse() {
        return new CloseResponse();
    }

    /**
     * Create an instance of {@link GetAllDepartingCities }
     * 
     */
    public GetAllDepartingCities createGetAllDepartingCities() {
        return new GetAllDepartingCities();
    }

    /**
     * Create an instance of {@link GetAllDepartingCitiesResponse }
     * 
     */
    public GetAllDepartingCitiesResponse createGetAllDepartingCitiesResponse() {
        return new GetAllDepartingCitiesResponse();
    }

    /**
     * Create an instance of {@link GetArrivalCitiesFrom }
     * 
     */
    public GetArrivalCitiesFrom createGetArrivalCitiesFrom() {
        return new GetArrivalCitiesFrom();
    }

    /**
     * Create an instance of {@link GetArrivalCitiesFromResponse }
     * 
     */
    public GetArrivalCitiesFromResponse createGetArrivalCitiesFromResponse() {
        return new GetArrivalCitiesFromResponse();
    }

    /**
     * Create an instance of {@link GetConcreteFlight }
     * 
     */
    public GetConcreteFlight createGetConcreteFlight() {
        return new GetConcreteFlight();
    }

    /**
     * Create an instance of {@link GetConcreteFlightResponse }
     * 
     */
    public GetConcreteFlightResponse createGetConcreteFlightResponse() {
        return new GetConcreteFlightResponse();
    }

    /**
     * Create an instance of {@link GetConcreteFlights }
     * 
     */
    public GetConcreteFlights createGetConcreteFlights() {
        return new GetConcreteFlights();
    }

    /**
     * Create an instance of {@link GetConcreteFlightsResponse }
     * 
     */
    public GetConcreteFlightsResponse createGetConcreteFlightsResponse() {
        return new GetConcreteFlightsResponse();
    }

    /**
     * Create an instance of {@link GetDateConcreteFlights }
     * 
     */
    public GetDateConcreteFlights createGetDateConcreteFlights() {
        return new GetDateConcreteFlights();
    }

    /**
     * Create an instance of {@link GetDateConcreteFlightsResponse }
     * 
     */
    public GetDateConcreteFlightsResponse createGetDateConcreteFlightsResponse() {
        return new GetDateConcreteFlightsResponse();
    }

    /**
     * Create an instance of {@link GetFlight }
     * 
     */
    public GetFlight createGetFlight() {
        return new GetFlight();
    }

    /**
     * Create an instance of {@link GetFlightResponse }
     * 
     */
    public GetFlightResponse createGetFlightResponse() {
        return new GetFlightResponse();
    }

    /**
     * Create an instance of {@link GetFlights }
     * 
     */
    public GetFlights createGetFlights() {
        return new GetFlights();
    }

    /**
     * Create an instance of {@link GetFlightsResponse }
     * 
     */
    public GetFlightsResponse createGetFlightsResponse() {
        return new GetFlightsResponse();
    }

    /**
     * Create an instance of {@link StoreFlight }
     * 
     */
    public StoreFlight createStoreFlight() {
        return new StoreFlight();
    }

    /**
     * Create an instance of {@link StoreFlightResponse }
     * 
     */
    public StoreFlightResponse createStoreFlightResponse() {
        return new StoreFlightResponse();
    }

    /**
     * Create an instance of {@link ConcreteFlight }
     * 
     */
    public ConcreteFlight createConcreteFlight() {
        return new ConcreteFlight();
    }

    /**
     * Create an instance of {@link Flight }
     * 
     */
    public Flight createFlight() {
        return new Flight();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BookSeat }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link BookSeat }{@code >}
     */
    @XmlElementDecl(namespace = "http://businessLogic/", name = "bookSeat")
    public JAXBElement<BookSeat> createBookSeat(BookSeat value) {
        return new JAXBElement<BookSeat>(_BookSeat_QNAME, BookSeat.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BookSeatResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link BookSeatResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://businessLogic/", name = "bookSeatResponse")
    public JAXBElement<BookSeatResponse> createBookSeatResponse(BookSeatResponse value) {
        return new JAXBElement<BookSeatResponse>(_BookSeatResponse_QNAME, BookSeatResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Close }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Close }{@code >}
     */
    @XmlElementDecl(namespace = "http://businessLogic/", name = "close")
    public JAXBElement<Close> createClose(Close value) {
        return new JAXBElement<Close>(_Close_QNAME, Close.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CloseResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CloseResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://businessLogic/", name = "closeResponse")
    public JAXBElement<CloseResponse> createCloseResponse(CloseResponse value) {
        return new JAXBElement<CloseResponse>(_CloseResponse_QNAME, CloseResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAllDepartingCities }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetAllDepartingCities }{@code >}
     */
    @XmlElementDecl(namespace = "http://businessLogic/", name = "getAllDepartingCities")
    public JAXBElement<GetAllDepartingCities> createGetAllDepartingCities(GetAllDepartingCities value) {
        return new JAXBElement<GetAllDepartingCities>(_GetAllDepartingCities_QNAME, GetAllDepartingCities.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAllDepartingCitiesResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetAllDepartingCitiesResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://businessLogic/", name = "getAllDepartingCitiesResponse")
    public JAXBElement<GetAllDepartingCitiesResponse> createGetAllDepartingCitiesResponse(GetAllDepartingCitiesResponse value) {
        return new JAXBElement<GetAllDepartingCitiesResponse>(_GetAllDepartingCitiesResponse_QNAME, GetAllDepartingCitiesResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetArrivalCitiesFrom }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetArrivalCitiesFrom }{@code >}
     */
    @XmlElementDecl(namespace = "http://businessLogic/", name = "getArrivalCitiesFrom")
    public JAXBElement<GetArrivalCitiesFrom> createGetArrivalCitiesFrom(GetArrivalCitiesFrom value) {
        return new JAXBElement<GetArrivalCitiesFrom>(_GetArrivalCitiesFrom_QNAME, GetArrivalCitiesFrom.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetArrivalCitiesFromResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetArrivalCitiesFromResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://businessLogic/", name = "getArrivalCitiesFromResponse")
    public JAXBElement<GetArrivalCitiesFromResponse> createGetArrivalCitiesFromResponse(GetArrivalCitiesFromResponse value) {
        return new JAXBElement<GetArrivalCitiesFromResponse>(_GetArrivalCitiesFromResponse_QNAME, GetArrivalCitiesFromResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetConcreteFlight }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetConcreteFlight }{@code >}
     */
    @XmlElementDecl(namespace = "http://businessLogic/", name = "getConcreteFlight")
    public JAXBElement<GetConcreteFlight> createGetConcreteFlight(GetConcreteFlight value) {
        return new JAXBElement<GetConcreteFlight>(_GetConcreteFlight_QNAME, GetConcreteFlight.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetConcreteFlightResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetConcreteFlightResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://businessLogic/", name = "getConcreteFlightResponse")
    public JAXBElement<GetConcreteFlightResponse> createGetConcreteFlightResponse(GetConcreteFlightResponse value) {
        return new JAXBElement<GetConcreteFlightResponse>(_GetConcreteFlightResponse_QNAME, GetConcreteFlightResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetConcreteFlights }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetConcreteFlights }{@code >}
     */
    @XmlElementDecl(namespace = "http://businessLogic/", name = "getConcreteFlights")
    public JAXBElement<GetConcreteFlights> createGetConcreteFlights(GetConcreteFlights value) {
        return new JAXBElement<GetConcreteFlights>(_GetConcreteFlights_QNAME, GetConcreteFlights.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetConcreteFlightsResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetConcreteFlightsResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://businessLogic/", name = "getConcreteFlightsResponse")
    public JAXBElement<GetConcreteFlightsResponse> createGetConcreteFlightsResponse(GetConcreteFlightsResponse value) {
        return new JAXBElement<GetConcreteFlightsResponse>(_GetConcreteFlightsResponse_QNAME, GetConcreteFlightsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetDateConcreteFlights }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetDateConcreteFlights }{@code >}
     */
    @XmlElementDecl(namespace = "http://businessLogic/", name = "getDateConcreteFlights")
    public JAXBElement<GetDateConcreteFlights> createGetDateConcreteFlights(GetDateConcreteFlights value) {
        return new JAXBElement<GetDateConcreteFlights>(_GetDateConcreteFlights_QNAME, GetDateConcreteFlights.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetDateConcreteFlightsResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetDateConcreteFlightsResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://businessLogic/", name = "getDateConcreteFlightsResponse")
    public JAXBElement<GetDateConcreteFlightsResponse> createGetDateConcreteFlightsResponse(GetDateConcreteFlightsResponse value) {
        return new JAXBElement<GetDateConcreteFlightsResponse>(_GetDateConcreteFlightsResponse_QNAME, GetDateConcreteFlightsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetFlight }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetFlight }{@code >}
     */
    @XmlElementDecl(namespace = "http://businessLogic/", name = "getFlight")
    public JAXBElement<GetFlight> createGetFlight(GetFlight value) {
        return new JAXBElement<GetFlight>(_GetFlight_QNAME, GetFlight.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetFlightResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetFlightResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://businessLogic/", name = "getFlightResponse")
    public JAXBElement<GetFlightResponse> createGetFlightResponse(GetFlightResponse value) {
        return new JAXBElement<GetFlightResponse>(_GetFlightResponse_QNAME, GetFlightResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetFlights }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetFlights }{@code >}
     */
    @XmlElementDecl(namespace = "http://businessLogic/", name = "getFlights")
    public JAXBElement<GetFlights> createGetFlights(GetFlights value) {
        return new JAXBElement<GetFlights>(_GetFlights_QNAME, GetFlights.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetFlightsResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetFlightsResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://businessLogic/", name = "getFlightsResponse")
    public JAXBElement<GetFlightsResponse> createGetFlightsResponse(GetFlightsResponse value) {
        return new JAXBElement<GetFlightsResponse>(_GetFlightsResponse_QNAME, GetFlightsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StoreFlight }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link StoreFlight }{@code >}
     */
    @XmlElementDecl(namespace = "http://businessLogic/", name = "storeFlight")
    public JAXBElement<StoreFlight> createStoreFlight(StoreFlight value) {
        return new JAXBElement<StoreFlight>(_StoreFlight_QNAME, StoreFlight.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StoreFlightResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link StoreFlightResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://businessLogic/", name = "storeFlightResponse")
    public JAXBElement<StoreFlightResponse> createStoreFlightResponse(StoreFlightResponse value) {
        return new JAXBElement<StoreFlightResponse>(_StoreFlightResponse_QNAME, StoreFlightResponse.class, null, value);
    }

}
