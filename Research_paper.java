
public class Research_paper {

	static String author=null,submitted_date=null;
	static String status=null;
	static boolean acessblity=false;
	
	public Research_paper(String s1,String s2,boolean x,String y){
	
		this.acessblity=x;
		this.author=s1;
		this.submitted_date=s2;
		this.status=y;
	}
	public Research_paper(){}
	public static String get_Status(){
		return status;
	}
	public static String get_Author(){
		return author;
	}
	public static String get_Submitted_date(){
		return submitted_date;
	}
	public static boolean get_Acessblity(){
		return acessblity;
	}
}
