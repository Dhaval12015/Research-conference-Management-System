
public class Adress {

	
	static String street=null,district=null,city=null,state=null,country=null,continant=null;
	static int pin;
	
	public  Adress (String s1,String s2,String s3,String s4,String s5,String s6,int pin){
		this.street=s1;
		this.district=s2;
		this.city=s3;
		this.state=s4;
		this.continant=s6;
		this.country=s5;
		this.pin=pin;
		
	}
	
	public static String get_street(){
		return street;
	}
	public static String get_district(){
		return district;
	}
	public static String get_city(){
		return city;
	}
	public static String get_state(){
		return state;
	}
	public static String get_continant(){
		return continant;
	}
	public static String get_country(){
		return country;
	}
	public static int  get_pin(){
		return pin;
	}
	
}
