public class G4 {

  public static void main(String[] args) {
    // Tror de to første settningene vil komme ut men vil fo error etter å prøve å legge til string med int.
    int i;

    System.out.println("Test av repetisjonssetning.");
    System.out.println("***************************");

    i = 1;

    while (i <= 10) {
      System.out.println("Dette er linje nr. " + i);

      if (i == 4) {
        System.out.println();
      }

      if (i == 8) {
        System.out.println();
      }

      i = i + 1;
    }


    // Alt funket normalt og det ble mellomrom da i var like 4 og 8
  }
}