/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import entidad.entidad;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class service {
    Scanner leer = new Scanner(System.in);
    entidad cafe = new entidad();

    public void llenarCafetera() {
        cafe.setCapacidadMaxima(100);
    }
    
do { 
    menuPrincipal();
   int op=leer.nextInt();
    leer.nextLine();
     switch (op) {
                case 1:
                    llenarCafetera();
                    break;
                case 2:
                    servirTaza();
                    break;
                case 3:
                    opcion3();
                case 0:
                    System.out.println("Muchas Gracias");
                    break;
                default:
                    System.out.println("Opcion invalida");
                    break;
            }
        } while(op != 0);

    public void servirTaza() {
        int opcion;
        do {
            menu();
            System.out.println("Ingrese un opcion");
            opcion = leer.nextInt();
            leer.nextLine();//limpiar 

            switch (opcion) {
                case 1:
                    opcion1();
                    break;
                case 2:
                    opcion2();
                    break;
                case 3:
                    opcion3();
                case 0:
                    System.out.println("Muchas Gracias");
                    break;
                default:
                    System.out.println("Opcion invalida");
                    break;
            }
        } while (opcion != 0);
    }

    public void opcion1() {
        cafe.cantidadActual -=5; 
    }
    public void opcion2() {
        cafe.cantidadActual -=10; 
    }
    public void opcion3() {
        cafe.cantidadActual -=20; 
    }

    public void menu() {
        System.out.println("Bienvenido al menu");
        System.out.println("opcion 1 = 5cc");
        System.out.println("opcion 2 = 10cc");
        System.out.println("opcion 3 = 20cc");
        System.out.println("opcion 4 = Salir");
    }
public void menuPrincipal() { 
    System.out.println("Elija una opcion");
    System.out.println("opcion 1");
    System.out.println("Llenar la Cafetera");
    System.out.println("opcion 2");
    System.out.println("Servir una taza de Cafe");
    System.out.println("opcion 3");
    System.out.println("Vaciar la cafetera");
    System.out.println("opcion 4");
    System.out.println("Agregar cafe");
}
}
