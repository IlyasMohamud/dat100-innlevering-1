package Extra;
import java.util.Scanner;

public class V2 {
    

    public static void volumeCalc(double r, double h){
        double volume;
        if(r <= 0 || h <=0 ){
            System.out.println("invalid height/radius");
            return;
        }

        double r2 = r*r;

        volume = Math.PI *r2 * h;

        System.out.println("Volume is " + volume);
        return;

        


    }




    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("What is the radius");
        double radius = sc.nextDouble();
        System.out.println("What is the height");
        double height = sc.nextDouble();
        sc.close();
        volumeCalc(radius, height);

        
        

    }
}
