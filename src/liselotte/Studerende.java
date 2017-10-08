package liselotte;

public class Studerende {
//deklarerer mine variabler
    int alder;
    String navn;
    Køn køn;
//opretter min if sætning - hvis bruger er kvinde vil den første println blive kørt ellers vil den næste (for en mand)
    void udskrivStuderende() {
        if (køn == Køn.KVINDE) {
            System.out.println("I klassen går " + navn + ". Hun er " + alder + " år gammel.");
        } else {
            System.out.println("I klassen går " + navn + ". Han er " + alder + " år gammel.");
        }
    }
/*en anden måde som if sætningen kan konstrueres på
    String getStuderendeTekst() {
        if (køn == Køn.KVINDE) {
            return "I klassen går " + navn + ". Hun er " + alder + " år gammel.";
        } else {
            return "I klassen går " + navn + ". Han er " + alder + " år gammel.";
        }
    }*/

    Studerende(int nyAlder, String nyNavn, Køn nyKøn) {

        alder = nyAlder;
        navn = nyNavn;
        køn = nyKøn;

    }
}
    enum Køn {

        MAND, KVINDE
    }
