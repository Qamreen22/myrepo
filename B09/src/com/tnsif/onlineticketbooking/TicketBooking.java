package com.tnsif.onlineticketbooking;

public class TicketBooking {
	private static int ticket = 10;
	static {
		System.out.println("Welcome to the Online Ticket Booking System. \nThe number of tickets available are: "+ticket);
	}

	void booking() {
		if(ticket == 0)
			System.out.println("All tickets have sold out!!");
		else
			System.out.println("You have booked a ticket!");
	}
	
	static void display() {
		if(ticket!=0) {
			ticket--;
			System.out.println("The number of tickets available are: "+ticket);
		}
	}
	
	@Override
	public String toString() {
		return "TicketBooking []";
	}

}
