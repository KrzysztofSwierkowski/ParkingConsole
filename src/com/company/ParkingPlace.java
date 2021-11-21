package com.company;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;


public class ParkingPlace<Place> {


    private final Map<String, Place> parkingMap;
    private int value;

    public ParkingPlace() {
        parkingMap = new HashMap<>();
    }

    public void addPlace(String name, Place number) {
        parkingMap.put(name, number);
    }

    public Map<String, Place> getParkingMap() {
        return parkingMap;
    }

    public void replace(String name, Place number) {
        parkingMap.replace(name, number);
    }

    public String findEmptyParking() {
        Integer value = 0;
        for (Entry<String, Place> entry : parkingMap.entrySet()) {
            if (entry.getValue() == value) {
                System.out.println("The key for value " + value + " is " + entry.getKey());
                return entry.getKey();
            }
        }
        return "0";
    }

    public int findBookingToCancel(Integer value) {
        this.value = value;
        for (Entry<String, Place> entry : parkingMap.entrySet()) {
            if (entry.getValue() == value) {
                System.out.println("The key for value " + value + " is " + entry.getKey());
                return (int) entry.getValue();

            }
        }
        return 0;
    }

}
