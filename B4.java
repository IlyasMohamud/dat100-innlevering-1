import java.lang.Math;
import java.util.Scanner;
public class B4 {

    public static double power(int x, int y){
        double start = 1.0*x;
        for(int i = 1; i < y ; i++){
            start= start *x;
        }
        
        

        
        return start;
        }
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("You can do x to the power of y");
        System.out.println("Choose x");
        int x = sc.nextInt();
        
        System.out.println("Choose y");
        int y = sc.nextInt();

        double Mans =power(x, y);
        
        double ans = Math.pow(x, y);
        System.out.println("My answer " + Mans + " Pow answer " + ans );

        // For en grunn så får funksjonen kunn 8 

        // UPDATE jeg kjører en iterasjon for mye startet i på 0 med uhell. Nå fikset begge får 8  med x = 2 og y = 3 som er riktig

        

        sc.close();

    }
}
