import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int money = askForMoney();
        String option = showFruitsOptions();
        purchaseFruits(money, option);

    }
    private static int purchaseFruits(int money, String option) {
        if (option.equals("taronja") && money >= 60) {
            System.out.println("Pots comprar-te taronja" + (money-60));
        } else if (money >= 40) {
            System.out.println("Pots comprar platan o dues pomes");
        } else if (money >= 20) {
            System.out.println("Pots comprar-te poma");
        } else {
            System.out.println("No pots comprar res");
        }
        return money;
    }

    private static String showFruitsOptions() {
        System.out.println("Escull una fruita: platan = 40, poma = 20, taronja = 60");
        Scanner sc = new Scanner(System.in);
        return sc.nextLine();
    }

    private static int askForMoney() {

        System.out.println("Escriu quants diners té :");
        Scanner sc = new Scanner(System.in);
        return sc.nextInt();


    }
}


