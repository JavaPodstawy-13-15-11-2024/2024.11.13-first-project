public class Zadanie4 {
    public static void main(String[] args) {
        for(int i = 1; i <= 100; i++) {
            System.out.print(i);
            if(i % 3 == 0) {
                System.out.print(" Fizz");
            }
            if(i % 5 == 0) {
                System.out.print(" Buzz");
            }
            System.out.println();
        }

        /*for(int i = 1; i <= 100; i++) {
            if(i % 3 == 0 && i % 5 == 0) {
                System.out.println(i + " Fizz Buzz");
            } else if(i % 3 == 0) {
                System.out.println(i +" Fizz");
            } else if(i % 5 == 0) {
                System.out.println(i + " Buzz");
            } else {
                System.out.println(i);
            }
        }*/
    }
}
