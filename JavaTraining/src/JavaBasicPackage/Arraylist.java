package JavaBasicPackage;

import java.util.ArrayList;

public class Arraylist {

	public static void main(String[] args) {
		
		ArrayList al = new ArrayList(); 
		System.out.println(al.size());
		
		al.add(1);
		al.add("kishore sai anil");
		al.add("Test Engineer");
		al.add("Living in madhapur");
		al.add(3, 23);
		al.add(4, "24/05/2018");
		
		System.out.println(al.size()); 
		 
		for(int i=0; i < al.size();i++) {
			System.out.print(al.get(i)+ "\t");
			al.remove(i);
			System.out.println(al.size());
		}
		
		for(int i=0; i < al.size();i++) {
			System.out.print(al.get(i)+ "\t");
		}
		
		System.out.println("*************************");
		
		ArrayList<Integer> al1= new ArrayList();
		
		for(int i=0; i < 10;i++) {
			System.out.println(al1.add(i+1));
		}
		
		System.out.println(al1.size());
		
	}

}
