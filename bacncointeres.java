importar java . util . Escáner ;

public class ClienteDeUnBanco {

    public static void main ( String [ ] args ) {
        Scanner in = new Scanner ( System . in ) ;
        int i , n ;
        doble cantidad_01_enero , cantidad_02_febrero , cantidad_03_marzo , cantidad_04_abril , cantidad_05_mayo;
        doble cantidad_06_junio , cantidad_07_julio , cantidad_08_agosto , cantidad_09_septiembre , cantidad_10_octubre ;
        doble cantidad_11_noviembre , cantidad_12_diciembre , intereses , inversión_final , total ;
        total = 0 ;
        Sistema . fuera . print ( "Ingresa el valor de n:" ) ;
        n = pulg . nextInt ( );
        en . nextLine ( ) ;
        para ( i = 1 ; i <= n ; i ++ ) {
            System . fuera . imprimir ( "PROCESO" + i ) ;
            Sistema . fuera . print ( "Ingresa el valor de la cantidad 01 enero:" ) ;
            cantidad_01_enero = en . nextDouble ( ) ;
            en . nextLine ( ) ;
            Sistema . fuera . print ( "Ingresa el valor de cantidad 02 febrero:" ) ;
            cantidad_02_febrero = en . nextDouble ( ) ;
            en . nextLine ( ) ;
            Sistema . fuera . print ( "Ingresa el valor de cantidad 03 marzo:" ) ;
            cantidad_03_marzo = en . siguienteDoble( ) ;
            en . nextLine ( ) ;
            Sistema . fuera . print ( "Ingresa el valor de la cantidad 04 abril:" ) ;
            cantidad_04_abril = en . nextDouble ( ) ;
            en . nextLine ( ) ;
            Sistema . fuera . print ( "Ingresa el valor de cantidad 05 mayo:" ) ;
            cantidad_05_mayo = en. nextDouble ( ) ;
            en . nextLine ( ) ;
            Sistema . fuera . print ( "Ingresa el valor de cantidad 06 junio:" ) ;
            cantidad_06_junio = en . nextDouble ( ) ;
            en . nextLine ( ) ;
            Sistema . fuera . print ( "Ingresa el valor de cantidad 07 julio:" ) ;
            cantidad_07_julio = en . nextDouble ( ) ;
            en . nextLine ( ) ;
            Sistema . fuera . print ( "Ingresa el valor de cantidad 08 agosto:" ) ;
            cantidad_08_agosto = en . nextDouble ( ) ;
            en . nextLine ( ) ;
            Sistema . fuera . imprimir ("Ingresa el valor de cantidad 09 septiembre:" ) ;
            cantidad_09_septiembre = en . nextDouble ( ) ;
            en . nextLine ( ) ;
            Sistema . fuera . print ( "Ingresa el valor de cantidad 10 octubre:" ) ;
            cantidad_10_octubre = en . nextDouble ( ) ;
            en . nextLine ( ) ;
            Sistema .fuera . print ( "Ingresa el valor de cantidad 11 noviembre:" ) ;
            cantidad_11_noviembre = en . nextDouble ( ) ;
            en . nextLine ( ) ;
            Sistema . fuera . print ( "Ingresa el valor de cantidad 12 diciembre:" ) ;
            cantidad_12_diciembre = in . nextDouble ( ) ;
            en . nextLine ( );
            intereses = total * 0.1 ;
            totales = en total + Intereses + cantidad_01_enero + cantidad_02_febrero + cantidad_03_marzo + cantidad_04_abril + cantidad_05_mayo + cantidad_06_junio + cantidad_07_julio + cantidad_08_agosto + cantidad_09_septiembre + cantidad_10_octubre + cantidad_11_noviembre + cantidad_12_diciembre ;
            inversión_final = total;
            Sistema . fuera . println ( "Valor de intereses:" + intereses ) ;
            Sistema . fuera . println ( "Valor de inversión final:" + inversión_final ) ;
            Sistema . fuera . println ( ) ;
        }
        Sistema . fuera . println ( "Valor de total:" + total ) ;
    }

}