package JavaBasicPackage;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorConcept {

	public static void main(String[] args) {
		
		int b=0;
		
		ArrayList<EmployeeInfo> a1= new ArrayList<EmployeeInfo>();
		
		System.out.println("Creating  employee objects to ArrayList");
		
		for(int i=0;i<5;i++) {
			EmployeeInfo e = new EmployeeInfo();
			//e.getEmployeeDtails((2000+i), String.valueOf((char)(i+65)));
			a1.add(e);
			//System.out.println(a1.get(i));
		}
		
		System.out.println("*****************");
		
		System.out.println("Adding and Iterating over the employee details through Advanced for loop");
		

		for(EmployeeInfo e2 : a1) {
			
				e2.getEmployeeDtails((3000+b), String.valueOf((char)(b+65)));
				b++;
		}
		
		System.out.println("^^^^^^^^^^^^ **********");
		
		System.out.println("Adding and Iterating over the employee details through iterator");
		
		Iterator<EmployeeInfo> i = a1.iterator();
		
		while(i.hasNext()) {
			
			i.next().getEmployeeDtails((2000+b), String.valueOf((char)(b+65)));
			 b++;

		}
		
			
	}

}

class EmployeeInfo {
	
	public void getEmployeeDtails(int empno, String empname) {
		 
		System.out.println(empno +"\t"+ empname);
	}
}
