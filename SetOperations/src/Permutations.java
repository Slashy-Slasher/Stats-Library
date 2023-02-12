package src;

public class Permutations
{
    public static void main(String args[])
    {
        double n = 52;
        double r = 5;

        System.out.println("The combination of N: "+n + " and R: "+r +" is "+combination(r, n));
        System.out.println("The permutation of N: "+n + " and R: "+r +" is "+permutation(r, n));
    }
    public static double combination(double r, double n) {
        return(factorial(n)/(factorial(r)*factorial(n-r)));
    }
    public static double permutation(double r, double n) {
        return (factorial(n) / factorial(n - r));
    }
    public static double factorial(double x) {
        double y = 1;
        for(int i = 0; i < x-1; i++)
            y *= (x-i);
        return y;
    }

}
