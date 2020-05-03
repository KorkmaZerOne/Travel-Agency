
public class VoyageReservation {

	private Person person;
	private Voyage voyage;
	private TravelAgency travelAgency;

	public VoyageReservation(Person person, TravelAgency travelAgency) {
		this.person = person;
		this.travelAgency = travelAgency;
	}
	public VoyageReservation(Person person, Voyage voyage, TravelAgency travelAgency) {
		super();
		this.person = person;
		this.voyage = voyage;
		this.travelAgency = travelAgency;
	}
	public Person getPerson() {
		return person;
	}
	public void setPerson(Person person) {
		this.person = person;
	}
	public Voyage getVoyage() {
		return voyage;
	}
	public void setVoyage(Voyage voyage) {
		this.voyage = voyage;
	}
	public TravelAgency getTravelAgency() {
		return travelAgency;
	}
	public void setTravelAgency(TravelAgency travelAgency) {
		this.travelAgency = travelAgency;
	}
	@Override
	public String toString() {
		return "VoyageReservation [person=" + person + ", voyage=" + voyage + ", travelAgency=" + travelAgency + "]";
	}
	
}
