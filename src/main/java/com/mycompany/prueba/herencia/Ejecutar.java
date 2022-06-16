/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.prueba.herencia;

/**
 *
 * @author user
 */
public class Ejecutar {
    
    public static void main(String[] args) {
        
       Entrenador entrenador1 = new Entrenador();
       Futbolista futbolista1 = new Futbolista();
       
       
       entrenador1.viajar();
       entrenador1.viajar("Madrid");
       futbolista1.viajar();
        
    }
    
}
