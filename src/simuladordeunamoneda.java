import java.util.Random;
import java.util.Scanner;

public class simuladordeunamoneda
{
    public static void main(String[] args)
    {


        //Pide al usuario cuántas veces quiere lanzar una moneda.
          //  Usa un bucle for para generar resultados aleatorios (“cara” o “cruz”);
        //Cuenta cuántas veces salió cada uno y muestra el total al final.
        //(Sugerencia: usa Math.random() y condicionales.)


       System.out.println("¿Cuantas veces quieres lanzar la moneda? ");
       Scanner entrada = new Scanner(System.in);
       Random migeneradoraleatorio = new Random();
        int numerolanzamiento= entrada.nextInt();
        int numeroCara=0;
        int numeroCruz=0;
        for (int lanzamientoActual =1; lanzamientoActual<=numerolanzamiento;
             lanzamientoActual++) {
            Boolean siguientevalortirado=migeneradoraleatorio.nextBoolean();
            if(siguientevalortirado){
                System.out.println("la tirada " + lanzamientoActual + " ha sido cara");
                numeroCara++;

            }else{
                System.out.println("la tirada " +  lanzamientoActual + " ha sido cruz");
                numeroCruz++;

            }
        }
        System.out.println("la tirada ha sido" + numeroCara + " cara");
        System.out.println("la tirada ha sido" + numeroCruz + " cruz");



    }
}
