
public class Candidate {
	private String name;
	
	private String technicalExpertice;
	
	private String city;
	
	private int yearsOfExperience;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getTechnicalExpertice() {
		return technicalExpertice;
	}

	public void setTechnicalExpertice(String technicalExpertice) {
		this.technicalExpertice = technicalExpertice;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public int getYearsOfExperience() {
		return yearsOfExperience;
	}

	public void setYearsOfExperience(int yearsOfExperience) {
		this.yearsOfExperience = yearsOfExperience;
	}

	@Override
	public String toString() {
		return "Candidate [name=" + name + ", technicalExpertice=" + technicalExpertice + ", city=" + city
				+ ", yearsOfExperience=" + yearsOfExperience + "]";
	}

	public Candidate(String name, String technicalExpertice, String city, int yearsOfExperience) {
		super();
		this.name = name;
		this.technicalExpertice = technicalExpertice;
		this.city = city;
		this.yearsOfExperience = yearsOfExperience;
	}

	public Candidate() {
		super();
	}
	
	
	
	

}
