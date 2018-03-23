
public class Acomodation {

	
	static String name=null,adress=null,id=null;
	char gender;
	static int rate,seat;
	static boolean avl=false;
	
	public  Acomodation (String s1,String s2,int x,int rate,char f){
		this.rate=rate;
		this.name=s1;
		this.adress=s2;
		//this.id=a;
		this.seat=x;
		this.gender=f;
	}
	
	public static boolean get_avl(){
		return avl;
	}
	
	public static int get_total_seats(){
		return seat;
	}
	
	
}
