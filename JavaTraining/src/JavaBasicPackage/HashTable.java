package JavaBasicPackage;

import java.util.Hashtable;

public class HashTable {

	public static void main(String[] args) {
		Hashtable hs = new Hashtable();
		
		System.out.println(hs.size());
		
		for(int i=0; i < 10;i++) {
			
			if(i==9)
				System.out.println(hs.putIfAbsent(i, "finished"));
			else
			System.out.println(hs.putIfAbsent(i, i+1));
		}
		
		System.out.println(hs.size());
		
		for(int i=0; i < hs.size();i++) {
			System.out.print(hs.get(i)+"\t");
		}
		

		System.out.println("");
		System.out.println("***********");
		
		Hashtable <Integer, Character> hs1 = new Hashtable();
		
		for(int i=0; i < 10;i++) {
			System.out.println(hs1.putIfAbsent(i,(char)(65+i)));
		}	
		
		for(int i=0; i < hs1.size();i++) {
			System.out.print(hs1.get(i)+"\t");
	
		}
		
	}

}
