
public class Partcipant {
	
	
	public static String first_name=null;

	public static String last_name=null;

	public static String area_of_interset=null;

	private static String password=null,confirm_password=null,user_id=null,qualification=null,birth_date=null,adress=null,mobile_number=null;
	public Partcipant(){}
	public Partcipant(String f,String l,String u_i,String p1,String p2,String q,String b,String a,String m,String a_i){
		this.first_name=f;
		this.last_name=l;
		this.user_id=u_i;
		this.password=p1;
		this.confirm_password=p2;
	
		this.qualification=q;
		this.birth_date=b;
		this.adress=a;
		this.mobile_number=m;
		this.area_of_interset=a_i;
	}
	
	public boolean check(){
		if(first_name!=null&&last_name!=null&&password!=null&&user_id!=null&&qualification!=null&&
				birth_date!=null&&adress!=null&&mobile_number!=null&&confirm_password!=null&&area_of_interset!=null)
		{
				int flag_upper=0,flag_special=0,flag_lower=0,flag_number=0;
				if(password.length()>=8&&password.length()<=15){
					for(int i=0;i<password.length();i++){
						if(password.charAt(i)>='A'&&password.charAt(i)<='Z')
						{
							flag_upper=1;
						}
						if(password.charAt(i)>='a'&&password.charAt(i)<='z')
						{
							flag_lower=1;
						}
						if(password.charAt(i)>='0'&&password.charAt(i)<='9')
						{
							flag_number=1;
						}
						if(password.charAt(i)=='!'||password.charAt(i)=='@'||password.charAt(i)=='#'||
								password.charAt(i)=='$'||password.charAt(i)=='&')
						{
							flag_special=1;
						}
					
					}
					if(flag_upper==1&&flag_special==1&&flag_lower==1&&flag_number==1){
						if(confirm_password.equals(password))
						return true;
						else
						return false;
					}
					else
						return false;
				}
			
		}
		else return false;
		return false;
		
	}
	public static String get_name(){
		return (first_name+last_name);
	}
	public static String get_id(){
		return user_id;
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
