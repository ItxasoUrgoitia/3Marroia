package client;


import javax.swing.JPanel;

import javax.swing.JFrame;
import javax.swing.JLabel;

import java.awt.EventQueue;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.net.URL;
import java.sql.SQLException;
import java.util.Calendar;
import java.util.Collection;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Iterator;
import java.util.List;

import javax.swing.ButtonGroup;
import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListModel;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JRadioButton;

import businessLogic.*;
//import service.FlightManager;

import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JList;
import javax.swing.border.EmptyBorder;
import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;

public class FlightBooking extends JFrame {
	

	private static final long serialVersionUID = 1L;
	private JPanel contentPane= null;
	private JLabel lblDepartCity = new JLabel("Departing city:");
	private JLabel lblArrivalCity = new JLabel("Arrival City");
	private JLabel lblYear = new JLabel("Year:");
	private JLabel lblRoomType = new JLabel("Room Type:");
	private JLabel lblMonth = new JLabel("Month:");
	private JLabel lblDay = new JLabel("Day:");;
	private JLabel jLabelResult = new JLabel();
	private JLabel searchResult =   new JLabel();
	
	private JTextField day = null;
	private JComboBox<String> months = null;
	private DefaultComboBoxModel<String> monthNames = new DefaultComboBoxModel<String>();

	private JTextField year = null;
	
	private JRadioButton bussinesTicket = null;
	private JRadioButton firstTicket = null;
	private JRadioButton touristTicket = null;

	private ButtonGroup fareButtonGroup = new ButtonGroup();  
	
	private JButton lookforFlights = null;

	private JButton bookFlight = null;
	
	
	private JComboBox<String> departCity = null;
	private JComboBox<String> arrivalCity = null;
	private DefaultComboBoxModel<String> arrivalCityNames = new DefaultComboBoxModel<String>();
	

	
	private Collection<ConcreteFlight> concreteFlightCollection;
	
	private FlightManager businessLogic = null;  //  @jve:decl-index=0:;
	
	private ConcreteFlight selectedConcreteFlight;
	private final JComboBox flightListComboBox = new JComboBox();
	
	

	/**
	 * Launch the application.
	 */

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FlightBooking frame = new FlightBooking();
					URL url = new URL("http://localhost:9999/ws?wsdl");		
					QName qname = new QName("http://service/","FlightManagerService");
					Service service = Service.create(url, qname);
					FlightManager businessLogic=service.getPort(FlightManager.class);
					//FlightManager businessLogic = new FlightManagerService();
					frame.setBusinessLogic(businessLogic);
					//frame.setBusinessLogic(new FlightManagerService()); 
					frame.initializeCombo();
					
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	public void setBusinessLogic(FlightManager g) {businessLogic = g;}
	
	private XMLGregorianCalendar newDate(int year,int month,int day) {

	     Calendar calendar = Calendar.getInstance();
	     calendar.set(year, month, day,0,0,0);
	     calendar.set(Calendar.MILLISECOND, 0);

	     return toXMLGregorianCalendar(calendar.getTime());
	}
	
	private XMLGregorianCalendar toXMLGregorianCalendar(java.util.Date date) {
		GregorianCalendar gCalendar = new GregorianCalendar();
		gCalendar.setTime(date);
		XMLGregorianCalendar xmlCalendar = null;
		try {
			xmlCalendar = DatatypeFactory.newInstance().newXMLGregorianCalendar(gCalendar);
		} catch (DatatypeConfigurationException ex) {
			System.out.println(ex);
		}
		return xmlCalendar;
	}
	
	private void initializeCombo() {
		
		List<String> departingCities = businessLogic.getAllDepartingCities();
		DefaultComboBoxModel<String> departCityNames = new DefaultComboBoxModel<>();
		for (String dp : departingCities) {
			departCityNames.addElement(dp);
		}
		
		departCity.setModel(departCityNames);
		departCity.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				List<String> arrivingCities = businessLogic.getArrivalCitiesFrom((String) departCity.getSelectedItem());
				arrivalCityNames.removeAllElements();
				for (String city : arrivingCities) {
					arrivalCityNames.addElement(city);
				}
				}
		});
		
	}
	
	
	/**
	 * Create the frame
	 * 
	 * @return void
	 */
	private  FlightBooking() {
		
		setTitle("Book Flight");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 353);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		lblDepartCity = new JLabel("Depart City");
		lblDepartCity.setBounds(21, 11, 103, 16);
		contentPane.add(lblDepartCity);
		
	
		// ARRIVALS
		arrivalCity = new JComboBox<String>();
		arrivalCity.setBounds(99, 34, 243, 26);
		contentPane.add(arrivalCity);
		arrivalCity.setModel(arrivalCityNames);
		
		
		// DEPARTURES
		departCity = new JComboBox<String>();
		departCity.setBounds(99, 6, 243, 26);
		contentPane.add(departCity);
		
		
		
		lblYear = new JLabel("Year:");
		lblYear.setBounds(21, 62, 33, 16);
		contentPane.add(lblYear);
		
		lblMonth = new JLabel("Month:");
		lblMonth.setBounds(117, 62, 50, 16);
		contentPane.add(lblMonth);
	    
		months = new JComboBox<String>();
		months.setBounds(163, 58, 116, 27);
		contentPane.add(months);
		months.setModel(monthNames);
		
		monthNames.addElement("January");
		monthNames.addElement("February");
		monthNames.addElement("March");
		monthNames.addElement("April");
		monthNames.addElement("May");
		monthNames.addElement("June");
		monthNames.addElement("July");
		monthNames.addElement("August");
		monthNames.addElement("September");
		monthNames.addElement("October");
		monthNames.addElement("November");
		monthNames.addElement("December");
		months.setSelectedIndex(1);
		
		lblDay = new JLabel("Day:");
		lblDay.setBounds(291, 62, 38, 16);
		contentPane.add(lblDay);
		
		day = new JTextField();
		day.setText("23");
		day.setBounds(331, 57, 50, 26);
		contentPane.add(day);
		day.setColumns(10);
		
		lblRoomType = new JLabel("Seat Type:");
		lblRoomType.setBounds(21, 242, 84, 16);
		contentPane.add(lblRoomType);
		
		
		
		bussinesTicket = new JRadioButton("Business");
		bussinesTicket.setSelected(true);
		fareButtonGroup.add(bussinesTicket);
		bussinesTicket.setBounds(99, 238, 101, 23);
		contentPane.add(bussinesTicket);
		
		firstTicket = new JRadioButton("First");
		fareButtonGroup.add(firstTicket);
		firstTicket.setBounds(202, 238, 77, 23);
		contentPane.add(firstTicket);
		
		touristTicket = new JRadioButton("Tourist");
		fareButtonGroup.add(touristTicket);
		touristTicket.setBounds(278, 238, 77, 23);
		contentPane.add(touristTicket);
		
		lookforFlights = new JButton("Look for Concrete Flights");
		lookforFlights.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					bookFlight.setEnabled(true);
					flightListComboBox.removeAllItems();
					bookFlight.setText("");
					
					XMLGregorianCalendar date;
					date =newDate(Integer.parseInt(year.getText()),months.getSelectedIndex(),Integer.parseInt(day.getText()));
					 
					
					concreteFlightCollection=businessLogic.getConcreteFlights((String) departCity.getSelectedItem(),(String)arrivalCity.getSelectedItem(),date);
					Iterator<ConcreteFlight> flights=concreteFlightCollection.iterator();
					while (flights.hasNext()) 
						flightListComboBox.addItem(flights.next()); 
					if (concreteFlightCollection.isEmpty()) searchResult.setText("No flights in that city in that date");
					else searchResult.setText("Choose an available flight in this list:");
			} catch (NumberFormatException ex) { 
				searchResult.setText("Errorea: dataren formatua ez da zuzena");
			}
			}
		});
		lookforFlights.setBounds(81, 90, 261, 40);
		contentPane.add(lookforFlights);	
		
		jLabelResult = new JLabel("");
		jLabelResult.setBounds(109, 180, 243, 16);
		contentPane.add(jLabelResult);
		
        flightListComboBox.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                selectedConcreteFlight = (ConcreteFlight) flightListComboBox.getSelectedItem();
                
                if (selectedConcreteFlight != null) {
                    bookFlight.setEnabled(true);
                    bookFlight.setText("Book: " + selectedConcreteFlight);
                    bussinesTicket.setEnabled(selectedConcreteFlight.getBussinesNumber() > 0);
                    firstTicket.setEnabled(selectedConcreteFlight.getFirstNumber() > 0);
                    touristTicket.setEnabled(selectedConcreteFlight.getTouristNumber() > 0);
                } else {
                    bookFlight.setEnabled(false);
                    bookFlight.setText("Book");
                }
            }
        });

		flightListComboBox.setBounds(64, 159, 336, 71);
		contentPane.add(flightListComboBox);
		
		bookFlight = new JButton("");
		bookFlight.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int num=0;
				boolean ok = true;
				String type;
				int numOfSeatsToBook = 1;
				
				if (bussinesTicket.isSelected()) {
					type = "business";
					ok = businessLogic.bookSeat(selectedConcreteFlight, type, numOfSeatsToBook); 
				}
				if (firstTicket.isSelected()) {
					type = "first";
					ok = businessLogic.bookSeat(selectedConcreteFlight, type, numOfSeatsToBook); 
				}
				if (touristTicket.isSelected()) {
					type = "tourist";
					ok = businessLogic.bookSeat(selectedConcreteFlight, type, numOfSeatsToBook);
				}
				
				if (!ok) bookFlight.setText("Error: There were no seats available!");
				else{
					bookFlight.setText("Booked. #seat left: "+(num-1));
					bussinesTicket.setEnabled(false);
					firstTicket.setEnabled(false);
					touristTicket.setEnabled(false);
					bookFlight.setEnabled(false);
					flightListComboBox.removeAllItems();
				}
			}
		});
		flightListComboBox.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (flightListComboBox.getSelectedItem() != null) {
                    selectedConcreteFlight = (ConcreteFlight) flightListComboBox.getSelectedItem();
                    bookFlight.setEnabled(true);
                    bookFlight.setText("Book: " + selectedConcreteFlight);
                }
            }
        });
		bookFlight.setBounds(31, 273, 399, 40);
		contentPane.add(bookFlight);

		year = new JTextField();
		year.setText("2025");
		year.setBounds(57, 57, 50, 26);
		contentPane.add(year);
		year.setColumns(10);
		
		lblArrivalCity.setBounds(21, 39, 84, 16);
		contentPane.add(lblArrivalCity);
		
		searchResult.setBounds(57, 130, 314, 16);
		contentPane.add(searchResult);
		
		addWindowListener(new WindowAdapter() {
	        @Override
	        public void windowClosing(WindowEvent e) {
	            if (businessLogic != null) {
	                businessLogic.close();
	                System.out.println("DataBase sucessfully closed.");
	            }
	        }
	    });
	}
}  //  @jve:decl-index=0:visual-constraint="18,9"
