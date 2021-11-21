package com.company;

import java.util.Scanner;

public class Main {
    private static boolean shouldLoop = true;

    public static void main(String[] args) {
        Menu menu = new Menu();
        BookingPlace bookingPlace = new BookingPlace();
        User user = new User();
        bookingPlace.mapParkingDefault();


        while (shouldLoop) {
            switch (menu.menu()) {
                case 1 -> user.setUser();
                case 2 -> bookingPlace.booking(user.getUser());
                case 3 -> bookingPlace.unbook();
                case 4 -> bookingPlace.cancelOldbooking();
                case 5 -> shouldLoop = false;
                default -> {
                }
            }
        }
    }
}
