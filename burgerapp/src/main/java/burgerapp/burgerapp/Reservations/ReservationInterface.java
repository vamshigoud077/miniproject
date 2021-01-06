package burgerapp.burgerapp.Reservations;

import java.time.LocalDate;

public interface ReservationInterface {
	public void removingtheReservation(String reservationName);
	public void editingtheReservation(String reservatioName, LocalDate reservationDate);
	public void addingtheReservation(String reservationName, LocalDate reservationDate);

}
