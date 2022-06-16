/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.prueba.herencia;

/**
 *
 * @author user
 */
public class SeleccionFutbol {

    /*Propiedades*/
    protected int id;
    protected String nombre;
    protected String apellidos;
    protected int edad;

    /*Metodos*/
    /*sobreescritura -> Creamos un metodo en la clase padre y lo reescribimos en la clase hija*/

    public void concentrarse() {

    }

    public void viajar() {
	System.out.println("Viajando desde la Seleccion de Futbol");
    }
}
