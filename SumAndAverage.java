public class SumAndAverage {
    public static void main(String[]args)
    {
        int sum = 0 ;
        float avg = 0;

        for(int i=0; i<=100; i++)
            sum = sum + i;
            avg = sum/100.f;

        System.out.println(" The sum is " + sum);
        System.out.println(" The average is " + avg);


    }
}
