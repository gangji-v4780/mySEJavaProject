import java.util.Scanner;

public class AdminMain {
	public static void main(String[] args) {
		Scanner id=new Scanner(System.in);
		Admin[] ad=new Admin[1];
		int ids;
		String pswds;
		
		
			System.out.println("Enter admin id: ");
			ids=id.nextInt();
			id.nextLine();
			System.out.println("Enter password : ");
			pswds=id.nextLine();
			Admin ind_ad=new Admin(ids,pswds);
			System.out.print("id: "+ind_ad.getAdmin_id());
			System.out.println("password: "+ind_ad.getPswd());
		
	}
}
