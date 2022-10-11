package oct10_2022_session;

public class Employee extends Check {
	// a normal class[sub/child Class] can inherit an Abstract class[parent/super
	// class]
	// the condition - it should allow to make the body of the unimplemented methods
	// of that Abstract class

	public static void main(String[] args) {
		Employee emp = new Employee();
		emp.name = "Rahul";
		emp.emp_id = 101;
		emp.abnormal();
		emp.abnormal1();
		emp.abnormal2();
		emp.abnormal3();
		emp.abnormal4();
		emp.abnormal5();
		emp.normal();
		
		

		EmployeeNew empn = new EmployeeNew();
		empn.abnormal();
		empn.abnormal1();
		empn.abnormal2();
		empn.abnormal3();
		empn.abnormal4();
		empn.abnormal5();
		
		

	}

	@Override
	public void abnormal() {
		System.out.println("Employee abnormal method");

	}

	@Override
	public void abnormal1() {
		System.out.println("Employee abnormal method1");
	}

	@Override
	public void abnormal2() {
		System.out.println("Employee abnormal method2");
	}

	@Override
	public void abnormal3() {
		System.out.println("Employee abnormal method3");
	}

	@Override
	public void abnormal4() {
		System.out.println("Employee abnormal method4");
	}

	@Override
	public void abnormal5() {
		System.out.println("Employee abnormal method5");

	}

}
