package burgerapp.burgerapp.Reservations;


import java.time.LocalDate;
import java.util.Scanner;

public class ReservationFunctionality {
	Scanner scan =  new Scanner(System.in);
	ReservationInitial reservationinitial;
	public ReservationFunctionality() {
		this.reservationinitial = new ReservationInitial();
	}
	
	
	public void addingtheReservation() {
		
		System.out.println("Enter the customers name: ");
		String reservationName = scan.nextLine();
		System.out.println("Enter the Date in the particular (yyyy/mm/dd) format : ");
		String reservationDate = scan.nextLine();
		
		if(reservationDate.split("/").length != 3) {
			
			System.out.println(" Please enter all the date fields ");	
		}
		else {
			int year = Integer.parseInt(reservationDate.split("/")[0]);
			int month = Integer.parseInt(reservationDate.split("/")[1]);
			int day = Integer.parseInt(reservationDate.split("/")[2]);
			this.reservationinitial.addingtheReservation(reservationName,LocalDate.of(year, month, day));
		}
			
	}
	
	public void showtheReservations() {
		
		System.out.println("The list of reservations is :  ");
		for(Reservations res: reservationinitial.getreservationList()) {
			
			System.out.println(" *  Name : "+ res.getReservationName() +" , Date : " + res.getReservationDate());
		
		}
			
	}
	
	public void editingtheReservation() {
		
		System.out.println("Enter the customers name: ");
		String reservationName = scan.nextLine();
		System.out.println("Enter the Date in the particular (yyyy/mm/dd) format : ");
		String reservationDate = scan.nextLine();
		
		if(reservationDate.split("/").length != 3) {
			
			System.out.println(" Please enter all the date fields ");
			
		}
		else {
			int year = Integer.parseInt(reservationDate.split("/")[0]);
			int month = Integer.parseInt(reservationDate.split("/")[1]);
			int day = Integer.parseInt(reservationDate.split("/")[2]);
			this.reservationinitial.editingtheReservation(reservationName,LocalDate.of(year, month, day));
			System.out.println("Successfully edited the Reservation ");
		}
		
		
		
	}
	
	public void removingtheReservation() {
		
		System.out.println("Enter the  customers name: ");
		String reservationName = scan.nextLine();
		
		
		this.reservationinitial.removingtheReservation(reservationName);
		System.out.println("succesfully removed the reservation");
		
	}
	
	
	

}



