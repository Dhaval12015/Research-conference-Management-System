
public class Sponser {

	static String name=null;
	static String id=null;
	static int sponsership,contacts;
	public  Sponser (String s1,String s2,int p,int x)
	{	
		this.name=s1;
		this.id=s2;
		this.sponsership=p;
		this.contacts=x;
	}
	
	public static String get_name(){
		return name;
	}
	public static String get_id(){
		return id;
	}
	public static int get_sponsership(){
		return sponsership;
	}
	public static int get_contacts(){
		return contacts;
	}
}
