import java.util.Random;
public class DieRoller {
    public static void main(String[] args) {

        Random ran = new Random();
        int max = 5;
        int min = 1;
        int dieOne = ran.nextInt(min + max) + min;
        int dieTwo = ran.nextInt(min + max) + min;
        int dieThree = ran.nextInt(min + max) + min;
        int x;

        String[] headers = {"Roll", "Die 1", "Die 2", "Die 3", "Sum"};
        System.out.printf("%-10s %-10s %-10s %-10s %-10s%n", headers[0], headers[1], headers[2], headers[3], headers[4]);
        System.out.println("------------------------------------------------");

        for (x = 0; ; x++) {
        String[][] data = {
                {String.valueOf(x), String.valueOf(dieOne), String.valueOf(dieTwo), String.valueOf(dieThree),}
        };
        System.out.printf()

    }
    }
}
