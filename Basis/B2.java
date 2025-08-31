package Basis;
import java.util.Scanner;

public class B2 {
    

public static void main(String[] args) {
    //A
    Scanner scanner = new Scanner(System.in);


    System.out.println("Choose an int\n");
	int x = scanner.nextInt();
    System.out.println(x);

    
    //B

    for(int y = 0; y<5; y++){
        System.out.println("Choose an int\n");
        int r = scanner.nextInt();
        System.out.println(r);
    }




    scanner.close();





}


    

}
