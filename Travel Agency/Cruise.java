import java.time.LocalDateTime;

public class Cruise extends Voyage{

	public final double EXTRA_PRICE_CRUISE_COST = 10;
	private boolean vip;
	
	public Cruise() {
		
	}
	public Cruise(int totalPersons, LocalDateTime departureDate, LocalDateTime returnDate, Destination destination , Boolean vip) {
		super(totalPersons, departureDate, returnDate, destination);
		this.vip = vip;
	}
	public boolean isVip() {
		return this.vip;
	}
	public void setVip(boolean vip) {
		this.vip = vip;
	}
	@Override
	public double calculatePrice() {
		double totalPrice;
		if(isVip()==true) {
			totalPrice= (1.5 * (super.calculatePrice() + (super.getTotalPersons()*EXTRA_PRICE_CRUISE_COST)));
		}else {
			totalPrice= super.calculatePrice() + (super.getTotalPersons()*EXTRA_PRICE_CRUISE_COST);
		}
		return totalPrice;
	}
	@Override
	public String toString() {
		return "Cruise [ is Vip:" + isVip()
				+ ", Total Price:" + calculatePrice() + ", Total Days:" + getTotalDays()
				+ ", Total Persons:" + getTotalPersons() + ", Departure Date:" + getDepartureDate()
				+ ", Return Date:" + getReturnDate() + ", Destination:" + getDestination() + "]";
	}
	
}
