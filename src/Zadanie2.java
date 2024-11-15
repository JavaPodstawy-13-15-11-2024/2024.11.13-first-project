import java.util.Random;

public class Zadanie2 {
    public static void main(String[] args) {
        Random losowacz = new Random();

        int[][] tab = new int[20][20];
        int max = 0;
        for(int row = 0; row < tab.length; row++) {
            for(int col = 0; col < tab[row].length; col++) {
                tab[row][col] = losowacz.nextInt(0, 1001);
                System.out.print(tab[row][col] + "\t");
                if(tab[row][col] > max) {
                    max = tab[row][col];
                }
            }
            System.out.println();
        }

        System.out.println("Najwieksza liczba: " + max);
    }
}
