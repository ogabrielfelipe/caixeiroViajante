/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.caixeiroviajante;
import java.util.ArrayList; 
/**
 *
 * @author ogabrielfelipe
 */
public class Vertice{
    private String nome_cidade;
    private Integer dist_obj;
    private Boolean visitado;
    private ArrayList<Adjacente> adjacentes;

    public Vertice(){

    }
    public Vertice(String nome_cidade, Integer dist_obj) {
        this.nome_cidade = nome_cidade;
        this.dist_obj = dist_obj;
        this.visitado = false;
        this.adjacentes = new ArrayList<>();
    }

    public void adicionaAdjacente(Adjacente ad){
        this.adjacentes.add(ad);
    }
    
    public String getNome_cidade() {
        return nome_cidade;
    }

    public void setNome_cidade(String nome_cidade) {
        this.nome_cidade = nome_cidade;
    }

    public Integer getDist_obj() {
        return dist_obj;
    }

    public void setDist_obj(Integer dist_obj) {
        this.dist_obj = dist_obj;
    }

    public Boolean getVisitado() {
        return visitado;
    }

    public void setVisitado(Boolean visitado) {
        this.visitado = visitado;
    }

    public ArrayList<Adjacente> getAdjacentes() {
        return adjacentes;
    }

    public void setAdjacentes(ArrayList<Adjacente> adjacentes) {
        this.adjacentes = adjacentes;
    }
    
    
    public void ExibeAdjacentes(){
        
        for (Adjacente ad : this.adjacentes){
            System.out.println(ad.getVertice().getNome_cidade() + " - " + 
                    ad.getVertice().getDist_obj());
        }
    }

    @Override
    public String toString() {
        return "Vertice{" + "nome_cidade=" + nome_cidade + ", dist_obj=" + dist_obj + ", visitado=" + visitado + ", adjacentes=" + adjacentes + '}';
    }
    
    
    
}
