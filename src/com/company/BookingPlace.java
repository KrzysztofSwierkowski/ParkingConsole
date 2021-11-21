package com.company;

import java.time.MonthDay;
import java.util.Objects;

public class BookingPlace {

    ParkingPlace<Integer> parkingPlace = new ParkingPlace<>();
    MonthDay monthDay = MonthDay.now();
    String reserved = "";
    private String name;
    private int day;
    private int nextDay;
    private int cancelDay;
    private int places = 3;
    private String emptyPlace;
    private int emptyPlaceValue;

    public void mapParkingDefault() {
        for (int i = 1; i < places; i++) {
            String Placenumber = Integer.toString(i);
            parkingPlace.addPlace(Placenumber, 0);
        }

        System.out.println("Liczba miejsc parkingowych: " + parkingPlace.getParkingMap().size());

    }

    public void time() {
        this.day = monthDay.getDayOfMonth();
        this.nextDay = day + 1;

    }

    public boolean status() {

        emptyPlace = parkingPlace.findEmptyParking();
        System.out.println(emptyPlace);
        return !Objects.equals(emptyPlace, "0");
    }

    public void booking(String user) {
        time();

        if (reserved.equals("")) {
            if (status()) {
                this.reserved = emptyPlace;
                parkingPlace.replace(emptyPlace, nextDay);
                System.out.println("Zarezerwowano miejsce parkingowe nr.: " + emptyPlace + " Na dzień : " + parkingPlace.getParkingMap().get(emptyPlace) + " dla " + user);
            } else {
                System.out.println("Przepraszamy, wszystkie miejsca zostały zarezerwowane");
            }
        } else
            System.out.println("UWAGA! Zarezerwowano już miejsce parkingowe nr.: " + emptyPlace + " Na dzień : " + parkingPlace.getParkingMap().get(emptyPlace));

    }

    public void unbook() {
        if (!parkingPlace.getParkingMap().get(emptyPlace).equals(0)) {
            System.out.println("Odwołano rezerwację na miejsce parkingowe nr.: " + emptyPlace + " Na dzień : " + parkingPlace.getParkingMap().get(emptyPlace));
            parkingPlace.replace(emptyPlace, 0);
            this.reserved = "";
        } else {
            System.out.println("Brak rezerwacji do usunięcia");
        }

    }

    public void cancelOldbooking() {

        emptyPlaceValue = parkingPlace.getParkingMap().get(emptyPlace);
        parkingPlace.findBookingToCancel(day);
        if (!Objects.equals(emptyPlaceValue, day)) {
            parkingPlace.replace(emptyPlace, 0);
            this.reserved = "";
        }


    }


}
