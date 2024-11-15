import java.util.Arrays;

public class Tablice {
    public static void main(String[] args) {
        String s;
        String[] tab = new String[10];

        tab[0] = "Janusz";
        tab[1] = "Zbyszek";
        tab[5] = "Wiesiek";

        System.out.println(tab[0]);
        System.out.println(tab[1]);
        System.out.println(tab[5]);

        int[] tab2 = {1,2,3,4,5};

        System.out.println(tab2[0]);
        System.out.println(tab2[4]);

        int[][] tab3 = new int[5][5];

        tab3[3][3] = 7;

        System.out.println(tab3[3][3]);

        int[][][] tab3d = new int[3][3][3];

        int[][] tab2d = {
                {1,2,3,4},
                {2,3,4,5},
                {3,4,5,6}
        };

        System.out.println(tab2d[0][3]);

        int[] innerTab = tab2d[0];

        System.out.println(innerTab[1]);

        System.out.println(Arrays.toString(tab));
    }
}
