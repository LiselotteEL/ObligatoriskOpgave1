package liselotte;


import java.util.Scanner;

public class Start {

    public static void main(String[] args) {
Scanner input = new Scanner(System.in);
        System.out.println("Indtast navn");
        String navn = input.next(); //beder om input i consol
        System.out.println("Indtast alder");
        int alder = input.nextInt(); //beder om input i consol
        System.out.println("Indtast køn");
        String oversætStringtilEnum = input.next().toUpperCase(); /*beder om input i consol og konverterer input om til udelukkende uppercase bogstaver
        dette er nødvendigt for at Enum.valueOf() kan fungere, da navnet skal være et exact match*/

        Køn køn = Køn.valueOf(oversætStringtilEnum); /*konverter String value om til Enum value
        dette gør at brugeren kan indtaste mand/kvinde i consolen - og compileren vil så lave det om til enum value for at min
        if-sætning i Studerende.java kan blive eksekveret korrekt*/


        Datholdet datholdet =  new Datholdet();
Studerende studerende = datholdet.OpretStuderende(alder, navn, køn); //constructor der opretter studerende og tager imod alder, navn og køn
studerende.udskrivStuderende(); //kalder min metode udskrivStuderende, som udskriver en linje i consolen




    }
}
