package fes.aragon.ico;

import java.util.Scanner;

public class MarcadorTennis {

    public static void main(String[] arg) {
        String JugadorA = "Local";
        String JugadorB = "Retador";
        int PuntoPara = 0;
        int PuntuacionA = 0, PuntosA = 0;
        int PuntuacionB = 0, PuntosB = 0;
        String Puntuaciones[] = {"0", "15", "30", "40", "A"};
        boolean FinSet = false;

        Scanner teclado = new Scanner(System.in);

        do {
            System.out.println(JugadorA + "(presiona 1) " + "\t" + JugadorB + "(presiona 2)\n\nPunto para el jugador: ");
            PuntoPara = teclado.nextInt();

            if (PuntoPara == 1) {
                PuntosA++;
            } else if (PuntoPara == 2) {
                PuntosB++;
            } else {
                System.out.println("\nIvalido. Solo escribe 1 ó 2.");
            }

            if ((PuntosA >= 3 && PuntosB < 3) || (PuntosB <= 3 && PuntosA < 3)) {
                PuntuacionA = PuntosA;
                PuntuacionB = PuntosB;
                if ((PuntosA > 3 && PuntosB < (PuntosA - 1)) || (PuntosB > 3 && PuntosA < (PuntosB - 1))) {
                    FinSet = true;
                    PuntuacionA = PuntosA;
                    PuntuacionB = PuntosB;
                }
            } else if (PuntosA == PuntosB && PuntosA >= 3) {
                System.out.println("**************************************************DEUCE***************************************************");
                PuntuacionA = 3;
                PuntuacionB = 3;
            } else if (PuntosA > (PuntosB + 1) || PuntosB > (PuntosA + 1)) {
                FinSet = true;
            } else if (PuntosA > PuntosB) {
                PuntuacionA = 4;
                PuntuacionB = 3;
            } else if (PuntosB > PuntosA) {
                PuntuacionA = 3;
                PuntuacionB = 4;
            }

            System.out.println("***********************************************\n" + JugadorA + ": " + Puntuaciones[PuntuacionA] + " | " + JugadorB + ": " + Puntuaciones[PuntuacionB] + "\n");

        } while (FinSet == false);

        if (PuntosA > PuntosB) {
            System.out.println("¡Gano el set " + JugadorA + "!");
        } else {
            System.out.println("¡Gano el set " + JugadorB + "!");
        }
          
        System.out.println("¿Otra reta? \nSi=1 \nNo=2");
       int r=teclado.nextInt();
        
        if(r==1){
            MarcadorTennis.main(arg);
        }else if(r==2){
            System.out.println("Fin del juego");
            
        }
        
    }
}
