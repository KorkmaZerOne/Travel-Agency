
public class Address {

	private String street;
	private String houseNumber;
	private int zipCode;
	private String city;
	
	public Address() {
		
	}
	public Address(String street , String houseNumber , int zipCode , String city) {
		this.street = street;
		this.houseNumber = houseNumber;
		this.zipCode = zipCode;
		this.city = city;
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public String getHouseNumber() {
		return houseNumber;
	}
	public void setHouseNumber(String houseNumber) {
		this.houseNumber = houseNumber;
	}
	public int getZipCode() {
		return zipCode;
	}
	public void setZipCode(int zipCode) {
		this.zipCode = zipCode;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	@Override
	public String toString() {
		return "Address [Street:" + street + ", House Number:" + houseNumber + ", Zip Code:" + zipCode + ", City:" + city +"]";
	}
	
}
