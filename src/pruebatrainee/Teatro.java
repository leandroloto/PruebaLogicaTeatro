/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebatrainee;

import java.util.Scanner;

/**
 *
 * @author Discar
 */
public class Teatro {
    
    private Cliente[][] asientos= new Cliente[10][10];
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
    public void reservaAsientos(){
        System.out.println("Porfavor elegir una opcion: \n"
                + "1 - Mostrar asientos disponibles. \n"
                + "2 - Ingresar reserva a un asiento. \n"
                + "3 - Salir.");
        int opc = in.nextInt();
        while(opc != 3 && opc<1){
            System.out.println("Porfavor elegir una opcion: \n"
                + "1 - Mostrar asientos disponibles. \n"
                + "2 - Ingresar reserva a un asiento. \n"
                + "3 - Salir.");
            opc = in.nextInt();
        }
        
        
        
        
        
        
        
        
        
        
        
        
        
        //while()
        System.out.println("¿Reservar asiento? (Responder con 'SI' O 'NO')");
        String n = in.nextLine();
        if(n.equalsIgnoreCase("si")){
            System.out.println("Ingrese nombre del cliente:");
            String name=in.nextLine();
            System.out.println("¿Desea ver asientos disponibles? (INGRESE SI O NO)");
            String x = in.nextLine();
            System.out.println("///////////////////////////////////////////");
            if(x.equalsIgnoreCase("si")){
                for (int i = 0; i < 10; i++) {
                    for (int j = 0; j < 10; j++) {
                        if(asientos[i][j] == null){
                            System.out.print("L("+i+"-"+j + ") ");
                        }else{
                            System.out.print(asientos[i][j] + " ");
                        }
                    }
                    System.out.println("");
                }
                
                System.out.println("Porfavor ingrese primero la FILA. (0 a 9)");
                int f= in.nextInt();
                System.out.println("Ahora ingrese la COLUMNA (0 a 9)");
                int c= in.nextInt();
                
                Cliente clien = new Cliente(name);
                asientos[f][c]=clien;
                
                /////////////////////////
                for (int i = 0; i < 10; i++) {
                    for (int j = 0; j < 10; j++) {
                        if(asientos[i][j] == null){
                            System.out.print("L("+i+"-"+j + ") ");
                        }else{
                            System.out.print(asientos[i][j] + "("+i+"-"+j + ") ");
                        }
                    }
                    System.out.println("");
                }
                //////////////////////////
                
            }else if(n.equalsIgnoreCase("no")){
                System.out.println("Se reservara el asiento aleatoriamente.");
                
            }
            
            
        }else if(n.equalsIgnoreCase("no")){
           
            
        }else{
            System.out.println("Porfavor responder con 'Si' o 'No'.");
        }
        
    }
    
    
}
