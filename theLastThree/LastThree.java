package theLastThree;

/**
 * A1x3: LastThree - see task
 * 
 * @author (your name(s))
 * @version (a version number or a date)
 */
/*
 * ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 * Wir erinnern uns: Niemals verschiedene Sprachen in einem Programm mixen. Oder
 * konkreter: Entweder Variablen und Kommentar in deutsch oder in englisch.
 * 
 * Auch ist diese Art von Kommentar KEIN guter Kommentar. Wir nutzen den
 * Kommentar hier fuer Erklaerungen und Ausfuehrungen zur Aufgabenstellung. Es
 * gilt "hier" die Regel: o) "Kommentar" der Kommentar ist in englisch. o)
 * "Kommentar" der die Aufgabenstellung vertieft in deutsch. Im Rahmen der
 * Aufgabenstellung muessen Sie GUTEN Kommentar schreiben.
 */
public class LastThree {

    // Moegliche Exemplarvariablen bzw. Objekt-spezifische Variablen
    // ... ???
    int counter = 0;
    int oldValue;
    int olderValue;
    int oldestValue;

    /**
     * in the beginning there isn't any number known
     */
    public LastThree() {
        // U.U. muss hier Code ergaenzt werden.
        // ... ???
    }

    /**
     * print the last three numbers
     */
    public void printLastThree() {
        // Ersetzen Sie diesen Kommentar durch Ihren Code.
        // Geben Sie die letzen drei Zahlen aus.
        // ...
        assert counter >= 0 : "Uuuppps, Counter negativ - das darf nicht sein => OVERFLOW";
        if (counter == 0) {
            System.out.print("Keine Werte gespeichert.");
        } else if (counter == 1) {
            System.out.printf("%d", oldValue);
        } else if (counter == 2) {
            System.out.printf("%d \n", olderValue);
            System.out.printf("%d", oldValue);
        } else {
            System.out.printf("%d \n", oldestValue);
            System.out.printf("%d \n", olderValue);
            System.out.printf("%d", oldValue);
        }
    }

    /**
     * process new value
     * 
     * @param value
     *            current value
     */
    public void processNewValue(int value) {
        // Ersetzen Sie diesen Kommentar durch Ihren Code.
        // Geld fuer Coke dem Portemonnaie entnehmenVerarbeite den neuen Wert.
        counter = counter + 1;
        oldestValue = olderValue;
        olderValue = oldValue;
        oldValue = value;
    }

}
