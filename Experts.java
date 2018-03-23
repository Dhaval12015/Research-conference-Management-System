
public class Experts {

	public static String name=null;
	public static String last_name=null;
	public static String id=null;
	public static String area_of_interset=null;
	static boolean y=true;
	private static String password=null,confirm_password=null,qualification=null,birth_date=null,adress=null,mobile_number=null;
	
	public Experts(String f,String l,String u_i,String q,String b,String a,String m,String a_i){
		this.name=f;
		this.last_name=l;
		this.id=u_i;


		this.qualification=q;
		this.birth_date=b;
		this.adress=a;
		this.mobile_number=m;
		this.area_of_interset=a_i;
	}
	
	public static boolean analized_research_paper(Research_paper ob){
		return y;
	}
	
	
	public static String get_name(){
		return name;
	}
	public static String get_id(){
		return id;
	}
	public static String  get_qualification(){
		return qualification;
	}
	public static String get_birth_date(){
		return birth_date;
	}
	//area_of_interset
	public static String get_adress(){
		return adress;
	}
	public static String get_area_of_interset(){
		return area_of_interset;
	}
	public static String get_mobile_number(){
		return mobile_number;
	}
}
