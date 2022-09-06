
public class Icici extends MyDetails {
	public void ifsc() {
		System.out.println("ICICI000062");
		
	}
	public void branchName() {
		System.out.println("Triplicane");
		
	}
	public static void main(String[] args) {
		Icici i=new Icici();
		i.ifsc();
		i.branchName();
		i.name();
		i.address();
		i.panNo();
		i.aadharNo();
	}

}
