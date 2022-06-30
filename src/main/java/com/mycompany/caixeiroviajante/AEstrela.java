package com.mycompany.caixeiroviajante;

import java.util.ArrayList;
import java.util.Collections;

public class AEstrela {
    private ArrayList<Vertice> caminhoPercorrer;
    private Boolean status;
    private Vertice vertice;

    public AEstrela(Vertice vertice){
        this.vertice = vertice;
        this.status = false;
        this.caminhoPercorrer = new ArrayList<>();
    }
    
    /**
     * @return ArrayList<Adjacente> return the caminhoPercorrer
     */
    public ArrayList<Vertice> getCaminhoPercorrer() {
        return caminhoPercorrer;
    }

    /**
     * @param caminhoPercorrer the caminhoPercorrer to set
     */
    public void setCaminhoPercorrer(ArrayList<Vertice> caminhoPercorrer) {
        this.caminhoPercorrer = caminhoPercorrer;
    }

    /**
     * @return Boolean return the status
     */
    public Boolean isStatus() {
        return status;
    }

    /**
     * @param status the status to set
     */
    public void setStatus(Boolean status) {
        this.status = status;
    }

    /**
     * @return Vertice return the vertice
     */
    public Vertice getVertice() {
        return vertice;
    }

    /**
     * @param vertice the vertice to set
     */
    public void setVertice(Vertice vertice) {
        this.vertice = vertice;
    }

    public void busca(Vertice vertice){
        vertice.setVisitado(true);

        ArrayList<Adjacente> ad = vertice.getAdjacentes();
        Collections.sort(ad);
 

        System.out.println("Cidade Atual: "+ vertice.getNome_cidade());
        int i = 0;
        if (vertice.getDist_obj() != 0){
            for (Adjacente ad_aux: ad){
                if (!ad_aux.getVertice().getVisitado()){
                    System.out.println(i+". "+ad_aux.getVertice().getNome_cidade()+" - "+(ad_aux.getVertice().getDist_obj()+ad_aux.getDistancia()));
                    i++;
                }
            }
        }
        System.out.println("--------------");


        for (Adjacente ad_aux: ad){
            if(!ad_aux.getVertice().getVisitado()){
                ad_aux.getVertice().setVisitado(true);                
                this.vertice = ad_aux.getVertice();
                break;
            }
        }

        if (vertice.getDist_obj() == 0){
            this.status = true;           
        }else{
            busca(this.vertice);
        }


        
    }


}
