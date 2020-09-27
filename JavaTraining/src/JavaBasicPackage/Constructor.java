package JavaBasicPackage;

public class Constructor extends ParentConstructor {

	String s1 = "string initilaized";

	Constructor() {
		//super("anil");
		System.out.println("Overriden default constructor");
	}

	Constructor(String s) {
		//super("anil");
		this.s = s + s;
		System.out.println("Subclass constructor " + this.s);
		System.out.println("Subclass constructor, global variable " + this.s1);

	}

	public void constructor() {
		System.out.println(" This is a normal method in sub class and printing global variable " + s1);
	}

	public static void main(String[] args) {

		ParentConstructor c1 = new Constructor("Test");
		((ParentConstructor)c1).constructor();

	}

}

class ParentConstructor {

	String s;

	ParentConstructor() {
		System.out.println("Overriden default parent constructor");
	}

	ParentConstructor(String s) {
		this.s = s + s;
		System.out.println("Parent constructor " + s);
		System.out.println("Parent constructor, global variable " + this.s);
	}

	public void constructor() {
		System.out.println(" This is a normal method in super class and printing global variable " + s);
	}
}