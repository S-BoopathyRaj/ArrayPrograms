package in;

import java.util.*;

class Seat {
    private int seatNumber;
    private boolean isReserved;

    public Seat(int seatNumber) {
        this.seatNumber = seatNumber;
        this.isReserved = false;
    }

    public int getSeatNumber() {
        return seatNumber;
    }

    public boolean isReserved() {
        return isReserved;
    }

    public void reserve() {
        isReserved = true;
    }

    public void cancelReservation() {
        isReserved = false;
    }
}

class Bus {
    private String busNumber;
    private List<Seat> seats;

    public Bus(String busNumber, int numOfSeats) {
        this.busNumber = busNumber;
        seats = new ArrayList<>();
        for (int i = 0; i < numOfSeats; i++) {
            seats.add(new Seat(i + 1));
        }
    }

    public String getBusNumber() {
        return busNumber;
    }

    public List<Seat> getSeats() {
        return seats;
    }
}

class BusReservationSystem {
    private List<Bus> buses;

    public BusReservationSystem() {
        buses = new ArrayList<>();
    }

    public void addBus(Bus bus) {
        buses.add(bus);
    }

    public void displayAvailableSeats(String busNumber) {
        for (Bus bus : buses) {
            if (bus.getBusNumber().equals(busNumber)) {
                System.out.println("Available seats for bus " + busNumber + ":");
                for (Seat seat : bus.getSeats()) {
                    if (!seat.isReserved()) {
                        System.out.println("Seat " + seat.getSeatNumber());
                    }
                }
                return;
            }
        }
        System.out.println("Bus with number " + busNumber + " not found.");
    }

    public void reserveSeat(String busNumber, int seatNumber) {
        for (Bus bus : buses) {
            if (bus.getBusNumber().equals(busNumber)) {
                List<Seat> seats = bus.getSeats();
                for (Seat seat : seats) {
                    if (seat.getSeatNumber() == seatNumber && !seat.isReserved()) {
                        seat.reserve();
                        System.out.println("Seat " + seatNumber + " reserved successfully.");
                        return;
                    }
                }
                System.out.println("Seat " + seatNumber + " is already reserved or invalid.");
                return;
            }
        }
        System.out.println("Bus with number " + busNumber + " not found.");
    }
}

public class Main {
    public static void main(String[] args) {
        BusReservationSystem reservationSystem = new BusReservationSystem();

        Bus bus1 = new Bus("BUS001", 5);
        Bus bus2 = new Bus("BUS002", 10);

        reservationSystem.addBus(bus1);
        reservationSystem.addBus(bus2);

        reservationSystem.displayAvailableSeats("BUS001");

        reservationSystem.reserveSeat("BUS001", 3);
        reservationSystem.reserveSeat("BUS002", 8);

        reservationSystem.displayAvailableSeats("BUS001");
        reservationSystem.displayAvailableSeats("BUS002");
    }
}
