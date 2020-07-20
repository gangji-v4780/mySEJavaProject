import java.util.Scanner;

public class CustomerMain {
	public static void main(String[] args) {
		Scanner id=new Scanner(System.in);
		Customer[] cust=new Customer[10];
		int ids;
		String pswds;
		
		for(int i=0;i<cust.length;i++) {
			System.out.println("Enter customer id: ");
			ids=id.nextInt();
			id.nextLine();
			System.out.println("Enter password : ");
			pswds=id.nextLine();
			
			
			Customer ind_cust=new Customer(ids,pswds);
			cust[i]=ind_cust;
		}
		for(int i=0;i<cust.length;i++) {
			System.out.print("id: "+cust[i].getCust_id());
			System.out.println("password: "+cust[i].getPswd());
		}
		
		
		
		
		
		
		
	}
}
