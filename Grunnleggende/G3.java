public class G3 {
    

    public static void main(String args[]){


        /*
         * a)
            Skriv et Java program som bruker en for-løkke med en tellevaribel i som starter på 1 og løper opp til og med 20

            b)
            Legg til en switch-setning inne i for-løkken slik programmet skriver ut A hvis i har verdien, 1 og B om i har verdien 2, og C ellers.

            c)
            Modifiser programmet fra b) slik det bruker en valgsetning (if-else if ... else) i stedet for en switch-setning.
         */

        //a
         for(int i = 1; i<=20; i++){
            
        }
        //b
         for(int i = 1; i<=20; i++){
            switch (i) {
                case 1:
                    System.out.println('A');
                    break;
                case 2:
                    System.out.println('B');
                default:
                    System.out.println('C');
                    break;
            }
            
        }

        System.out.println("\nNEW TASK\n");
        //c
        for(int i = 1; i<=20; i++){
           if(i==1)
                    System.out.println('A');
            else if(i==2)
                    System.out.println('B');
            else
                    System.out.println('C');
            
        }

        





    }
}
