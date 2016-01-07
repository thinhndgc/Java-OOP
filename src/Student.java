
public class Student extends Human{
	private String Address;
	private int phoneNumber;
	private String email;
	private String certificate;
	private String studentOfUniversity;
	/**
	 * @return the address
	 */
	public String getAddress() {
		return Address;
	}
	/**
	 * @param address the address to set
	 */
	public void setAddress(String address) {
		Address = address;
	}
	/**
	 * @return the phoneNumber
	 */
	public int getPhoneNumber() {
		return phoneNumber;
	}
	/**
	 * @param phoneNumber the phoneNumber to set
	 */
	public void setPhoneNumber(int phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}
	/**
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}
	/**
	 * @return the certificate
	 */
	public String getCertificate() {
		return certificate;
	}
	/**
	 * @param certificate the certificate to set
	 */
	public void setCertificate(String certificate) {
		this.certificate = certificate;
	}
	/**
	 * @return the studentOfUniversity
	 */
	public String getStudentOfUniversity() {
		return studentOfUniversity;
	}
	/**
	 * @param studentOfUniversity the studentOfUniversity to set
	 */
	public void setStudentOfUniversity(String studentOfUniversity) {
		this.studentOfUniversity = studentOfUniversity;
	}
	/**
	 * @param gender
	 * @param age
	 * @param name
	 * @param dateOfBirth
	 * @param homeTown
	 * @param address
	 * @param phoneNumber
	 * @param email
	 * @param certificate
	 * @param studentOfUniversity
	 */
	public Student(String gender, int age, String name, String dateOfBirth, String homeTown, String address,
			int phoneNumber, String email, String certificate, String studentOfUniversity) {
		super(gender, age, name, dateOfBirth, homeTown);
		Address = address;
		this.phoneNumber = phoneNumber;
		this.email = email;
		this.certificate = certificate;
		this.studentOfUniversity = studentOfUniversity;
	}
	
	
}
