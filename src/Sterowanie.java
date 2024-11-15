public class Sterowanie {
    public static void main(String[] args) {
        for(int i = 0; i < 10; i++) {
            if(i == 5) {
                continue;
            }
            System.out.println(i);
        }

        /*jakasNazwa: for(int i = 0; i < 10; i++) {
            for(int j = 0; j < 10; j++) {
                break jakasNazwa;
            }
        }*/
    }
}
