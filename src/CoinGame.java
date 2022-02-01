import java.util.Random;
import java.util.Scanner;
public class CoinGame {


    private static final int CROSS=1;
    private static final int FACE=2;


    public static void main(String[] args) {
        while (askIfWantsToThrowCoin()){
            int value = throwCoin();
            if (value == FACE) {
                System.out.println("face");
            }
            if (value == CROSS) {
                System.out.println("cross");
            }




        }
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
