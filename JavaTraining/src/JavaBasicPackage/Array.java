package JavaBasicPackage;

public class Array {

	public static void main(String[] args) {
		Object ob[]= new Object[5];
		ob[0]=1;
		ob[1]="kishore";
		
		String s[][] = new String[3][5];
		
		for(int i=0;i<s.length;i++) {
			for(int j=0;j<s[0].length;j++) {
				s[i][j]=Integer.toString(i+j);
				
			}
				
		}

		for(int i=0;i<s.length;i++) {
			for(int j=0;j<s[0].length;j++) {
				System.out.print(s[i][j]);
				System.out.print("\t");
			}
			System.out.println();	
		}
	}

}
