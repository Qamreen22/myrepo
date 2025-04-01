package com.tnsif.onlineticketbooking;

public class DemoBooking {

	public static void main(String[] args) {
		TicketBooking book = new TicketBooking();
		for(int i = 0; i<=10; i++) {
			book.booking();
			TicketBooking.display();
		}
	}

}
