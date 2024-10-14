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
        int sum ;

        String[] headers = {"Roll", "Die1", "Die2", "Die3", "Sum"};

        System.out.printf("%-10s %-10s %-10s %-10s %-10s%n", headers[0], headers[1], headers[2], headers[3], headers[4]);
        System.out.println("------------------------------------------------");

        for (x = 0; ; x++){

            dieOne = ran.nextInt(min + max) + min;
            dieTwo = ran.nextInt(min + max) + min;
            dieThree = ran.nextInt(min + max) + min;
            sum = dieOne + dieTwo + dieThree;

            String[][] data = {
                    {String.valueOf(x), String.valueOf(dieOne), String.valueOf(dieTwo), String.valueOf(dieThree), String.valueOf(sum)}
            };
            for (String[] row : data) {

                System.out.printf("%-10s %-10s %-10s %-10s %-10s%n", row[0], row[1], row[2], row[3],row[4]);

            }
        }
    }
}
