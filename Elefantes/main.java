package Elefantes;

import java.util.Scanner;

public class main {

    public static void main (String args[]){

        int aleatorio = (int) (Math.random() * 3000) + 1; //DEJAREMOS UN MAXIMO DE 100
        Scanner key = new Scanner(System.in);
        
        int elefante = 1;

        try{
            
            int entrada;

            do {
            
                System.out.println ("¿Cuantos elefantes crees que aguantará la telaraña?(1/3000)");
                entrada = key.nextInt();

                if (entrada < 1 || entrada > 3000) { 
                    
                    if (entrada > 3000 ){

                        System.out.println("No se que clase de araña puede hacer un tejido así de resistente");
                    }

                    System.out.println("Introduzca un numero válido"); 
                    
                } // SI NO ELEGIMOS UNA LONGITUD VALIDA

            } while (entrada < 1 || entrada > 3000);

            for(int i = 1 ; i < aleatorio ; i++){  //BUCLE PARA CONTAR ELEFANTES

                System.out.print("\n");
                System.out.print("\n "+ i + " Elefantes se balanceaban sobre la tela de una araña");
                System.out.print("\n Como veían que no se caían fueronm a llamar a otro elefante");
                System.out.print("\n");
                elefante++; //SUMAMOS UN ELEFANTE

            }
                
                System.out.print("\n Has dicho que la telaraña podría aguantar " + entrada +" elefantes\n");

                if (entrada == elefante){ System.out.println("\n Ganas la apuesta, " + elefante + " elefantes pudo aguantar la telaraña"); }
                
                if (entrada < elefante) { System.out.println("\n Te quedaste corto, " + elefante + " elefantes pudo aguantar la telaraña");}

                if (entrada > elefante) { System.out.println("\n Te pasaste de la raya, " + elefante + " elefantes pudo aguantar la telaraña");}

                key.close();//CERRAMOS SCANNER

        }catch(Exception e){


            System.out.println("Error inesperado: " + e);

            
        }

    }

}