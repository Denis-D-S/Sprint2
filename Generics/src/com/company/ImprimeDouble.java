package com.company;

//Antigamente tínhamos que criar uma Classe para cada Tipo. Esta Classe imprime só Double.
public class ImprimeDouble {
    private Double algoParaImprimir;

    //CONSTRUTOR - aponta para os parâmetros necessários à criação
    public ImprimeDouble (Double algoParaImprimir){
        this.algoParaImprimir = algoParaImprimir;
    }

    //MÉTODO GET - pega algo específico (Double), e retorna algo
    public Double getAlgoParaImprimir() {
        return algoParaImprimir;
    }

    //MÉTODO SET - acessa algo, permite tudo (void), e modifica algo
    public void setAlgoParaImprimir(Double algoParaImprimir) {this.setAlgoParaImprimir(algoParaImprimir);
    }

    //MÉTODO QUE IMPRIME - permite tudo (void) e imprime algo
    public void imprimir(){
        System.out.println("Imprime Double: " + algoParaImprimir);
    }

}
