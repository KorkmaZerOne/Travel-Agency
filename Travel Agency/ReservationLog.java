import java.util.Arrays;

public class ReservationLog {
	
	private VoyageReservation [] successfulBookings;
	private VoyageReservation [] failedBookings;
	
	public ReservationLog() {
		this.successfulBookings = new VoyageReservation[1];
		this.failedBookings = new VoyageReservation[1];
	}
	public void addReservationToList(VoyageReservation voyageReservation) {
		if (voyageReservation.getVoyage().getTotalDays()>0 && voyageReservation.getVoyage().getTotalPersons()>0 ) {
			this.successfulBookings = Arrays.copyOf(this.successfulBookings, this.successfulBookings.length + 1);
	        for (int i = 0; i < this.successfulBookings.length ; i++) {
	            if (this.successfulBookings[i] == null) {
	                this.successfulBookings[i] = voyageReservation;
	                break;			
		         }
		    }
		}else {
			this.failedBookings = Arrays.copyOf(this.failedBookings, this.failedBookings.length + 1);
	        for (int i = 0; i < this.failedBookings.length ; i++) {
	            if (this.failedBookings[i] == null) {
	                this.failedBookings[i] = voyageReservation;
	                break;
	            }
	        }
		}
	}
	@Override
	public String toString() {
		return "ReservationLog [Successful Bookings:" + Arrays.toString(successfulBookings) + ", Failed Bookings:"
				+ Arrays.toString(failedBookings) + "]";
	}
	
}
