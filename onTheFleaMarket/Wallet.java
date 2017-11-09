package onTheFleaMarket;


/**
 * A1x2: The Wallet holds cash money - see task
 * 
 * @author   code template was given by Michael Schaefers 
 * @version  17/09/25 v00
 */
/*~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 * Wir erinnern uns: Niemals verschiedene Spachen in einem Programm mixen.
 * Oder konkreter: Entweder Variablen und Kommentar in deutsch oder in englisch.
 * 
 * Auch ist diese Art von Kommentar KEIN guter Kommentar.
 * Wir nutzen den Kommentar hier fuer Erklaerungen und Ausfuehrungen zur
 * Aufgabenstellung. Es  gilt "hier" die Regel:
 *  o) "Kommentar" der Kommentar ist in englisch.
 *  o) "Kommentar" der die Aufgabenstellung vertieft in deutsch.
 * Im Rahmen der Aufgabenstellung muessen Sie GUTEN Kommentar schreiben.
 */
public class Wallet {
    
    /**
     * the cash money
     */
    public int cash;
    
    
    
    /**
     * the wallet holds cash. In the beginning there is no mony in the wallet.
     */
    public Wallet(){
        cash = 0;
    }//constructor()
    
    
    
    /**
     * take 1 Euro out of wallet to pay for ice cream
     */
    public void payForIceCream(){
        assert cash > 0 : "NO MORE MONEY";
        cash = cash - 1;
    }//method()
    
    /**
     * take 1 Euro out of wallet to pay for coke
     */
    public void payForCoke(){
        assert cash > 0 : "NO MORE MONEY";
        cash = cash - 1;
    }//method()
    
    /**
     * put 1Euro into wallet. 1Euro was received for sold item.
     */
    public void receiveMoneyForSoldItem(){
        cash = cash + 1;
    }//method()
    
}//class
