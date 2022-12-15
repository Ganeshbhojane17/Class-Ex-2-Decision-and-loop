public class HarmonicSum {
    public static void main(String[] args)
    {
        int n = 50000;
        double sumLtoR = 0, sumRtoL = 0;
        int i;

        for( i=1; i<=n; i++) {

            sumLtoR = sumLtoR + (double) (1) / i;
            sumRtoL = sumRtoL + (double) (1) / (n - i + 1);
        }
        System.out.println(" Sum from left to right is: " + sumLtoR);
        System.out.println(" Sum from right to left is: " + sumRtoL);

        System.out.println(" Difference betn LtoR and RtoL is: " + (sumRtoL - sumLtoR));

        System.out.println(" LtoR method is more accurate");




    }
}
//public class HarmonicSum {
//    public static void main(String[] args){
//        int n = 50000;
//        double suml2r=0, sumr2l=0;
//        for(int i=1; i<=n; i++){
//            suml2r += (double)(1)/i;
//            sumr2l += (double)(1)/(n-i+1);
//        }
//
//        System.out.println("left to right = " + suml2r);
//        System.out.println("right to left = " + sumr2l);
//    }
//}