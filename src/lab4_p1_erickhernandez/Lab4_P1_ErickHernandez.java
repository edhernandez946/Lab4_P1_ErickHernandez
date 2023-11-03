package lab4_p1_erickhernandez;

import java.util.Scanner;

public class Lab4_P1_ErickHernandez {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        Scanner sc = new Scanner(System.in);
        int opcion = 0;

        while (opcion != 4) {

            System.out.println("Ingresa una opcion del 1 al 3, 4 termina el programa");
            opcion = leer.nextInt();

            switch (opcion) {

                case 1 -> {

                    System.out.println("Introduce una frase");
                    String cadena = sc.nextLine();

                    while (cadena.length() < 5) {
                        System.out.println("La cadena es muy corta");
                        cadena = sc.nextLine();
                    }

                    String invertida = "";
                    String palabra = " ";

                    for (int i = 0; i <= cadena.length() - 1; i++) {
                        palabra += cadena.charAt(i);

                        if (cadena.charAt(i) == 32 || i == cadena.length() - 1) {

                            for (int j = palabra.length() - 1; j >= 0; j--) {

                                invertida += palabra.charAt(j);

                            }

                            palabra = " ";

                        }
                    }

                    System.out.println("Cadena invertida: " + invertida);

                    break;

                } //Fin del case 1

                case 2 -> {
                    
                    int mayor  = 0;

                    for (int x = 1; x <= 3; x++) {

                        System.out.println("Ingrese la cadena " + x);
                        String cadena = sc.nextLine();
                        int peso = 0;

                        for (int i = 1; i <= cadena.length(); i++) {
                            peso += (int) cadena.charAt(i - 1);

                        }

                        if (peso > mayor) {
                            mayor = x;

                        }

                    }
                    
                    System.out.println("La cadena " + mayor + " es mas pesada");

                    break;

                } // Fin del case 2

                case 3 -> {
                    
                    System.out.println("Ingrese el mensaje que desea cifrar");
                    String cadena = sc.nextLine();
                    String cifrado = "";
                    
                    for (int i = 1; i <= cadena.length(); i++) {
                        
                        int numCifrado = (int)cadena.charAt(i-1) + 2;
                        char letraCifrado = (char)numCifrado;
                        
                        cifrado += letraCifrado;
                        
                    }
                    
                    System.out.println("Mensaje cifrado: " + cifrado);

                    break;

                } // Fin del case 3

                case 4 -> {

                    System.out.println("Fin del programa");
                    break;

                } // Fin del case 4

                default -> {

                    System.out.println("Opcion Invalida!");
                    break;

                } // Fin del default
            }
        }
    }

}
