/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calctraduc;

import java.util.Scanner;

/**
 *
 * @author RNS
 */
public class CalcTraduc {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entradaEscaner = new Scanner(System.in);
        String entrada = "";
        int uno, dos;
        float resultado = 0;
        System.out.println("Hola Compañeros");
        System.out.println("Escoja una opción");
        System.out.println("1. Para Sumar");
        System.out.println("2. Para Restar");
        System.out.println("3. Para Multiplicar");
        System.out.println("4. Para dividir");
        entrada = entradaEscaner.nextLine();
        System.out.println("Ingrese primer número:");
        uno = entradaEscaner.nextInt();
        System.out.println("Ingrese segundo número");
        dos = entradaEscaner.nextInt();

        switch (entrada) {
            case "1":
                resultado = uno + dos;
                break;
            case "2":
                resultado = uno - dos;
                break;
            case "3":
                resultado = uno * dos;
                break;
            case "4":
                resultado = uno / dos;
                break;
            default:
                System.out.println("No existe esa entrada");
        }
        System.out.println("Resultado" + resultado);
    }

}
