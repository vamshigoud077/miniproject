package burgerapp.burgerapp.Reservations;

import java.time.LocalDate;

public class Reservations {
	private String reservationName;
	private LocalDate reservationDate;
	public Reservations(String reservationName, LocalDate reservationDate) {
		super();
		this.reservationName = reservationName;
		this.reservationDate = reservationDate;
	}
	public String getReservationName() {
		return reservationName;
	}
	public void setReservationName(String reservationName) {
		this.reservationName = reservationName;
	}
	public LocalDate getReservationDate() {
		return reservationDate;
	}
	public void setReservationDate(LocalDate reservationDate) {
		this.reservationDate = reservationDate;
	}
}
