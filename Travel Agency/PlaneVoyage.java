import java.time.LocalDateTime;

public class PlaneVoyage extends Voyage{

	private double airplaneTicketPrice;
	
	public PlaneVoyage(double airplaneTicketPrice) {
		this.airplaneTicketPrice = airplaneTicketPrice;
	}
	public PlaneVoyage(int totalPersons , LocalDateTime departureDate, LocalDateTime returnDate , Destination destination , double airplaneTicketPrice) {
		super(totalPersons , departureDate , returnDate , destination);
	}
	@Override
	public double calculatePrice() {
		double totalPrice;
		totalPrice= super.calculatePrice() + (super.getTotalPersons()*airplaneTicketPrice);
		return totalPrice;	
	}
	@Override
	public String toString() {
		return "Plane Voyage [ Total Price:" + calculatePrice()
				+ ", Total Days:" + getTotalDays() + ", Total Persons:" + getTotalPersons()
				+ ", Departure Date:" + getDepartureDate() + ", ReturnDate:" + getReturnDate()
				+ ", Destination:" + getDestination() + "]";
	}
}
