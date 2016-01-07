
public class Human extends Animal{
	private String name;
	private String dateOfBirth;
	private String homeTown;
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the dateOfBirth
	 */
	public String getDateOfBirth() {
		return dateOfBirth;
	}
	/**
	 * @param dateOfBirth the dateOfBirth to set
	 */
	public void setDateOfBirth(String dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	/**
	 * @return the homeTown
	 */
	public String getHomeTown() {
		return homeTown;
	}
	/**
	 * @param homeTown the homeTown to set
	 */
	public void setHomeTown(String homeTown) {
		this.homeTown = homeTown;
	}
	/**
	 * @param gender
	 * @param age
	 * @param name
	 * @param dateOfBirth
	 * @param homeTown
	 */
	public Human(String gender, int age, String name, String dateOfBirth, String homeTown) {
		super(gender, age);
		this.name = name;
		this.dateOfBirth = dateOfBirth;
		this.homeTown = homeTown;
	}
	
	
}
