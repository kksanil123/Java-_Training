package JavaBasicPackage;

public class Loop {

	public static void main(String[] args) {
		int i=1;
		while(i<=10) {
			System.out.println(i);
			i++;
		}
		
		System.out.println("@@@@@@@");
		
		for(;i<20;i++) {
			System.out.println(i);
			if(i==15) {
				//break;
				continue;
			}
			System.out.println("breaking");
		}
}
}