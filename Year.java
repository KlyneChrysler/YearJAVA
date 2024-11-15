import java.util.Scanner;

public class Year {
    public static void main ( String[] args ) {
        Scanner scan = new Scanner(System.in);

        int year;

        System.out.print("ENTER YEAR: ");
        year = scan.nextInt();

        if ( year % 4 == 0 ) {
            System.out.println(year + " IS A LEAP YEAR.");
        } else {
            System.out.println(year + " IS NOT A LEAP YEAR.");
        }
    }
}
