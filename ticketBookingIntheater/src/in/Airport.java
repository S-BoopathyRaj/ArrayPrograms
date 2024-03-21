package in;

public class Airport {
 private String passengerName;
 private String passengerDestination;
 private int seatNumber;
public Airport(String passengerName, String passengerDestination, int seatNumber) {
	super();
	this.passengerName = passengerName;
	this.passengerDestination = passengerDestination;
	this.seatNumber = seatNumber;
}
public String getPassengerName() {
	return passengerName;
}
public String getPassengerDestination() {
	return passengerDestination;
}
public int getSeatNumber() {
	return seatNumber;
}
@Override
public String toString() {
	return "Airport [passengerName=" + passengerName + ", passengerDestination=" + passengerDestination
			+ ", seatNumber=" + seatNumber + "]";
}

}

