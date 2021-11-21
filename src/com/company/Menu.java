package com.company;

import java.util.Scanner;

public class Menu {
    public int menu() {

        int option;
        Scanner input = new Scanner(System.in);

        System.out.println("Wybierz Opcję");
        System.out.println("*****************************\n");
        System.out.println("1 - Dodaj użytkownika");
        System.out.println("2 - Rezerwuj miejsce");
        System.out.println("3 - Anuluj rezerwacje");
        System.out.println("4 - Czyszczenie rezerwacji na dzień następny");
        System.out.println("5 - Zakończ\n");
        System.out.println("*****************************\n");
        option = input.nextInt();
        return option;
    }
}
