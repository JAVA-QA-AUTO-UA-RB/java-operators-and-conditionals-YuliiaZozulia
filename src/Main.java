

import java.util.Scanner;


public class Main {


    public static void main(String[] args) {


        // Вступне повідомлення
        System.out.println("Ви потрапили у чарівний ліс, де на вас чекає багато пригод!");
        Scanner sc = new Scanner(System.in);


        // Початкові значення
        int health = 100;
        int luck = 50;


        // Подія 1: Роздоріжжя
        System.out.println("Подія 1: Роздоріжжя");
        System.out.println("Виберіть шлях (1 - стара стежка, 2 - шлях до скарбу, інше - йти навмання): ");
        int choice1 = sc.nextInt();
        if (choice1 == 1) {
            health -= 20;
            System.out.println("Ви пройшли старою стежкою і втратили 20 здоров’я.");
        } else if (choice1 == 2) {
            luck += 30;
            System.out.println("Ви знайшли скарб і отримали 30 удачі!");
        } else {
            health -= 10;
            System.out.println("Ви заплуталися і втратили 10 здоров’я.");
        }


        //Подія 2: Колодязь
        System.out.println("Подія 2: Колодязь");
        System.out.println("Що ви зробите? (1 - пити воду, 2 - ігнорувати, інше - нічого): ");
        int choice2 = sc.nextInt();
        if (choice2 == 1) {
            health += 50;
            System.out.println("Ви випили магічну воду і відновили 50 здоров’я.");
        } else if (choice2 == 2) {
            luck -= 10;
            System.out.println("Ви ігнорували колодязь і втратили 10 удачі.");
        } else {
            System.out.println("Нічого не змінилося.");
        }


        //  Подія 3: Чарівна істота
        System.out.println(" Подія 3: Чарівна істота");
        System.out.println("Герой зустрічає чарівну істоту тип якої визначається випадково (випадкове число від 1 до 3)");
        int creatureType = sc.nextInt(3) + 1;
        switch (creatureType) {
            case 1:
                health += 20;
                System.out.println("Істота виявилася дружньою і поділилася їжею. +20 здоров’я.");
                break;
            case 2:
                health -= 30;
                System.out.println("Істота виявилася ворожою і атакувала. -30 здоров’я.");
                break;
            case 3:
                System.out.println("Істота байдужа і просто пішла собі. Нічого не змінилося.");
                break;
        }
        // Перевірка стану гравця
        System.out.println("Результати");
        System.out.println("Здоров’я: " + health);
        System.out.println("Удача: " + luck);
    }
}




                    









