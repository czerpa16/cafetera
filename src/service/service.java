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
        cafe.capacidadMaxima = 100;
        cafe.cantidadActual = cafe.capacidadMaxima;
        System.out.println("Cafetera llena");
        System.out.println("============Gracias===========");
    }

   public void cantidadActual() {
       cafe.cantidadActual = 0;
       System.out.println("Cafetera Vacia");
      System.out.println("==============================");
   }
   
    public void servirTaza() {
        int opcion;
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
    }

    public void opcion1() {
        int taza;
        if (cafe.cantidadActual < 5) {
            taza = cafe.cantidadActual;
            cafe.cantidadActual = 0;
            System.out.println("La maquina se quedó sin cafe, solo se pudo llenar " + taza + "oz");
            System.out.println("============Gracias===========");
        } else {
            taza = 5;
            cafe.cantidadActual -= 5;
            System.out.println("Muchas gracias, ya puede tomar su taza con " + taza + " oz de cafe");
            System.out.println("============Gracias===========");
        }
    }

    public void opcion2() {
        int taza;
        if (cafe.cantidadActual < 10) {
            taza = cafe.cantidadActual;
            cafe.cantidadActual = 0;
            System.out.println("La maquina se quedó sin cafe, solo se pudo llenar " + taza + "oz");
            System.out.println("============Gracias===========");
        } else {
            taza = 10;
            cafe.cantidadActual -= 10;
            System.out.println("Muchas gracias, ya puede tomar su taza con " + taza + " oz de cafe");
            System.out.println("============Gracias===========");
        }
    }

    public void opcion3() {
        int taza;
        if (cafe.cantidadActual < 20) {
            taza = cafe.cantidadActual;
            cafe.cantidadActual = 0;
            System.out.println("La maquina se quedó sin cafe, solo se pudo llenar " + taza + "oz");
            System.out.println("============Gracias===========");
        } else {
            taza = 20;
            cafe.cantidadActual -= 20;
            System.out.println("Muchas gracias, ya puede tomar su taza con " + taza + " oz de cafe");
            System.out.println("============Gracias===========");
        }
    }

    public void menu() {
        System.out.println("Bienvenido al menu");
        System.out.println("opcion 1 = 5oz");
        System.out.println("opcion 2 = 10oz");
        System.out.println("opcion 3 = 20oz");
        System.out.println("opcion 4 = Salir");
    }

    public void menuPrincipal() {
        System.out.println("Elija una opcion");
        System.out.println("opcion 1");
        System.out.println("Llenar la Cafetera");
        System.out.println("===========================");
        System.out.println("opcion 2");
        System.out.println("Servir una taza de Cafe");
        System.out.println("===========================");
        System.out.println("opcion 3");
        System.out.println("Vaciar la cafetera");
        System.out.println("===========================");
        System.out.println("opcion 4");
        System.out.println("Agregar cafe");
        System.out.println("===========================");
        System.out.println("Opcio 0");
        System.out.println("Salir");

    }

    public void agregarCafe() {
        int cantidad;
        System.out.println("Indique la cantida de cafe que desea agregar");
        cantidad = leer.nextInt();
        if (cafe.cantidadActual == 100 ){ 
            System.out.println("La cafetera no necesita ser recargada, le sera devuelto los " + cantidad + " de cafe");
             System.out.println("============Gracias===========");
        }else if (cantidad + cafe.cantidadActual > cafe.capacidadMaxima) {
            int aceptado = 100 - cafe.cantidadActual;//sirve para calcular la cantidad aceptada por la maquina
            int devolucion = cantidad - aceptado;//conocer que valor se va a devolver o se considera exceso.
            cafe.cantidadActual = cafe.capacidadMaxima;
            System.out.println("La cafetera esta llena, solo le faltaba " + aceptado + " por lo tanto le devuelvo  " + devolucion);
            System.out.println("============Gracias===========");
        } else {
            System.out.println("Cafetera recargada exitosamente");
            cafe.cantidadActual += cantidad;
            System.out.println("============Gracias===========");
        }
    }
}
