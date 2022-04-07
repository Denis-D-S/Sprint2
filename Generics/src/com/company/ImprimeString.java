package com.company;

//Antigamente tínhamos que criar uma Classe para cada Tipo. Esta Classe imprime só String.
public class ImprimeString {
    private String algoParaImprimir;

    //CONSTRUTOR - aponta para os parâmetros necessários à criação
    public ImprimeString (String algoParaImprimir){
        this.algoParaImprimir = algoParaImprimir;
    }

    //MÉTODO GET - pega algo específico (String), e retorna algo
    public String getAlgoParaImprimir() {
        return algoParaImprimir;
    }

    //MÉTODO SET - acessa algo, permite tudo (void), e modifica algo
    public void setAlgoParaImprimir(String algoParaImprimir) {
        this.setAlgoParaImprimir(algoParaImprimir);
    }

    //MÉTODO QUE IMPRIME - permite tudo (void) e imprime algo
    public void imprimir(){
        System.out.println("Imprime String: " + algoParaImprimir);
    }

}
