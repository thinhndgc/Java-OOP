
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		createStudent();
	}
	
	public static void createStudent(){
		Student student = new Student("male", 21, "Nguyen Duc Thinh", "09-10-1994", "Ha Long", "Ha Noi", 1676564864, "thinhndgc00458@fpt.edu.vn", "SE", "FPT University");
		System.out.println("Student " + student.getName() + "has created!");
		checkGender(student);
		registerClass(student, "Android");
	}
	
	public static void checkGender(Student student){
		System.out.println("Gender of this student is: " + student.getGender());
	}
	
	public static void registerClass(Student student, String className){
		System.out.println(student.getName() + "has registed to class " + className);
	}
}
