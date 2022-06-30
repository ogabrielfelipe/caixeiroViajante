/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package com.mycompany.caixeiroviajante;
import com.mycompany.caixeiroviajante.Vertice;

/**
 *
 * @author ogabrielfelipe
 */
public class Grafo {

    //Daclara o nome dos vértices
    public Vertice arad, bucharest, craiova, dobreta, eforie, fagaras, giurgiu,
            hirsova, iasi, lugoj, mehadia, neamt, oredea, pitesti, rimnicuVilcea,
            sibiu, timisoara, urziceni, vaslui, zerind;
 

    public Grafo() {
        
        //Declara o vertice e a distancia
        this.arad = new Vertice("arad", 366);
        this.bucharest = new Vertice("bucharest", 0);
        this.craiova = new Vertice("craiova", 160);
        this.dobreta = new Vertice("dobreta", 242);
        this.eforie = new Vertice("eforie", 161);
        this.fagaras = new Vertice("fagaras", 178);
        this.giurgiu = new Vertice("giurgiu", 77);
        this.hirsova = new Vertice("hirsova", 151);
        this.iasi = new Vertice("iasi", 226);
        this.lugoj = new Vertice("lugoj", 244);
        this.mehadia = new Vertice("mehadia", 241);
        this.neamt = new Vertice("neamt", 234);
        this.oredea = new Vertice("oredea", 380);
        this.pitesti = new Vertice("pitesti", 98);
        this.rimnicuVilcea = new Vertice("rimnicuVilcea", 193);
        this.sibiu = new Vertice("sibiu", 253);
        this.timisoara = new Vertice("timisoara", 329);
        this.urziceni = new Vertice("urziceni", 80);
        this.vaslui = new Vertice("vaslui", 199);
        this.zerind = new Vertice("zerind", 374);
    
    
        /* Criar ligação (arestas) entre cidades
        Nesse caso, deve existir a conexão de ida e volta entre
        elas. Ou seja, precisamos cirar as ligações de
        A -> B e B -> A.
        */
        arad.adicionaAdjacente(new Adjacente(zerind, 75));
        arad.adicionaAdjacente(new Adjacente(sibiu, 140));
        arad.adicionaAdjacente(new Adjacente(timisoara, 118));

        zerind.adicionaAdjacente(new Adjacente(arad, 75));
        zerind.adicionaAdjacente(new Adjacente(oredea, 71));

        oredea.adicionaAdjacente(new Adjacente(zerind, 71));
        oredea.adicionaAdjacente(new Adjacente(sibiu, 151));

        sibiu.adicionaAdjacente(new Adjacente(oredea, 151));
        sibiu.adicionaAdjacente(new Adjacente(arad, 140));
        sibiu.adicionaAdjacente(new Adjacente(fagaras, 99));
        sibiu.adicionaAdjacente(new Adjacente(rimnicuVilcea, 80));

        timisoara.adicionaAdjacente(new Adjacente(arad, 118));
        timisoara.adicionaAdjacente(new Adjacente(lugoj, 111));

        lugoj.adicionaAdjacente(new Adjacente(timisoara, 111));
        lugoj.adicionaAdjacente(new Adjacente(mehadia, 70));

        mehadia.adicionaAdjacente(new Adjacente(lugoj, 70));
        mehadia.adicionaAdjacente(new Adjacente(dobreta, 75));

        dobreta.adicionaAdjacente(new Adjacente(mehadia, 75));
        dobreta.adicionaAdjacente(new Adjacente(craiova, 120));

        craiova.adicionaAdjacente(new Adjacente(dobreta, 120));
        craiova.adicionaAdjacente(new Adjacente(pitesti, 138));
        craiova.adicionaAdjacente(new Adjacente(rimnicuVilcea, 146));

        pitesti.adicionaAdjacente(new Adjacente(craiova, 138));
        pitesti.adicionaAdjacente(new Adjacente(rimnicuVilcea, 97));
        pitesti.adicionaAdjacente(new Adjacente(bucharest, 101));

        rimnicuVilcea.adicionaAdjacente(new Adjacente(pitesti, 97));
        rimnicuVilcea.adicionaAdjacente(new Adjacente(sibiu, 80));
        rimnicuVilcea.adicionaAdjacente(new Adjacente(craiova, 146));

        fagaras.adicionaAdjacente(new Adjacente(sibiu, 99));
        fagaras.adicionaAdjacente(new Adjacente(bucharest, 211));

        bucharest.adicionaAdjacente(new Adjacente(giurgiu, 90));
        bucharest.adicionaAdjacente(new Adjacente(fagaras, 211));
        bucharest.adicionaAdjacente(new Adjacente(pitesti, 101));

        giurgiu.adicionaAdjacente(new Adjacente(bucharest, 90));
    }
}
