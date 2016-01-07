
public class Animal {
	private String gender;
	private int age;
	/**
	 * @return the gender
	 */
	public String getGender() {
		return gender;
	}
	/**
	 * @param gender the gender to set
	 */
	public void setGender(String gender) {
		this.gender = gender;
	}
	/**
	 * @return the age
	 */
	public int getAge() {
		return age;
	}
	/**
	 * @param age the age to set
	 */
	public void setAge(int age) {
		this.age = age;
	}
	
	/**
	 * @param gender
	 * @param age
	 */
	public Animal(String gender, int age) {
		super();
		this.gender = gender;
		this.age = age;
	}
	
}
