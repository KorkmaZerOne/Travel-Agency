import java.time.LocalDateTime;

public class CarVoyage extends Voyage{

	public static final double EXTRA_PRICE_CAR_RENTAL = 10;
	private boolean ownCar;
	
	
	public CarVoyage(boolean ownCar) {
		this.ownCar = ownCar;
	}
	public CarVoyage(int totalPersons , LocalDateTime departureDate, LocalDateTime returnDate, Destination destination, boolean ownCar) {
		super(totalPersons, departureDate, returnDate, destination);
		this.ownCar = ownCar;
	}
	public boolean isOwnCar() {
		return this.ownCar;
	}
	public void setOwnCar(boolean ownCar) {
		this.ownCar = ownCar;
	}
	@Override
	public double calculatePrice() {
		double totalPrice;
		if (isOwnCar()==true) {
			totalPrice= super.calculatePrice() + (calculateNumberOfCars()*EXTRA_PRICE_CAR_RENTAL);
		}else {
			totalPrice = super.calculatePrice();
		}
		return totalPrice;
	}
	public double calculateNumberOfCars() {
		double totalCars; 
		if(isOwnCar()== false ) {
			if(super.getTotalPersons()%5 == 0) {
				totalCars= super.getTotalPersons()/5;
			}else  {
			totalCars = Math.ceil(super.getTotalPersons()/5) + 1;
			}
		}else {
			totalCars=0;
		}
		return totalCars;
	}
	@Override
	public String toString() {
		return "Car Voyage [ Has own car:" + isOwnCar() + ", Total Price()=" + calculatePrice()
				+ ", Number of rent car:" + calculateNumberOfCars() + ", Total Days:" + getTotalDays()
				+ ", Total Persons:" + getTotalPersons() + ", Departure Date:" + getDepartureDate()
				+ ", Return Date:" + getReturnDate() + ", Destination:" + getDestination() + "]";
	}
	
}
