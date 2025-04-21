package Library;

public class Bus {
	private String busId;
	private String busname;
	private int seatCapacity;
	private String route;
	private int availableSeats;
	public Bus (String busname, int seatCapacity, int availableSeats, String route) {
		boolean isvalidname=validationException.busValidName(busname);
		if(isvalidname)
		{
		this.busname = busname;
		}
		else {
			System.out.println("Enter a valid bus name min chars 5");
		}
		
		this.busId =getvalidid(busname) ;
		boolean routev=validationException.busValidRoute(route);
		if(routev) {
		this.route = route;
		}
		else {
			System.out.println("Enter a valid route seperated by coma -> ,");
		}
		boolean seatcount= validationException.busValidSeatcount(seatCapacity);
		if(seatcount) {	this.seatCapacity = seatCapacity;}
		
		this.availableSeats = availableSeats;
	}
	
public Bus() {
		// TODO Auto-generated constructor stub
	}

public void bookseat() {
	availableSeats--;
	}
	public void cancleSeat() {
		availableSeats++;
	}
	public void busdetails() {
		System.out.println("Bus Id :"+busId);
		System.out.println("Bus Name :"+getBusname());
		System.out.println("Seat Capacity :"+getSeatCapacity());
		System.out.println("Available Seats :"+getAvailableSeats());
		System.out.println("Route :"+getRoute());
	}
	public String getBusId() {
		return busId;
	}
	public void setBusId(String busId) {
		this.busId = busId;
	}
	public String getBusname() {
		return busname;
	}
	public void setBusname(String busname) {
		this.busname = busname;
	}
	public int getSeatCapacity() {
		return seatCapacity;
	}
	public void setSeatCapacity(int seatCapacity) {
		this.seatCapacity = seatCapacity;
	}
	public String getRoute() {
		return route;
	}
	public void setRoute(String route) {
		this.route = route;
	}
	public int getAvailableSeats() {
		return availableSeats;
	}
	public void setAvailableSeats(int availableSeats) {
		this.availableSeats = availableSeats;
	}
	private String getvalidid(String busname) {
		String busId= busname.substring(0,3);
		int n=busname.length();
		String s= busname.substring(n-3);
		for (char c:s.toCharArray()) {
			int i=(int) c;
			String ac= Integer.toString(i);
			if (ac.length()>1) {
				busId+=ac.charAt(1);
			}
			else {
				busId+=ac.charAt(0);
			}
		}
		return busId;
		}
	
}
