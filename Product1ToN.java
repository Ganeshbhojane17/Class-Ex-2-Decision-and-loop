import java.util.Scanner;

public class Product1ToN {
    public static void main(String[] args){
        long n, product=1;

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter value of n: ");
        n = sc.nextLong();

        for(int i = 1; i<=n ; i++)
        {
            product = product*i;

        }

        System.out.println("Product is : " + product);


    }

}
