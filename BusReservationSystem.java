package Library;

import java.util.ArrayList;
import java.util.Scanner;

public class BusReservationSystem {
	public static void main(String[] args) {
		
		ArrayList<Bus> buses= new ArrayList<Bus>();
		ArrayList<Passenger> pass= new ArrayList<Passenger>();
		boolean ok=true;
		Scanner sc= new Scanner(System.in);
		while (ok) {
		System.out.println("1.Add Bus \n2.Book Ticket \n3.Cancle Ticket \n4.Check Ticket Status \n5.Exit");
		int ch= sc.nextInt();
		switch(ch) 
		{
		case 1: 
			System.out.println("enter the bus name :");
			String name=sc.next();
			System.out.println("Enter the Seat capacity of the Bus :");
			int seat= sc.nextInt();
			System.out.println("Avaliabel seats :");
			int av = sc.nextInt();
			System.out.println("enter the route :");
			String route= sc.next();
			buses.add(new Bus(name,seat,av,route));
		break;
		case 2:
			if (buses.isEmpty()) {
				System.out.println("No busses available.");
				break;
			}
			System.out.println("Available busess");
			   for (int i = 0; i < buses.size(); i++) {
			        System.out.println((i + 1) + ". " + buses.get(i).getBusname() + " | Route: " + buses.get(i).getRoute());
			    }
			   System.out.println("Choose a bus from the above list");
			   int cho=sc.nextInt()-1;
			   if(cho<0 || cho>buses.size()-1) {
				   System.out.println("Invalid bus ..");
			   }
			   Bus choosenbus= buses.get(cho);
			   String status=null;
			    if(choosenbus.getAvailableSeats()>0) {
			    	choosenbus.bookseat();
			    	status="Booked";
			    	
			    }
			    else  {
			    	status="waitlist";
			    }
			    System.out.println("Enter your name : ");
		    	String pname= sc.next();
		    	System.out.println("Enter your mobile numeber : ");
		    	long cell= sc.nextLong();
		    	Passenger p1= new Passenger(pname,cell,status);
		    	p1.setBusId(choosenbus.getBusId());
			    pass.add(p1);
			    System.out.println("Ticket Booked..");
			    break;
			
		case 3:
			System.out.println("enter yout mobile  number :");
			long cellno= sc.nextLong();
			for (Passenger p:pass) {
				if(p.getMoblieNo()==cellno) {
					if(p.getTicketStatus().equalsIgnoreCase("Booked")) {
						p.setTicketStatus("Cancelled");
						
						for (Bus b:buses) {
							if(b.getBusId().equals(p.getBusId())) {
								b.cancleSeat();
								break;
							}
						}
						System.out.println("Your ticket has been Cancelled");
						}
						
					else if(p.getTicketStatus().equalsIgnoreCase("Cancelled")){
						System.out.println("Your ticket is already "+p.getTicketStatus());
					}else {
                        p.setTicketStatus("Cancelled");
                        System.out.println("Waitlisted ticket cancelled.");
                        }
					}
				}
				
				break;
		case 4:
			System.out.println("Enter your mobile number to check ticket status:");
            long number = sc.nextLong();
            boolean found = false;

            for (Passenger p : pass) {
                if (p.getMoblieNo() == number) {
                    p.display();
                    found = true;
                    break;
                }
            }

            if (!found) {
                System.out.println("No ticket found with this number.");
            }
            break;
			
		case 5:
			System.out.println("Exiting.");
			ok=false;
			break;
			
		default:
			System.out.println("Invalid choice !..");
			
		}
		}
	}
}
