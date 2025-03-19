package za.co.wethinkcode;

import java.awt.*;
import java.time.Year;
public class Autobahn {
    public static void main(String[] args) {
        Autobahn a = new Autobahn();
        a.run();
    }
    public void run() {
        Car mikesCar = new Car( "Toyota", "Corolla", Year.of( 1995 ), Color.RED );
        Car gumdrop = new Car( "Austin", "Clifton Heavy", Year.of( 1926 ), Color.WHITE );
        Car kitt = new Car( "Ford", "Mustang", Year.of( 2008 ), Color.BLACK );



    printCarDetails( gumdrop );
    printCarDetails( kitt );
    printCarDetails( mikesCar );

    mikesCar.setColor( Color.BLUE );
    printCarDetails( gumdrop );
    printCarDetails( kitt );
    printCarDetails( mikesCar );

    gumdrop.setColor( Color.GREEN );
    printCarDetails( gumdrop );
    printCarDetails( kitt );
    printCarDetails( mikesCar );
}

    private static void printCarDetails( Car aCar ){
        System.out.println( "Make:   " + aCar.getManufacturer() );
        System.out.println( "Model:  " + aCar.getModel() );
        System.out.println( "Year:   " + aCar.getYear() );
        System.out.println( "Colour: " + aCar.getColor() );
        System.out.println();
    }
}
