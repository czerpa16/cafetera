
import java.util.Scanner;
import service.service;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Usuario
 */
public class nespresso {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner leer = new Scanner (System.in);
       service cafe = new service();
        int op;
        do {
          cafe.menuPrincipal();  
            op = leer.nextInt();
            leer.nextLine();
            switch (op) {
                case 1:
                    cafe.llenarCafetera();
                    break;
                case 2:
                    cafe.servirTaza();
                    break;
                case 3:
                    cafe.cantidadActual();
                    break;
                case 4:
                    cafe.agregarCafe();
                    break;
                case 0:
                    System.out.println("Muchas Gracias");
                    break;
                default:
                    System.out.println("Opcion invalida");
                    System.out.println("==============================");
                    break;
            }
        } while (op != 0);
    }
    }

    

