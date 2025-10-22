
import java.util.Random;
import java.util.Scanner;


public class ejerciciosPuertas {
    public static void main(String[] args) {

//tenemos 3 puertas// elegir aleatoriamente donde esta el premio.
        // cual elije el concursante
        //abrir una de las otras 2
        // y pedirle si quiere cambiar la puerta
        // comprueba en 100 veces cuantas veces ha acertado al cambiar.

        // Simular N partidas (por ejemplo, 100) del juego de las 3 puertas (Monty Hall)

        // para comparar dos estrategias:

        //   A) Mantener la puerta elegida inicialmente.

        //   B) Cambiar a la otra puerta disponible después de que el presentador abra una.

        int vecesrepetir;
        System.out.println("cuantas rondas va a jugar");
        Scanner lector=new Scanner(System.in);
        vecesrepetir=lector.nextInt();
        Random generator =new Random();
        //cont= contador,
        int victorias=0;
        for(int cont=0;cont<vecesrepetir;cont++)
        {

            int puertaPremio = generator.nextInt(1, 4);
            int puertaUsuario = generator.nextInt(1, 4);
            System.out.print(" el usuario ha elejido la puerta " + puertaUsuario);
            int Puertaabierta = 1;
            while (Puertaabierta != puertaPremio || Puertaabierta != puertaUsuario) {
                int puertaacambiar;
                if (Puertaabierta == 1) {
                    if (puertaUsuario == 2) {
                        puertaacambiar = 3;
                    } else {

                    }
                    puertaacambiar = 2;

                } else if (Puertaabierta == 2) {
                    if (puertaUsuario == 1) {
                        puertaacambiar = 3;
                    } else {
                        puertaacambiar = 1;
                    }


                } else {
                    if (puertaUsuario == 1) {
                        puertaacambiar = 2;
                    } else {
                        puertaacambiar = 1;
                    }

                }

            }
        }



    }
}
