package Obligatorisk;

import java.util.Scanner;

public class O2 {
    

    public static void getGrade(){
        Scanner sc = new Scanner(System.in);
        System.out.println("What is your grade?");
        int grade = sc.nextInt();
        

        if(grade > 100 || grade < 0){
            System.out.println("Invalid Grade");
            sc.close();
            return;
        }

         sc.close();
        if(grade >= 90){
            System.out.println("You got an A");
            return;
        }
        if(grade >= 80){
            System.out.println("You got a B");
            return;
        }
        if(grade >= 60){
            System.out.println("You got a C");
            return;
        }
        if(grade >= 50){
            System.out.println("You got a D");
            return;
        }
        if(grade >= 40){
            System.out.println("You got an E");
            return;
        }
        if(grade < 40){
            System.out.println("You got an F");
            return;
        }


       
    }

    public static void main(String[] args) {
        

        getGrade();
    }
}
