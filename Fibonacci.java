public class Fibonacci {
    public static void main(String[] args)
    {
        int n = 20;
        int i = 1, firstTerm = 1, secondTerm = 2;
        float sum = 0;
         sum += 1;
         int nextTerm;
        System.out.println("Fibonacci Series till " + n + " terms:");

//         Using for loop
        for (i = 1; i < n; i++) {
            System.out.print(firstTerm + ", ");

            // Using While loop
//            while (i < n) {
//                System.out.print(firstTerm + ", ");
//            i++;

            // compute the next term
            nextTerm = firstTerm + secondTerm;
            firstTerm = secondTerm;
            secondTerm = nextTerm;
            sum += nextTerm;
        }
//            sum += nextTerm;
            System.out.println(" Average = " + sum/n);







    }
}
