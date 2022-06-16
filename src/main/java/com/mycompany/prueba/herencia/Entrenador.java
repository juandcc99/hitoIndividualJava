/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.prueba.herencia;

/**
 *
 * @author user
 */
public class Entrenador extends SeleccionFutbol
{
    /*Propiedades*/
    private String idFederacion;

    public Entrenador() {
	super();
    }
    
    /*Metodos*/

    /*sobreescritura -> Creamos un metodo en la clase padre y lo reescribimos en la clase hija*/
    /*sobrecarga ->mismo metodo diferentes argumentos*/
    
    @Override
    public void viajar(){
        System.out.println("Viajando desde la clase Entrenador");
    }
    public void viajar(String ciudad){
        System.out.println("Viajando desde la clase entrenador a la ciudad " +ciudad);
    }
    
    public void dirigirPartido() {
		
    }

    public void dirigirEntreno() {
		
    }
}
