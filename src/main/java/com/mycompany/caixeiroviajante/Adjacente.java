/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.caixeiroviajante;
/**
 *
 * @author ogabrielfelipe
 */
public class Adjacente implements Comparable<Adjacente>{
    private Integer distancia;
    private Vertice vertice;

    public Adjacente(){
        
    }

    public Adjacente(Vertice vertice, Integer distancia) {
        this.distancia = distancia;
        this.vertice = vertice;
    }

    public Integer getDistancia() {
        return distancia;
    }

    public void setDistancia(Integer distancia) {
        this.distancia = distancia;
    }

    public Vertice getVertice() {
        return vertice;
    }

    public void setVertice(Vertice vertice) {
        this.vertice = vertice;
    }
    
   //método para comparação das distancias dos vertices
    @Override
    public int compareTo(Adjacente ad){
        if ((this.vertice.getDist_obj() + this.getDistancia()) > (ad.vertice.getDist_obj() + ad.getDistancia())){
            return 1;
        }
        else if ((this.vertice.getDist_obj() + this.getDistancia()) < (ad.vertice.getDist_obj() + ad.getDistancia())){
           return -1;
        }
       return this.vertice.getNome_cidade().compareToIgnoreCase(ad.vertice.getNome_cidade());
    }

    
}
