/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.caixeiroviajante;
import com.mycompany.caixeiroviajante.Grafo;
import com.mycompany.caixeiroviajante.Gulosa;

/**
 *
 * @author ogabrielfelipe
 */
public class CaixeiroViajante {

    public static void main(String[] args) {
        Grafo mapa = new Grafo();
        
        Gulosa gulosa = new Gulosa(mapa.bucharest);
        gulosa.busca(mapa.oredea);     
        

    }
}
