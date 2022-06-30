/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.caixeiroviajante;
import com.mycompany.caixeiroviajante.Vertice;
import java.util.Collections;
import java.util.ArrayList;

/**
 *
 * @author ogabrielfelipe
 */
public class Gulosa {
    private Vertice vertice;
    private Boolean status;
    private ArrayList<Vertice> verticesCaminho;
    
    public Gulosa(Vertice vertice) {
        this.vertice = vertice;
        this.status = false;
        this.verticesCaminho = new ArrayList<>();
    }
    
    /*
        Busca Gulosa
        - Identificar os vertices
        - Ordenar os vértices
    */
    
    public void busca(Vertice v){ 
        
        //Crio um ArrayList para receber os adjacentes
        ArrayList<Adjacente> ad;
        ad = v.getAdjacentes();
        
        //Comparo eles para ordernar 
        //De acordo com o método criado na classe Adjacente
        Collections.sort(ad);      
        
        System.out.println("Cidade Atual: " + v.getNome_cidade());
        int i = 0;
        if(v.getDist_obj() != 0){
            for(Adjacente ad_aux: ad){
                if(!ad_aux.getVertice().getVisitado()){
                    System.out.println(" "+i + ". " + ad_aux.getVertice().getNome_cidade() + " - " + ad_aux.getVertice().getDist_obj());
                    i++;
                }            
            }                
        }
        System.out.println("------------");
        
        Adjacente adj_menor_distancia = ad.get(0);        
        
        if (v.getVisitado() == false){
           v.setVisitado(true);
           this.verticesCaminho.add(v);           
        }
        
        if (v.getDist_obj() == 0){
            this.status = true;        
        }else{
            busca(adj_menor_distancia.getVertice());
        }
        
    }
    
}
