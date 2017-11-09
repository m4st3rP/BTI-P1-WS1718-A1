package theLastThree;

public class TestFrame {
    
    public static void main( final String... unused ){
        LastThree lastThree;
        
        System.out.printf( "Start simple tests:\n" );
        System.out.printf( "===================\n" );
        System.out.printf( "\n" );
        //
        lastThree = new LastThree();
        lastThree.processNewValue( 11 );
        lastThree.processNewValue( 12 );
        lastThree.processNewValue( 13 );
        lastThree.processNewValue( 14 );
        System.out.printf( "11 [12  13  14]\n" );
        lastThree.printLastThree();
        System.out.printf( "\n" );
        //
        System.out.printf( "11  12 [13  14  15]\n" );
        lastThree.processNewValue( 15 );
        lastThree.printLastThree();
        System.out.printf( "\n" );
        System.out.printf( "################################################################################\n" );
        System.out.printf( "\n\n\n" );
        
        
        
        System.out.printf( "Start a little bit more serious tests:\n" );
        System.out.printf( "======================================\n" );
        System.out.printf( "\n" );
        //
        lastThree = new LastThree();
        System.out.printf( "\"nix\"\n" );
        lastThree.printLastThree();
        System.out.printf( "\n" );
        //
        lastThree.processNewValue( 21 );
        System.out.printf( "[21]\n" );
        lastThree.printLastThree();
        System.out.printf( "\n" );
        //
        lastThree.processNewValue( 22 );
        System.out.printf( "[21  22]\n" );
        lastThree.printLastThree();
        System.out.printf( "\n" );
        //
        lastThree.processNewValue( 23 );
        System.out.printf( "[21  22  23]\n" );
        lastThree.printLastThree();
        System.out.printf( "\n" );
        //
        lastThree.processNewValue( 24 );
        System.out.printf( "21 [22  23  24]\n" );
        lastThree.printLastThree();
        System.out.printf( "\n" );
        //
        lastThree.processNewValue( 25 );
        System.out.printf( "21  22 [23  24  25]\n" );
        lastThree.printLastThree();
        System.out.printf( "\n" );
        //
        lastThree.processNewValue( 26 );
        System.out.printf( "21  22  23 [24  25  26]\n" );
        lastThree.printLastThree();
        System.out.printf( "\n" );
        //
        lastThree.processNewValue( 27 );
        System.out.printf( "21  22  23  24 [25  26  27]\n" );
        lastThree.printLastThree();
        System.out.printf( "\n" );
        //
        System.out.printf( "THE END" );
     }//method()

}//class
