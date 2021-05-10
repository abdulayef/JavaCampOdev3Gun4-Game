package entities;

public class Member {
	public int id;
	public String firstname;
	public String lastName;
	public long nationalityId;
	public int yearofBirth;
	
	public Member(int id, String firstname, String lastName, long nationalityId,int yearofBirth) {
		super();
		this.id = id;
		this.firstname = firstname;
		this.lastName = lastName;
		this.nationalityId = nationalityId;
		this.yearofBirth=yearofBirth;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public long getNationalityId() {
		return nationalityId;
	}
	public void setNationalityId(long nationalityId) {
		this.nationalityId = nationalityId;
	}
	public int getYearofBirth() {
		return yearofBirth;
	}
	public void setYearofBirth(int yearofBirth) {
		this.yearofBirth = yearofBirth;
	}
	
}
