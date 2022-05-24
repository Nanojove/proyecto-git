//  Trabajo Práctico N°6
//  Mariano Jové

import java.util.Scanner;


public class App {
    public static void main(String[] args) throws Exception {

        Scanner scann = new Scanner(System.in);
        
        /* Ejercicio n°1
        	Escribir un programa que solicite al usuario que ingrese un numero entre 0 y 999,
            y nos muestre un mensaje de cuantos dígitos tiene el número. El programa se finaliza 
            cuando se cargue el nota 0.*/
        
            System.out.println("<< Trabajo Práctico N°6 >>");
            System.out.println("\n[ EJERCICIO 1 ]");

            int num1;

            do {
                System.out.println("\nIngrese un número entre el 1 y 999");
                num1 = scann.nextInt();
                if(num1 <= 9) {
                    System.out.println("El número tiene 1 dígitos");
                }
                else{
                    if(num1 <= 99){
                        System.out.println("El número tiene 2 dígitos");
                    }
                    else
                    if(num1 <= 999){
                        System.out.println("El número tiene 3 dígitos");
                    }
                }    
            }
            while(num1 != 0);
                System.out.println("\nHa ingresado el número 0");
                System.out.println("Fin del ejercicio");
        
        /* Ejercicio n°2
        	Escribir un programa que solicite al usuario ingresar n notas de alumnos 
            y nos informe cuántos tienen notas mayores o iguales a 7 y cuántos menores. 
            El programa termina cuando se ingrese un nota de 0.*/

            System.out.println("\n[ EJERCICIO 2 ]");

            int nota, mayor7 = 0, menor7 = 0;
            do {
                    System.out.println("Ingrese la nota");
                    nota = scann.nextInt();
                
                    if(nota >= 7){
                        mayor7++;
                    }
                    else {
                        menor7++;
                    }
            }
            while(nota != 0);
                    System.out.println("\nLa cantidad de notas mayores o iguales a 7 son: " + mayor7);
                    System.out.println("\nLa cantidad de notas menores a 7 son: " + menor7);
        
            
        /* Ejercicio n°3
            Escribir un programa donde se ingresa un conjunto de n edades de personas por teclado.
            El programa finalizara cuando el promedio de las edades sea superior a 25.*/

        System.out.println("\n[ EJERCICIO 2 ]");

        int edad, contED = 0, suma = 0;
        float prom = 0;
        do{
            System.out.println("Ingrese la edad");
            edad = scann.nextInt();
            contED++;
            suma = suma + edad;
            prom = suma/contED;
        }
        while(prom <= 25);
            System.out.println("El promedio de las edades ingresadas es: " + prom);


        /* Ejercicio n°4 
                Escribir un programa que se imprima por pantalla todos los números del 0 a 100 uno debajo del otro.*/

         System.out.println("\n[ EJERCICIO 2 ]");

         for (int i=0; i<=100; i++){
            System.out.println(i);

         }
        scann.close();

    }
}
