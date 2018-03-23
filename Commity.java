
public class Commity {

	

	static String name=null,id=null;
	static int total_member;
	
	public  Commity (String s1,String s2,int x){
		this.name=s1;
		this.id=s2;
		this.total_member=x;
	}
	
	public static String get_name(){
		return name;
	}
	public static String get_id(){
		return id;
	}
	public static int get_total_member(){
		return total_member;
	}
	
}
