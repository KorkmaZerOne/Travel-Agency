import java.time.LocalDateTime;

public class ReservationApp {

	public static void main(String[] args) {		
		
		Person traveler = new Person("Omer" , "Korkmaz" , new Address("Lang" , "99" , 1930 , "Gent"));
		Person voyager = new Person("Jessy" , "Lane" , new Address());
		System.out.println(traveler.toString());
		System.out.println(voyager.toString() +"\n");
		
		TravelAgency agency = new TravelAgency(new Address("Kort" , "01" , 1000 , "Brussel" ) , "Paradise");
		System.out.println(agency.toString() +"\n");
		
		PlaneVoyage boeing = new PlaneVoyage(4 , LocalDateTime.of(2020, 01, 31, 10, 30) , LocalDateTime.of(2020, 01, 30, 22, 30) , Destination.JAPAN , 250.0);
		Cruise titanic = new Cruise(7 , LocalDateTime.of(2020, 06, 15, 11, 00) , LocalDateTime.of(2020, 06, 30, 20, 00) , Destination.BRAZIL , true);
		CarVoyage limousine = new CarVoyage(19 , LocalDateTime.of(2020, 07, 16, 10, 45) , LocalDateTime.of(2020, 07, 30, 10, 45) , Destination.INDIA , true);
		System.out.println(boeing.toString());
		System.out.println(titanic.toString());
		System.out.println(limousine.toString());
		
		VoyageReservation booking1 = new VoyageReservation(traveler , titanic , agency );
		VoyageReservation booking2 = new VoyageReservation(voyager , boeing , agency );
		System.out.println(booking1);
		System.out.println(booking2);
		
		ReservationLog bookings = new ReservationLog();
		bookings.addReservationToList(booking1);
		bookings.addReservationToList(booking2);
		System.out.println(bookings.toString());
	}
}
