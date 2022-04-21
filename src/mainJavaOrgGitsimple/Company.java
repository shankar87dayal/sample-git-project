package mainJavaOrgGitsimple;

public class Company {

	
	private String name;
	
	private String address;
	private String city;
	
	@Override
	public String toString() {
		return "(name=" + name + ",address=" +address + ")";
	}
}
