
public class Chat_room {

	
	
	Partcipant obj[];
	
static String msg=null,message=null,last_seen=null;
static boolean avl=false;

public static String get_last_seen(){         //last_Seen of perticular participant
	return last_seen;
}

public static void send_data(String x){        
	store_data(x);
}

public static void store_data(String x){         
	msg=x;
}

public static void recieve_meessge(String s){         
store_data(s);	
send_data(s);
}




}
