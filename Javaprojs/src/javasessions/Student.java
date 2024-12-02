package javasessions;

public class Student {
	//WAF
	//name:get student mark
	//input parameter: (String)
	//return: marks (int)
	
	public int getStudentMarks(String studentName) {
		System.out.println("getting marks for student: " + studentName);
		int marks = -1;
		
		if(studentName.equals("sameer")) {
			marks = 90;
		}
		else if(studentName.equals("Harshini")) {
			marks = 95;
		}
		else if(studentName.equals("Ram")) {
			marks = 100;
		}
		else if(studentName.equals("Naveen")) {
			marks = 10;
		}
		else {
			System.out.println("please pass correct student name.....");
			
		}
		return marks;
	}
	
	
	

	public static void main(String[] args) {
		Student st = new Student();
		int m = st.getStudentMarks("sameer");
		System.out.println(m+5-3);
		
		m = st.getStudentMarks("sri");
		System.out.println(m);
		
		if(m==-1) {
			System.out.println("don't generate the mark sheet");
		}

	}

}
