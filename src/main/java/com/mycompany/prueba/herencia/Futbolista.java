/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.prueba.herencia;

/**
 *
 * @author user
 */
public class Futbolista extends SeleccionFutbol{
    private int dorsal;
    private String demarcacion;

    public Futbolista() {
            super();
    }

    /*Metodos*/
    
    public void viajar(){
        System.out.println("Viajando desde la clase Futbolista");
    }
    
    public void jugarPartido() {
		
    }

    public void entrenar() {
	
    }
}
