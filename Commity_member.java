
public class Commity_member {


	static String name=null,joining_date=null,position=null,committee=null;
	static int salary,id;
	
	
	public  Commity_member (String s1,String s2,int id,String com,int salary,String date){
		this.name=s1;
		this.id=id;
		this.position=s2;
		this.joining_date=date;
		this.salary=salary;
		this.committee=com;
		
	}
	
	
	public static String get_name(){
		return name;
	}
	public static int get_id(){
		return id;
	}
	public static int get_salary(){
		return salary;
	}
	public static String get_position(){
		return position;
	}
	
	public static String get_date(){
		return joining_date;
	}
	public static String get_committee(){
		return committee;
	}
	
	
}
