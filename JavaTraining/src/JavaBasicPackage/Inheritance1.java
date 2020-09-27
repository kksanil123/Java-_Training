package JavaBasicPackage;

public class Inheritance1 {

	public static void main(String[] args) {
		
		// Child accessing his/her own properties directly
		
		System.out.println("Child accessing his/her own properties directly");
		 
		Child ch = new Child();
		ch.sing();
		ch.dance();
		ch.specialforParent();
		ch.age();
		
		// Parent accessing his/her own properties directly
		
		System.out.println("Parent accessing his/her own properties directly");
		
		Parent p = new Parent();
		p.read();
		p.write();
		p.age();
		
		// Child accessing his/her own properties through parent
		
		System.out.println("Child accessing his/her own properties through parent refernce ");
		
		Parent p1 = new Child();
		p1.read();
		p1.read("Java stories");
		p1.write();
		p1.sing();
		p1.specialforParent();
		p1.age();
		
		// Child accessing his/her own properties through parent object via typecasting
		
		/*
		 System.out.println("Child accessing his/her own properties through parent object via typecasting");
	
		
		Child ch1 =(Child) new Parent();
		ch1.read();
		ch1.read("python");
		ch1.write();
		ch1.specialforParent();
		ch1.dance();
		ch1.age(); 
		*/
		
		// Grandparent accessing his/her own properties directly
		
		System.out.println("Grandparent accessing his/her own properties directly");
		
		GrandParent gp = new GrandParent();
		gp.read();
		gp.write();
		gp.age(); 
		
		// Parent accessing his/her own properties through Grandparent reference
		
		System.out.println("Parent accessing his/her own properties through Grandparent refernce");
						
		GrandParent gp1 = new Parent();
		gp1.read();
		gp1.write();
		gp1.age(); 		
		System.out.println(gp1.equals(p));
		
		// Parent accessing his/her own properties through Grandparent object via type casting
		
		/* System.out.println("Parent accessing his/her own properties through Grandparent object via type casting");
				
		Parent p2 = (Parent) new GrandParent();
		p2.read();
		p2.write();
		p2.read("animation ");
		p2.sing();
		p2.age(); 
		*/
		
		// child accessing his/her own properties through Grandparent reference
		
		System.out.println("Child accessing his/her own properties through Grandparent refernce");
							
		GrandParent gp2 = new Child();
		gp2.read();
		gp2.write();
		gp2.age(); 		
		System.out.println(gp2.equals(gp1));
		
	}



}

class GrandParent {
	int age = 100;
	
	public void read() {
		System.out.println("Grand parent reading all books");
	}
	
	public void write() {
		System.out.println("Grand parent writing all books");
	}
	
	public void age() {
		System.out.println(age);
	}
	
}

class Parent extends GrandParent {
	int age = 50;
	
	public void read() {
		System.out.println("Parent reading only specific books");
	}
	
	public void read(String s) {
		System.out.println("Parent reading only "+ s + "books");
	}
	
	
	public void write() {
		System.out.println("Parent writing specific books");
	}
	
	public void age() {
		System.out.println(age);
	}
	
	public void sing() {
		System.out.println("Parent singing all songs");
	}
	
	public void specialforParent() {
		System.out.println("This is special method for parent calss only");
	}
}

class Child extends Parent {
	int age = 25;
	
	public void read() {
		System.out.println("Child reading only specific books");
	}
	
	public void read(String s) {
		System.out.println("Child reading only "+ s + "books");
	}
	
	public void write() {
		System.out.println("Child writing specific books");
	}
	
	public void sing() {
		System.out.println("Child singing all songs");
	}
	
	public void age() {
		System.out.println(age);
	}
	
	public void dance() {
		System.out.println("Child dancing for all songs");
	}
}
