/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.prueba.ficheros;

import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author user
 */
public class mostrar {
    public static void main(String[] args) {
        // Fichero del que queremos leer
		File preguntasTxt = new File("C:\\Users\\user\\OneDrive\\Documentos\\NetBeansProjects\\hito\\src\\main\\java\\com\\mycompany\\prueba\\ficheros\\preguntas.txt");
                File respuestasTxt = new File("C:\\Users\\user\\OneDrive\\Documentos\\NetBeansProjects\\hito\\src\\main\\java\\com\\mycompany\\prueba\\ficheros\\respuestas.txt");

		Scanner sc = null;
                Scanner sc2 = null;
                ArrayList<String> preguntas = new ArrayList<>();
                ArrayList<String> respuestas = new ArrayList<>();
                
		try {
			sc = new Scanner(preguntasTxt);
                        sc2 = new Scanner(respuestasTxt);
                        float contador = 0;

			while (sc.hasNextLine()) {
				preguntas.add(sc.nextLine());
			}
                        while (sc2.hasNextLine()) {
				respuestas.add(sc2.nextLine());	
			}
                      
                        
                        System.out.println("Primera pregunta "+preguntas.get(0));
                        Scanner scR1=new Scanner(System.in);
                        String respuesta1=scR1.nextLine();
                        
                        if (respuesta1.equals(respuestas.get(0))){
                            System.out.println("+1");
                            contador=contador+1;
                        }
                        else{
                        System.out.println("-0.5");
                            contador=contador-0.5f;
                        }
                        
                        System.out.println("Segunda pregunta "+preguntas.get(1));
                        Scanner scR2=new Scanner(System.in);
                        String respuesta2=scR2.nextLine();
                        
                        if (respuesta2.equals(respuestas.get(1))){
                            System.out.println("+1");
                            contador=contador+1;
                        }
                        else{
                        System.out.println("-0.5");
                            contador=contador-0.5f;
                        }
                        
                        System.out.println("Tercera pregunta "+preguntas.get(2));
                        Scanner scR3=new Scanner(System.in);
                        String respuesta3=scR3.nextLine();
                        
                        if (respuesta3.equals(respuestas.get(2))){
                            System.out.println("+1");
                            contador=contador+1;
                        }
                        else{
                        System.out.println("-0.5");
                            contador=contador-0.5f;
                        }
                        
                        System.out.println("Cuarta pregunta "+preguntas.get(3));
                        Scanner scR4=new Scanner(System.in);
                        String respuesta4=scR4.nextLine();
                        
                        if (respuesta4.equals(respuestas.get(3))){
                            System.out.println("+1");
                            contador=contador+1;
                        }
                        else{
                        System.out.println("-0.5");
                            contador=contador-0.5f;
                        }
                        
                        System.out.println("Quinta pregunta "+preguntas.get(4));
                        Scanner scR5=new Scanner(System.in);
                        String respuesta5=scR5.nextLine();
                        
                        if (respuesta5.equals(respuestas.get(4))){
                            System.out.println("+1");
                            contador=contador+1;
                        }
                        else{
                        System.out.println("-0.5");
                            contador=contador-0.5f;
                        }
                        
                        System.out.println("Sexta pregunta "+preguntas.get(5));
                        Scanner scR6=new Scanner(System.in);
                        String respuesta6=scR6.nextLine();
                        
                        if (respuesta6.equals(respuestas.get(5))){
                            System.out.println("+1");
                            contador=contador+1;
                        }
                        else{
                        System.out.println("-0.5");
                            contador=contador-0.5f;
                        }
                        
                        System.out.println("Septima pregunta "+preguntas.get(6));
                        Scanner scR7=new Scanner(System.in);
                        String respuesta7=scR7.nextLine();
                        
                        if (respuesta7.equals(respuestas.get(6))){
                            System.out.println("+1");
                            contador=contador+1;
                        }
                        else{
                        System.out.println("-0.5");
                            contador=contador-0.5f;
                        }
                        
                        System.out.println("Octava pregunta "+preguntas.get(7));
                        Scanner scR8=new Scanner(System.in);
                        String respuesta8=scR8.nextLine();
                        
                        if (respuesta8.equals(respuestas.get(7))){
                            System.out.println("+1");
                            contador=contador+1;
                        }
                        else{
                        System.out.println("-0.5");
                            contador=contador-0.5f;
                        }
                        
                        System.out.println("Novena pregunta "+preguntas.get(8));
                        Scanner scR9=new Scanner(System.in);
                        String respuesta9=scR9.nextLine();
                        
                        if (respuesta9.equals(respuestas.get(8))){
                            System.out.println("+1");
                            contador=contador+1;
                        }
                        else{
                        System.out.println("-0.5");
                            contador=contador-0.5f;
                        }
                        
                        System.out.println("Decima pregunta "+preguntas.get(9));
                        Scanner scR0=new Scanner(System.in);
                        String respuesta10=scR0.nextLine();
                        
                        if (respuesta10.equals(respuestas.get(9))){
                            System.out.println("+1");
                            contador=contador+1;
                        }
                        else{
                        System.out.println("-0.5");
                            contador=contador-0.5f;
                        }
                        System.out.println("Contador: " + contador);
                        
                        
		} catch (Exception ex) {
			System.out.println("Error: " + ex.getMessage());
		} finally {
			// Cerramos el fichero tanto si la lectura ha sido correcta o no
			try {
				if (sc != null)
					sc.close();
			} catch (Exception ex2) {
				System.out.println("Error: " + ex2.getMessage());
			}
		}
    }
}
