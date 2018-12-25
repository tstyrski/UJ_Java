import java.util.Scanner;

public class NsilniaFor {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a factorial number: ");
        int n = input.nextInt();
        int result = 1;

        for ( int k = 1; k <= n ; k++ ){
            result *= k;
            System.out.println(result);
        }
        System.out.println(result);
    }
}
