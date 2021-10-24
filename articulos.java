import java.util.Scanner;

public class DescuentoEnArticulos {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double cantidad, descuento, monto, precio, total_a_pagar;
        System.out.print("Ingresa el valor de cantidad: ");
        cantidad = in.nextDouble();
        in.nextLine();
        System.out.print("Ingresa el valor de precio: ");
        precio = in.nextDouble();
        in.nextLine();
        monto=precio*cantidad;
        if(monto>=200)
            descuento=monto*0.15;
        if(monto>100 && monto<200)
            descuento=monto*0.12;
        else
            (monto<100)
            descuento=monto*0.10;
        total_a_pagar=monto-descuento;
        System.out.println("Valor de descuento: " + descuento);
        System.out.println("Valor de monto: " + monto);
        System.out.println("Valor de total a pagar: " + total_a_pagar);
    }

}