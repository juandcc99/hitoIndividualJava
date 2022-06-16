/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.prueba.herencia;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 *
 * @author user
 */
public class Colecciones {
    
    public static void main(String[] args) {
        
        /*
        En java disponemos de 3 tipos, conjuntos, listas y mapas
        */
        //Conjuntos
        Set<String> conjunto = new HashSet(); 
        conjunto.add("manzana");
        conjunto.add("pera");
        conjunto.add("fresa");   
        conjunto.add("naranja");
        conjunto.remove("pera");
        
        for(String i : conjunto) {
            System.out.println(i);
        }
        
        //Listas
        List<String> lista;
        lista = new ArrayList<>();
        lista.add("manzana");
        lista.add("pera");
        lista.add("fresa"); 
        
        for(String i: lista) {
            System.out.println(i);
        }
        
        //Mapas
        Map diccionario = new HashMap();
        diccionario.put("ECF 2318", new Vehiculo());
        diccionario.put("ASC 2345", new Vehiculo());
        diccionario.get("ECF 2318");
    }
    
}
