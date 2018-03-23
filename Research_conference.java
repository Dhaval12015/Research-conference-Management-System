
public class Research_conference {
	static String Research_conference_name=null;
	static String venue=null;
	static String date=null;

	public Research_conference(String s1,String s2,String s3){
		this.Research_conference_name=s1;
		this.venue=s2;
		this.date=s3;
	}
	
	public static String get_conference_name(){
		return Research_conference_name;
	}
	
	public static String get_venue(){
		return venue;
	}
	
	public static String get_date(){
		return date;
	}
	
	
}
