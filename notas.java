package Condicional;
import java.util.Scanner;
public class condicional1 {
     public static void main(String[] args) {
        double prom, n1, n2, n3;
        Scanner ingreso=new Scanner(System.in);
        System.out.print("Ingrese Nota 1:");
        n1 = Integer.parseInt(ingreso.next());
        System.out.print("Ingrese Nota 2:");
        n2 = Integer.parseInt(ingreso.next());
        System.out.print("Ingrese Nota 3:");
        n3 = Integer.parseInt(ingreso.next());
        prom = (n1 + n2 + n3)/3;
        if(prom >= 10.5){
            System.out.println("APROBADO : " + prom);
        }else{
            System.out.println("DESAPROBADO : " + prom);
        }
     }
}