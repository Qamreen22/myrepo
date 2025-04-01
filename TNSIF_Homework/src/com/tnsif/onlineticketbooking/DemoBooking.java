package com.tnsif.onlineticketbooking;

public class DemoBooking {

	public static void main(String[] args) {
		TicketBooking book[] = new TicketBooking[11];
		for(int i = 0; i<=10; i++) {
			book[i] = new TicketBooking();
			book[i].booking();
			TicketBooking.display();
		}
	}

}

/*
for(int i = 0; i<=10; i++) {
		TicketBooking book = new TicketBooking();
		book.booking();
		TicketBooking.display();
}
This creates 10 obj but with same name so we can use array instead to be able to refer to the all the objects later on
*/