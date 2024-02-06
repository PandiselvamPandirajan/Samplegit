package sampleProject;

public class DemoCode {
	
	public void empId() {
		System.out.println(1235);
	}
	public void empname() {
		System.out.println("Name");
	}

	public static void main(String[] args) {
		
	// Object creation
		
	// Class name  objref = new Class name();
		DemoCode one 	  = new DemoCode();
		
	// method call syntax
	// objref.methodname();
		
		one.empId();
		one.empname();
	}

}
