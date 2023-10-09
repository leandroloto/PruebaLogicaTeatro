/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebatrainee;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author Discar
 */
public class Teatro {

    private Cliente[][] asientos = new Cliente[10][10];
    Scanner in = new Scanner(System.in);

    public Teatro() {
    }

    public Cliente[][] getAsientos() {
        return asientos;
    }

    public void setAsientos(Cliente[][] asientos) {
        this.asientos = asientos;
    }

    //Ejecucion principal de la reserva de asientos
    public void reservaAsientos() {
        int opc = 0;

        while (opc != 3) {
            System.out.println("Porfavor elegir una opcion: \n"
                    + "1 - Mostrar asientos disponibles. \n"
                    + "2 - Reservar un asiento. \n"
                    + "3 - Salir.");
            try {
                opc = in.nextInt();
            } catch (Exception ex) {
                System.out.println("Porfavor debe ingresar un numero de las opciones.");
                opc = 3;
            }
            if (opc != 3) {
                switch (opc) {
                    case 1:
                        mostrar();
                        break;

                    case 2:
                        Scanner read = new Scanner(System.in);
                        System.out.println("Ingrese nombre del cliente:");
                        String name = read.nextLine();
                        if (name.isEmpty()) {
                            System.out.println("ERROR: Usted debe ingresar un nombre si o si!!!");
                        } else {
                            System.out.println("¿Desea ver y elegir un asiento disponible? (INGRESE SI, de lo contrario precione cualquier letra)");
                            String x = read.nextLine();
                            if (x.equalsIgnoreCase("si")) {
                                mostrar();
                                System.out.println("Porfavor ingrese primero la FILA. (0 a 9)");
                                int f = read.nextInt();
                                System.out.println("Ahora ingrese la COLUMNA (0 a 9)");
                                int c = read.nextInt();
                                Cliente clien = new Cliente(name);
                                asientos[f][c] = clien;
                                mostrar();
                            } else {
                                System.out.println("Se reservara el asiento aleatoriamente.");
                            }
                        }
                        break;

                }

            }

        }

    }

    public void mostrar() {
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                if (asientos[i][j] == null) {
                    System.out.print("[L](" + i + "-" + j + ") ");
                } else {
                    System.out.print(asientos[i][j] + "(" + i + "-" + j + ") ");
                }
            }
            System.out.println("");
        }
    }

}
