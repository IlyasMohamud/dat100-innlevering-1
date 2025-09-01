package Obligatorisk;

import java.util.Scanner;

public class O3 {
    

    /*
     * Lag et program som leser inn et heltall n > 0, beregner verdien n! (n fakultet) og skriver verdien til n! ut på skjermen, der n! = 1*2*3* … *(n-1)*n.
     */

    public static void factorial(int numb){
        int result = 1;
        if(numb <= 0 ){
            System.out.println("Invalid number");
            return;
        }

        while(numb>0){
            if(numb == 1){
                System.out.println(result);
                return;
            }
            result = result * numb;
            numb -=1;
        }

    }

    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        System.out.println("Choose any int");
        int numb = sc.nextInt();
        sc.close();

        factorial(numb);


    }
}
