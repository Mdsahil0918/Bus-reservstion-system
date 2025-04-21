package Library;

public class validationException {
	
//	public void checkbusId(String id) {
//		Bus b= new Bus();
//		String s=id;
//		String name=b.getBusname();
//		boolean firstthree =s.substring(0, 0).equalsIgnoreCase(name.substring(0, 3));
//		String s2=name.substring(name.length()-3,name.length());
//		
//	}
		public static boolean busValidName(String busname) {
			if (busname.length()<5) {
				return false;
			}
			return true;
			}
		public static boolean busValidRoute(String route) {
			String s[]= route.split(",");
			if (route.length()<1||route==null|| s[0].trim().equalsIgnoreCase(s[1].trim())) {
				return false;
			}
			return true;
		}
		public static boolean busValidSeatcount(int seatCapacity) {
	
			if(seatCapacity>=10) {
				return false;
			}
			else {
				return true;
			}
		}
		public static boolean passengerMobileValidation(long mobileNo) {
			String s= Long.toString(mobileNo);
			if (s.length()!=10) {
				return false;
			}
			char first =s.charAt(0);
			if((first!='6' && first!='7' && first!='8' )) {
				return false;
			}
			
			return true;
			}
		
		
		public static boolean passengerStatusvalidation(String ticketStatus) {
//			if (ticketStatus.equalsIgnoreCase("Booked")||ticketStatus.equalsIgnoreCase("waitlisted")||ticketStatus.equalsIgnoreCase("cancelled")) {
//				return true ;
//			}
//			return false;
			    return ticketStatus != null && (
			        ticketStatus.equalsIgnoreCase("Booked") ||
			        ticketStatus.equalsIgnoreCase("Waitlisted") ||
			        ticketStatus.equalsIgnoreCase("Cancelled"));
			}
		}
