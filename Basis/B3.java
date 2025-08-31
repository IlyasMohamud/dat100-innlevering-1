package Basis;
public class B3 {

	public static void main(String[] args) {
        // Først del blir ikke printet i er ikke mindre enn 1
		System.out.println("Del 1");
		int i = 1;
		while (i < 1) {
			System.out.println("Nr 1, i = " + i);
		}
        // 1. J=1,  2. J=2,   3. J=4,   4. j=8, Stopp etter 4 iterasjoner
		System.out.println("Del 2");
		for (int j = 1; j < 8; j = j * 2) {
			System.out.println("Nr 2, j = " + j);
		}
        // 1. k=t, 2. k=s 3. k=e siste blir ikke printet siden  k = 0
		System.out.println("Del 3");
		String s = "Test";
		for (int k = s.length() - 1; k > 0; k = k - 1) {
			System.out.println("Nr 3, k = " + s.charAt(k));
		}
        // tall = 7569      hjelp = 7569     aS =0
        /*
         * Den vil kjøre minst en gang så 
         * 1. hjelp = 756 as = 1
         * 2. hjelp = 75  as = 2
         * 3. hjelp = 7   as = 3
         * 4  hjelp = 0   as = 4
         * tall er fortsatt 7569 kun verdien ble satt inn i hjelp
         */
		System.out.println("Del 4");
		int tall = 7569;
		int hjelp = tall;
		int aS = 0;
		do {
			hjelp = hjelp / 10;
			aS = aS + 1;
		} while (hjelp > 0);

		System.out.println(tall + " 7569 " + aS + " 4");

        //alt ble riktig
	}
}
