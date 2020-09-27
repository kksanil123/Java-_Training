package JavaBasicPackage;

public class Iface implements interfacee {
	
	public void enforce() {
		
		System.out.println("This method is enforced by interface");
	}
	
	public void mandate() {
		
		System.out.println("This method is mandate from interface");
	}

	public static void main(String[] args) {
		
		Iface iface = new Iface();
		int a1 =iface.a;
		System.out.println(a1);
		System.out.println(iface.b);
		System.out.println(iface.s);
		iface.enforce();
		iface.mandate();
		interfacee.mandate();
	}

}
