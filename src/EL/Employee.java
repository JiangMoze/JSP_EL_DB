package EL;

public class Employee {
	private String empName;
	private String email;
	private String phone;
	private Address address;
	public Employee(){
		
		
	}
	public Employee(String empName, String email, String phone, Address address) {
	
		this.empName = empName;
		this.email = email;
		this.phone = phone;
		this.address = address;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}

}
