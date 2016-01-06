
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		createStudent();
	}
	
	public static void createStudent(){
		Students st = new Students("male", 21, "Nguyen Duc Thinh", "09-10-1994", "Ha Long", "Ha Noi", 1676564864, "thinhndgc00458@fpt.edu.vn", "SE", "FPT University");
		System.out.println("Student " + st.getName() + "has created!");
		checkGenser(st);
		classRegister(st, "Android");
	}
	
	public static void checkGenser(Students st){
		System.out.println("Gender of this student is: " + st.getGender());
	}
	
	public static void classRegister(Students st, String className){
		System.out.println(st.getName() + "has registed to class " + className);
	}
}
