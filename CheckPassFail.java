import java.util.Scanner;
public class CheckPassFail {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the marks:");
        int marks = scan.nextInt();


        if (marks >= 50) {
            System.out.println("PASS.");
            System.out.println("Done");
        } else {
            System.out.println("FAIL.");
            System.out.println("Done");
        }
        scan.close();
    }
}