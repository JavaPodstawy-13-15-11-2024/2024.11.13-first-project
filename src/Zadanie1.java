public class Zadanie1 {
    public static void main(String[] args) {
        int[] tab = new int[100];
        for(int i = 0; i < tab.length; i++) {
            tab[i] = i + 1;
        }

        for(int element : tab) {
            if(element % 2 == 0) {
                System.out.println(element);
            }
        }
    }
}
