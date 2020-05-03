import java.time.LocalDateTime;
import static java.time.temporal.ChronoUnit.DAYS;

public abstract class Voyage {

	public static final double PRICE_PER_DAY = 40;
	private long totalDays;
	private int totalPersons;
	private LocalDateTime departureDate;
	private LocalDateTime returnDate;
	private Destination destination;
	
	
	Voyage(){
		
	}
	public Voyage(int totalPersons, LocalDateTime departureDate, LocalDateTime returnDate, Destination destination){
		this.totalPersons = totalPersons;
		this.destination = destination;
		if (departureDate.isAfter(LocalDateTime.now()) && returnDate.isAfter(departureDate)) {
			this.departureDate = departureDate;
			this.returnDate = returnDate;
			this.totalDays = DAYS.between(this.getDepartureDate() , this.getReturnDate());			
		}else {
			System.out.println("DEPARTURE DATE must be later from TODAY and RETURN DATE later from DEPARTURE DATE" + "\n" );
		}
	}
	public double calculatePrice() {
		return getPRICE() * getTotalDays() * getTotalPersons();
	}
	public double getPRICE() {
		return PRICE_PER_DAY;
		
	}
	public long getTotalDays() {
		return this.totalDays;
	}
	public int getTotalPersons() {
		return totalPersons;
	}
	public void setTotalPersons(int totalPersons) {
		this.totalPersons= totalPersons;
	}
	public LocalDateTime getDepartureDate() {
		return departureDate;
	}
	public void setDepartureDate(LocalDateTime departureDate) {
		if (departureDate.isAfter(LocalDateTime.now())) {
			this.departureDate = departureDate;
		}else {
			System.out.println("DEPARTURE DATE must be later from TODAY");
		}
	}
	public LocalDateTime getReturnDate() {
		return returnDate;
	}
	public void setReturnDate(LocalDateTime returnDate) {
		if (returnDate.isAfter(departureDate)) {
		this.returnDate = returnDate;
		}else {
			System.out.println("RETURN DATE must be later from DEPARTURE DATE");
		}
	}
	public Destination getDestination() {
		return destination;
	}
	public void setDestination(Destination destination) {
		this.destination = destination;
	}
	@Override
	public String toString() {
		return "Voyage [" + "Total Days:" + totalDays + ", Total Persons:" + totalPersons
				+ ", Departure Date=" + departureDate + ", Return Date=" + returnDate + ", Destination:" + destination
				+ ", Total Price:" + calculatePrice() + "]";
	}
	
}
