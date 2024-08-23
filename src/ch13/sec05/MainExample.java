package ch13.sec05;

public class MainExample {

	public static void main(String[] args) {
		
		Course.regCourseAll(new Applicant<Person>(new Person()));
		Course.regCourseStudent(new Applicant<HighStudent>(new HighStudent()));
		//Course.regCourseStudent(new Applicant<Worker>(new Worker()));

	}

}
