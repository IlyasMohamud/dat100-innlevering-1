package Obligatorisk;

import java.util.Scanner;

public class O1 {

    /*
     * Inntekten mellom 0 – 217 400 kroner	Ingen trinnskatt
Trinn 1	Inntekten mellom 217 401 – 306 050 kroner	1,7 % trinnskatt
Trinn 2	Inntekten mellom 306 051 – 697 150 kroner	4,0 %  trinnskatt
Trinn 3	Inntekten mellom 697 151 – 942 400 kroner	13,7 % trinnskatt  
Trinn 4	Inntekten mellom 942 401 – 1 410 750 kroner 	16,7 % trinnskatt
Trinn 5	Inntekten fra og med 1 410 751 kroner	17,7 %  trinnskatt
     * 
     * 
     */
    public static void taSkatt(){
    Scanner sc = new Scanner(System.in);
    System.out.println("Hva er din inntekt");
    int inntekt = sc.nextInt();
    sc.close();

    int trinn = 0;

    if (inntekt > 1410750) trinn = 5;
    else if (inntekt > 942400) trinn = 4;
    else if (inntekt > 697150) trinn = 3;
    else if (inntekt > 306050) trinn = 2;
    else if (inntekt > 217400) trinn = 1;

    double skatt = 0.0;

    switch (trinn) {
        case 5:
            skatt += (inntekt - 1410750) * 0.177;
            inntekt = 1410750;
        case 4:
            skatt += (inntekt - 942400) * 0.167;
            inntekt = 942400;
        case 3:
            skatt += (inntekt - 697150) * 0.137;
            inntekt = 697150;
        case 2:
            skatt += (inntekt - 306050) * 0.04;
            inntekt = 306050;
        case 1:
            skatt += (inntekt - 217400) * 0.017;
            break;
        default:
            // trinn 0: null skatt
}

System.out.println("Din trinnskatt = " + skatt);
    }

    
    public static void main(String[] args) {

        taSkatt();
    }
     
    
}
