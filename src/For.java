public class For {
    public static void main(String[] args) {
        int[] tab = new int[10];
        for(int i = 0; i < 10; i++) {
            tab[i] = (i+1) * 10;
        }
        /*for(int element : tab) {
            element = 10;
        }*/


        for(int element : tab) {
            System.out.println(element);
        }

        /*for(int i = 0; i < 10; i++) {
            System.out.println(tab[i]);
        }*/
    }
}
