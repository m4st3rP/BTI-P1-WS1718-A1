package onTheFleaMarket;

public class TestFrame {

    public static void main(final String... unused) {
        final Wallet wallet = new Wallet();
        wallet.receiveMoneyForSoldItem();
        wallet.receiveMoneyForSoldItem();
        wallet.receiveMoneyForSoldItem();
        wallet.payForCoke();
        wallet.payForIceCream();
        wallet.payForCoke();
        wallet.receiveMoneyForSoldItem();
        wallet.receiveMoneyForSoldItem();
        wallet.payForCoke();
        wallet.payForIceCream();
        wallet.payForCoke();
        wallet.receiveMoneyForSoldItem();
        wallet.receiveMoneyForSoldItem();
        wallet.receiveMoneyForSoldItem();
        wallet.payForCoke();
        wallet.payForIceCream();
        System.out.println("Warum wird diese Zeile nicht ausgegeben?");
        // Weil man in Zeile 18 schon mehr bezahlen möchte als man eigentlich hat.
    }// method()

}// class
