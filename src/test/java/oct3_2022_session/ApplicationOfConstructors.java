package oct3_2022_session;

//10000 employees = 30000 lines of code - do you think this is a good approach to coding ??

public class ApplicationOfConstructors {
	String empname; 
	int empid; 
	int age;  

	public static void main(String[] args) {
		ApplicationOfConstructors emp = new ApplicationOfConstructors("Virat", 101, 30);
		System.out.println(emp.empname + "  " + emp.empid + " " + emp.age) ;
		
		
		ApplicationOfConstructors emp1 = new ApplicationOfConstructors("Rohit", 102, 31);
		System.out.println(emp1.empname + "  " + emp1.empid + " " + emp1.age) ;
	}
	
	
	 
	 
	 public ApplicationOfConstructors(String empname, int empid, int age){
		 this.empname = empname;
		 this.empid=empid;
		 this.age=age;
			
		}

}
