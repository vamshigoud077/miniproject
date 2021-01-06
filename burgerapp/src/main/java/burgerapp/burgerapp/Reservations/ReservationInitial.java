package burgerapp.burgerapp.Reservations;


import java.time.LocalDate;
import java.util.ArrayList;

public class ReservationInitial implements ReservationInterface {
	
	ArrayList<Reservations> reservationList = new ArrayList<Reservations>();

	public ReservationInitial() {
		super();
		reservationList.add(new Reservations("JHON",LocalDate.of(2020, 01, 11)));
		reservationList.add(new Reservations("CENA",LocalDate.of(2020, 02, 22)));
		reservationList.add(new Reservations("DWANYE",LocalDate.of(2020, 03, 19)));
		reservationList.add(new Reservations("JOHNSON",LocalDate.of(2020, 01, 20)));
		reservationList.add(new Reservations("STONE",LocalDate.of(2020, 12, 22)));
		reservationList.add(new Reservations("COLDEN",LocalDate.of(2020, 12, 12)));
		reservationList.add(new Reservations("STEVE",LocalDate.of(2020, 12, 07)));
		reservationList.add(new Reservations("AUSTIN",LocalDate.of(2020, 11, 16)));
		reservationList.add(new Reservations("STEPHEN",LocalDate.of(2020, 12, 17)));
		
	}
	
	
	public ArrayList<Reservations> getreservationList() {
		return reservationList;
	}



	public void addingtheReservation(String reservationName, LocalDate reservationDate) {
		Boolean reserveIt = false;
		for(Reservations res: reservationList) {
			
			if(res.getReservationDate().equals(reservationName) && res.getReservationDate().equals(reservationDate)) {
				
				System.out.println("Reservation already exists ");
				break;
			}else {
				reserveIt = true;
			}
		}
		if(reserveIt) {
			this.reservationList.add(new Reservations(reservationName,reservationDate));
			System.out.println("New Reservation added successfuly");
		}
	}
	
	public void editingtheReservation(String reservationName, LocalDate reservationDate) {
		
		for(Reservations res: reservationList) {
			
			if(res.getReservationName().equals(reservationName)) {	
				res.setReservationDate(reservationDate);
				break;
			}	
		}
	}
	
	public void removingtheReservation(String reservationName) {
		
		for(Reservations res: reservationList) {
			
			if(res.getReservationName().equals(reservationName)) {	
				reservationList.remove(res);
				break;
			}	
		}
	}
	
	
	
	

}
