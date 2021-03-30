package com.ocr.anthony;

import java.util.Scanner;

public class Order {
    /**
     * Display all available menus in the restaurant.
     */
    public void displayAvailableMenu() {
        System.out.println("Choix menu");
        System.out.println("1 - poulet");
        System.out.println("2 - boeuf");
        System.out.println("3 - végétarien");
        System.out.println("Que souhaitez-vous comme menu ?");

    }
    /**
     * Display a selected menu.
     * @param nbMenu The selected menu.
     */
    public void displaySelectedMenu(int nbMenu) {
        switch (nbMenu) {
            case 1 -> System.out.println("Vous avez choisi comme menu : poulet");
            case 2 -> System.out.println("Vous avez choisi comme menu : boeuf");
            case 3 -> System.out.println("Vous avez choisi comme menu : végétarien");
            default -> System.out.println("Vous n'avez pas choisi de menu parmi les choix proposés");
        }
    }
    public void runMenu() {
        this.displayAvailableMenu();
        Scanner sc = new Scanner(System.in);
        int nb = sc.nextInt();
        this.displaySelectedMenu(nb); // ici on passe la variable nb récupéré du scanner  à la methode displaySelectedMenu
    }

    /**
     * Display a selected side depending on all sides enable or not
     * all sides = vegetables, fries and rice
     * not all sides = rice or note
     * @param nbSide the selected side
     * @param allSidesEnable enable display for all sides or not.
     */
    public void displaySelectedSide (int nbSide, boolean allSidesEnable) {
        if (allSidesEnable) {
            switch (nbSide) {
                case 1 -> System.out.println("Vous avez choisi comme accompagnement : légumes frais");
                case 2 -> System.out.println("Vous avez choisi comme accompagnement : frites");
                case 3 -> System.out.println("Vous avez choisi comme accompagnement : riz");
                default -> System.out.println("Vous n'avez pas choisi d'accompagnement parmi les choix proposés");
            }
        } else {
            switch (nbSide) {
                case 1 -> System.out.println("Vous avez choisi comme accompagnement : riz");
                case 2 -> System.out.println("Vous avez choisi comme accompagnement : pas de riz");
                default -> System.out.println("Vous n'avez pas choisi d'accompagnement parmi les choix proposés");
            }
        }
    }
}
