import java.util.Random;

public class Zadanie3 {
    public static void main(String[] args) {
        Random losowacz = new Random();
        int[] tab = new int[100];
        int sum = 0;
        int oddCounter = 0;
        for (int i = 0; i < tab.length; i++) {
            tab[i] = losowacz.nextInt(0, 1001);
            System.out.print(tab[i] + " ");
            if(tab[i] % 2 != 0) {
                sum += tab[i];
                oddCounter++;
            }
        }

        double avr = ((double) sum) / ((double) oddCounter);
        System.out.println();
        System.out.println("srednia: " + avr);
    }
}
