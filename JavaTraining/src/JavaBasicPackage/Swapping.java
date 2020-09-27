package JavaBasicPackage;

public class Swapping {

	String s1= "sister";
	String s2= "brother";

	public static void main(String[] args) {

		Swapping k= new Swapping();
		System.out.println(k.s1);
		System.out.println(k.s2);
		System.out.println("After swapping");
		k.swap(k);
		System.out.println(k.s1);
		System.out.println(k.s2);
	}

	public void swap(Swapping k){
		String temp;
		temp =k.s1;
		k.s1 =k.s2;
		k.s2 = temp;
		
	}
}
