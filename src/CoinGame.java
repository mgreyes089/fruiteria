import java.util.Random;
import java.util.Scanner;
public class CoinGame {


    private static final int CROSS=1;
    private static final int FACE=2;
    private static int headCounter=0;
    private static int totalThrows=0;


    public static void main(String[] args) {
        while (askIfWantsToThrowCoin()){
            int value = throwCoin();
            calculateResult(value);
            printResult();

        }
    }

    private static void printResult() {
        System.out.println("Resultat: Cares: " + headCounter + "Total tirades " + totalThrows);
    }

    private static void calculateResult(int value) {
        if (value == FACE) {
            System.out.println("face");
            headCounter++;
        }
        if (value == CROSS) {
            System.out.println("cross");
        }
        totalThrows++;


    }

    private static int throwCoin() {
        int coin = new Random().nextInt(1, 3);
        return coin;



    }

    private static boolean askIfWantsToThrowCoin() {
        System.out.println("Vols tirar la moneda? (S/N)");
        Scanner sc = new Scanner(System.in);
        String text=sc.nextLine();
        return text.equalsIgnoreCase("S");
    }



}
