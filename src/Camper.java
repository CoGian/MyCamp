
public class Camper {

	private String fullname ; 
	private String telephone ; 
	private String city ; 
	private int age ; 
	private String transport ; 
	private boolean gender;// 0->male 1->female
	private String allergiesAndDrugs ; 
	private String judgment ;
	
	
	public Camper(String fullname, String telephone, String city, int age, String transport, boolean gender,
			String allergiesAndDrugs, String judgment) {
		
		this.fullname = fullname;
		this.telephone = telephone;
		this.city = city;
		this.age = age;
		this.transport = transport;
		this.gender = gender;
		this.allergiesAndDrugs = allergiesAndDrugs;
		this.judgment = judgment;
	}


	public String getFullname() {
		return fullname;
	}


	public void setFullname(String fullname) {
		this.fullname = fullname;
	}


	public String getTelephone() {
		return telephone;
	}


	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}


	public String getCity() {
		return city;
	}


	public void setCity(String city) {
		this.city = city;
	}


	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}


	public String getTransport() {
		return transport;
	}


	public void setTransport(String transport) {
		this.transport = transport;
	}


	public boolean isGender() {
		return gender;
	}


	public void setGender(boolean gender) {
		this.gender = gender;
	}


	public String getAllergiesAndDrugs() {
		return allergiesAndDrugs;
	}


	public void setAllergiesAndDrugs(String allergiesAndDrugs) {
		this.allergiesAndDrugs = allergiesAndDrugs;
	}


	public String getJudgment() {
		return judgment;
	}


	public void setJudgment(String judgment) {
		this.judgment = judgment;
	} 
	
	
	
}
