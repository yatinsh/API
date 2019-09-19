package APIFramework.API;

public class BasicInformation {

	private String firstname;
	private String lastname;
	private String age;
	private String id;
	private String Designation;
	private AddressDetails address[];
	public String getFirstname() {
		return firstname;
	}
	
	public AddressDetails[] getAddress() {
		return address;
	}

	public void setAddress(AddressDetails[] address) {
		this.address = address;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getDesignation() {
		return Designation;
	}
	public void setDesignation(String designation) {
		Designation = designation;
	}

}
