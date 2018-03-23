import java.util.*;


public class Research_conference_mangement_system {
	
	public static HashMap<String,String> find= new HashMap<String,String>(); 
	public static HashMap<String,String> search= new HashMap<String,String>(); 
	public static int counter=0,no_of_parti=0;
	static Scanner sc=new Scanner(System.in);
	public static int deadline=10,size=100;
	public static Partcipant obj[] = new Partcipant[100];
	public static void main(String srgs[]){
	//	Partcipant obj[] = null;
		while(true){
		System.out.println("Choose the option");
		System.out.println("1 Sign In");
		System.out.println("2 Sign up");
		System.out.println("3 Buy tickets");
		System.out.println("4 Search research paper");
		int test=sc.nextInt();
		switch(test) {
		case 1:{

			String user_id=get_user_id();
			String password=get_password();	
			if(find_user_id(user_id)){
				if(check_password(user_id,password))
				{	
					System.out.println("You are successfully logged in");
					System.out.println("1 Submit research paper");
					int x=sc.nextInt();
					if(x==1){
					if(check_deadline(5))
					{
						System.out.println("select topic");
						System.out.println("1-nanoscience");
						System.out.println("2-cloud-computing");
						System.out.println("3-quantum-machenics");
						
						int t=sc.nextInt();
						System.out.println("upload research paper");
						String research_paper=sc.next();
						if(check_constraints(research_paper)){
							boolean asc=false;
							System.out.println("your research paper has been sucessfully upload");
							System.out.println("do you want everyone can acess your research paper");
						int s=sc.nextInt();
						if(s==1){
							asc=true;
						}
							
							Research_paper obj1=new Research_paper(obj[counter].get_name(),"20-04-2017",asc,"submmited");	
							
						}
					}
						
					}
					
					
				}
				else
					System.out.println("You entered incrroect password");
					
				
			}
			
			else
				System.out.println("You entered  invalid user_id");
			
			break;
		}
		case 2:{
			System.out.println("Enter first_name");
			String s1=sc.next();
			System.out.println("Enter last_name");
			String s2=sc.next();
			System.out.println("Enter user_id");	
			String s3=sc.next();

			System.out.println("Enter password");
			String s4=sc.next();
			
			System.out.println("Enter confirm_password");
			String s5=sc.next();
			System.out.println("Enter qualification");

	
			String s6=sc.next();
			
			System.out.println("Enter birth_date");
			String s7=sc.next();
			System.out.println("Enter adress");
			String s8=sc.next();
			System.out.println("Enter mobile_number");
			String s9=sc.next();
			System.out.println("Enter area_of_interset");
			String s10=sc.next();


			obj[counter] = new Partcipant(s1,s2,s3,s4,s5,s6,s7,s8,s9,s10);
			if(obj[counter].check()){
				find.put(s3,s4);
				counter++;
				System.out.println("YOu have successfully created your account");
			}
			else{
			System.out.println("Invalid Input");
			}
			
			break;
		}
		case 3:{
			
			System.out.println("Enter the no of tickets");
			int ticket=get_no_of_ticket();
			Acomodation ad=new Acomodation("vijay palace","mumbai",100,10000,'M');
		
			if(ad.get_total_seats() - no_of_parti >= ticket){
				if(payment_process()){
					
					System.out.println("sucessfull");
					check_avl_ticket();  // update user account and admin account
				}
				else
					System.out.println("unsucessful");
					
			}
			else{
				System.out.println("Tickets are not avilable");
				
			}
			break;
		}
		case 4:{
			
			System.out.println("1 Search Research paper by Author");
			System.out.println("2 Search Research paper by Topic");
			int n = sc.nextInt();
			if(n==1){
			System.out.println("Enter Author Name");
			String s = sc.next();
			Search_Research_Paper(s);
			}
			if(n==2)
			System.out.println("Enter Topic Name");
			break;	
		}
	}
}
		
	}
	
	public static void check_avl_ticket(){

		no_of_parti++;
		
	}
	public static boolean payment_process(){
		return true;
	}
	//get_no_of_ticket
	public static int get_no_of_ticket(){
		
		int ticket=sc.nextInt();
		
		return ticket;
	}
	public static String get_user_id(){
		System.out.println("Enter user id");
		String user_id=sc.next();
		return user_id;
	}
	public static String get_password(){
		
		System.out.println("Enter password");
		String password=sc.next();
		return password;
	}
	public static boolean find_user_id(String s){
		if(find.containsKey(s))
			return true;
		else
			 return false;
		
	}
	public static boolean check_password(String s1,String s){
		String x=find.get(s1);
		if(x.equals(s)){
			return true;
			//System.out.println("You are successfully logged in");
			//System.out.println("Submit research paper");
			
		}
		else{
			//System.out.println("You entered incrroect password");
			return false;
		}
	}
	
	public static boolean check_deadline(int x){
		if(x<deadline)
			return true;
		else 
			return false;
	}
	public static boolean check_constraints(String  x){
	if(x.length()<size)
		return true;
	else
		return false;
		
	}
	public static void Search_Research_Paper(String s){
		if(find.containsKey(s)){
			Research_paper obj2 = new Research_paper();
			String s1 = obj2.get_Author();
			System.out.println("Found");
		}
		else{
			System.out.println("Not Found");
		}
	}
	
	
	
}
