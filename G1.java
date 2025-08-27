
public class G1 {
  public static void main(String args[]) {
     /*
a)
Start med å lage et Java program som har deklarasjon av en variabel n of typen heltall (int) i main-metoden.

b)
Legg til en for-løkke som skriver ut tallene fra 1 opptil 10. Kjør programmet å se at det fungerer.

c)
Modifiser for-løkken slik den skriver tallene fra 1 til (men ikke med) verdien av variabelen n. 
Kjør programmet der du en gir n forskjellige verdier og se at programmet gir korrekt utskrift. 
Hva skjer om n settes til en negativ verdi?
     */
     
     // A
    int n=-3;
    
    //B
    for(int x = 1; x<=10; x++){
         System.out.println(x);
        
    }
    
    System.out.println("\nNew Task\n");
    
    // C
    for(int x = 1; x<n; x++){
         System.out.println(x);
        
    }
    // Siden n er mindre enn x så vil den ikke kjøre ettersom at statement vil være false
    
    
    
  

    System.out.println();
  }
}