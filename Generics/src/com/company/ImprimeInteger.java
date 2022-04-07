package com.company;

//Antigamente tínhamos que criar uma Classe para cada Tipo. Esta Classe imprime só Integer.
public class ImprimeInteger {
    private Integer algoParaImprimir;

    //CONSTRUTOR - aponta para os parâmetros necessários à criação
    public ImprimeInteger (Integer algoParaImprimir){
        this.algoParaImprimir = algoParaImprimir;
    }

    //MÉTODO GET - pega algo específico (Integer), e retorna algo
    public Integer getAlgoParaImprimir() {
        return algoParaImprimir;
    }

    //MÉTODO SET - acessa algo, permite tudo (void), e modifica algo
    public void setAlgoParaImprimir(Integer algoParaImprimir) {
        this.setAlgoParaImprimir(algoParaImprimir);
    }

    //MÉTODO QUE IMPRIME - permite tudo (void) e imprime algo
    public void imprimir(){
        System.out.println("Imprime Integer: " + algoParaImprimir);
    }

}
