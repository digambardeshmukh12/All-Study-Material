package java8_1;

enum drinks {
	SMIRNOFF , VODKA , BACARDI_WHITE , HENNESSY , BUDWEISER , CAPTAIN_MORGAN , JOHNNIE_WALKER , BACARDI_BLACK , JIM_BEAM  ; }

public class enumdemo {

	enum days {
		SUNDAY , MONDAY , WEDNESDAY , TUESDAY , THURSDAY , FRIDAY , SATURDAY ; }
	
	
	public static void main(String[] args) {
	
//		days ob = days.THURSDAY ;
//		System.out.println(ob);
		drinks obj = drinks.BACARDI_WHITE;
//		System.out.println(obj);
		
		switch(obj) {
		
		case SMIRNOFF : System.out.println("Give me SMIRNOFF");
		break ;
		
		case VODKA : System.out.println("Give me VODKA");	
		break ;
		
		case BACARDI_WHITE : System.out.println("Give me BACARDI_WHITE");
		break ;
		
		
		case HENNESSY : System.out.println("Give me HENNESSY");
		break ;
		
		case BUDWEISER : System.out.println("Give me BUDWEISER");
		break ;
		
		case CAPTAIN_MORGAN : System.out.println("Give me CAPTAIN_MORGAN");
		break ;
		
		case JOHNNIE_WALKER : System.out.println("Give me JOHNNIE_WALKER");
		break ;
		
		case BACARDI_BLACK : System.out.println("Give me BACARDI_BLACK");
		break ;
		
		case JIM_BEAM : System.out.println("Give me JIM_BEAM");
		break ;
		
		default :
			System.out.println("Give me WATER");
		
		
		}
		
		
		

	}

}
