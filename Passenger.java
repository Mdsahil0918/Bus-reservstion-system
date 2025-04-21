package Library;

public class Passenger {
	private String pasengerId;
	private long MoblieNo;
	private String name;
	private String ticketStatus;
	private String busId;
	 private Passenger() {
		 
	 }
	public Passenger( String name,long moblieNo, String ticketStatus) {
		this.name = name;
		this.pasengerId = getvalidPid(name);
		boolean validcell= validationException.passengerMobileValidation(moblieNo);
		if(validcell)
		{
			this.MoblieNo = moblieNo;
		}
		else {
			System.out.println("Enter a valid cell number .");
		}
		boolean validstatus=validationException.passengerStatusvalidation(ticketStatus);
		if(validstatus) {
			this.ticketStatus = ticketStatus;
		}
		else {
			System.out.println("invalid status .");
		}
	}
	public String getBusId() {
		return busId;
	}
	public void setBusId(String busId) {
	    this.busId = busId;
	}
	public String getPasengerId() {
		return pasengerId;
	}
	public void setPasengerId(String pasengerId) {
		this.pasengerId = pasengerId;
	}
	public long getMoblieNo() {
		return MoblieNo;
	}
	public void setMoblieNo(long moblieNo) {
		MoblieNo = moblieNo;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getTicketStatus() {
		return ticketStatus;
	}
	public void setTicketStatus(String ticketStatus) {
		this.ticketStatus = ticketStatus;
	}
	public void display() {
		System.out.println("Passenger id :"+getPasengerId());
		System.out.println("Passenger name :"+getName());
		System.out.println("CELL :"+getMoblieNo());
		System.out.println("Ticket Status :"+ticketStatus);
		System.out.println("------------------------------------------");
	}
	private String getvalidPid(String name) {
		String pasengerId= name.substring(0,3);
		int n=name.length();
		String s= name.substring(n-4);
		for (char c:s.toCharArray()) {
			int i=(int) c;
			String ac= Integer.toString(i);
			if (ac.length()>1) {
				pasengerId+=ac.charAt(1);
			}
			else {
				pasengerId+=ac.charAt(0);
			}
		}
		return pasengerId;
		}
	
	 

	
	
}
