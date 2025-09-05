package Oblig1;
import static javax.swing.JOptionPane.*;

public class oblig1 {
    public static void main(String[] args) {
        String forNavn = showInputDialog("Skriv inn fornavnet ditt: ");
        // Her Stringen får en innput som fornavn
        String etterNavn = showInputDialog("Skriv inn etternavnet ditt: ");
        // Her Stringen får en innput som etternavn

        String ut = ("Tenk at jeg "+forNavn+" "+etterNavn+" har neila Oblig 1 allerede.");
        // Lager en variable type String som konkatinerer for navn og etternavn til fult navn. 
        showMessageDialog(null, ut);
        // Her skrives ut hele setningn. 

        System.out.println("Tenk at jeg "+forNavn+" "+etterNavn+" har neila Oblig 1 allered.");
        // for morro skyld, skriver ut setningen i en cmd-vindu. 
    }
}
