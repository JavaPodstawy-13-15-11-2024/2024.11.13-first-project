public class Algorytm {
    public static void main(String[] args) {
        int x;
        int y;
        int k = 2;

        switch(k) {
            case 1:
                System.out.println("krok 1 !");
            case 2:
                System.out.println("krok 2 !");
            case 3:
                System.out.println("krok 3 !");
            case 4:
                System.out.println("krok 4 !");
            case 5:
                System.out.println("krok 5 !");
        }

        int a = 4;

        switch (a) {
            case 1:
            case 2:
            case 3:
                System.out.println(" to jest od 1 do 3 !!!");
                break;
            case 4:
            case 5:
            case 6:
            case 7:
                System.out.println("to jest od 4 do 7 !!!");
                break;
            case 8:
            case 9:
            case 10:
                System.out.println("to jest wieksze od 8 !!!");
        }
    }
}
