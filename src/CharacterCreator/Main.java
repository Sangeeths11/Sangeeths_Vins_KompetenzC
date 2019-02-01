package CharacterCreator;

import CharacterCreator.Character.Archer;
import CharacterCreator.Character.Character;
import CharacterCreator.Character.Fighter;
import CharacterCreator.Character.Magician;
import CharacterCreator.Weapon.Weapon;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Character> charaList = new ArrayList<>();

        while (true) {
            try {
                System.out.print("1) Charakter erstellen\n2) Charaktere anzeigen\n3) Kämpfen\n4) Reparieren\n5) Exit\n\nAuswahl: ");
                int eingabe = scanner.nextInt();

                switch (eingabe) {
                    case 1:
                        System.out.print("1) Schwertkämpfer\n2) Bogenschütze\n3) Magier\nWelche Klasse möchten Sie spielen?: ");
                        int charclass = scanner.nextInt();

                        scanner.nextLine();

                        System.out.print("\nWie soll dein Held heissen?: ");
                        String name = scanner.nextLine();

                        switch (charclass) {
                            case 1:
                                charaList.add(new Fighter(name));
                                break;
                            case 2:
                                charaList.add(new Archer(name));
                                break;
                            case 3:
                                charaList.add(new Magician(name));
                                break;
                        }

                        break;
                    case 2:
                        int i = 1;
                        for (Character chara : charaList) {
                            if (chara instanceof Fighter) {
                                System.out.println(i + ") " + chara.getName() + ", Schwertkämpfer");
                            }
                            if (chara instanceof Archer) {
                                System.out.println(i + ") " + chara.getName() + ", Bogenschütze");
                            }
                            if (chara instanceof Magician) {
                                System.out.println(i + ") " + chara.getName() + ", Magier");
                            }
                            i++;
                            System.out.println();
                        }
                        break;
                    case 3:
                        int j = 1;
                        for (Character chara : charaList) {
                            System.out.print(j + ") " + chara.getName() + "\n");
                            j++;
                        }
                        System.out.print("Welcher Held soll kämpfen?: ");
                        int hero = scanner.nextInt();
                        hero--;

                        if (!charaList.get(hero).getWeapon().isBroken()) {
                            charaList.get(hero).fight();
                        } else {
                            System.out.println(charaList.get(hero).getName() + "'s Waffe ist kaputt! Reparieren Sie die Waffe.");
                        }
                        break;
                    case 4:
                        int k = 1;
                        for (Character chara : charaList) {
                            System.out.print(k + ") " + chara.getName() + "\n");
                            k++;
                        }
                        System.out.print("Wessen Waffe soll repariert werden?: ");
                        int weapon = scanner.nextInt();
                        weapon--;

                        if (charaList.get(weapon).getWeapon().getCondition() != Weapon.GOODCONDTIION) {
                            charaList.get(weapon).getWeapon().RepairWeapon();
                        }else{
                            System.out.println("Die Waffe befindet sich im guten Zustand!");
                        }

                        break;
                    case 5:
                        System.exit(0);
                        break;
                }
            } catch (Exception e) {
                System.out.println("Eingabe nicht gültig");
            }
        }
    }
}
