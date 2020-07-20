import java.util.Scanner;

public class EmpMain{

	public static void main(String[] args) {
		Scanner id=new Scanner(System.in);
		Employee[] emp=new Employee[10];
		int ids;
		String pswds;
		
		for(int i=0;i<emp.length;i++) {
			System.out.println("Enter employee id: ");
			ids=id.nextInt();
			id.nextLine();
			System.out.println("Enter password : ");
			pswds=id.nextLine();
			
			
			Employee ind_emp=new Employee(ids,pswds);
			emp[i]=ind_emp;
		}
		for(int i=0;i<emp.length;i++) {
			System.out.print("id: "+emp[i].getEmployee_id());
			System.out.println("password: "+emp[i].getPswd());
		}
		
		
		
		
		
		
		
	}
}