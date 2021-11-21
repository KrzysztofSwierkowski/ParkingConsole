package com.company;

import java.util.Scanner;

public class Menu {
    public int menu() {

        int option;
        Scanner input = new Scanner(System.in);

        System.out.println("Wybierz Opcję");
        System.out.println("*****************************\n");
        System.out.println("1 - Dodaj użytkownika");
        System.out.println("2 - rezerwuj miejsce");
        System.out.println("3 - anuluj rezerwacje");
        System.out.println("4 - Czyszczenie rezerwacji na dzień następny\n");
        System.out.println("*****************************\n");
        option = input.nextInt();
        return option;
    }
}
