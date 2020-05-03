
public class TravelAgency {

	private String name;
	private Address address;
	
	public TravelAgency(Address address , String name) {
		this.address = address;
		this.name = name;
	}

	@Override
	public String toString() {
		return "TravelAgency [Name:" + name + " " + address + "]";
	}
	
}
