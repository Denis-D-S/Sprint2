package com.company;

//DICA: para fazer uma Classe Generic, temos que declarar um "Type Parameter" que é <T> normalmente (por convenção do Java)
//este "T" representa "Type", que são os tipos que queremos "generalizar", como String, Double, Integer, etc.

public class Imprime <T> {
    public T algoParaImprimir; //variável com um Tipo genérico (aceita tudo)

    //CONSTRUTOR DO GENERIC - aponta para os parâmetros necessários à criação
    public Imprime(T algoParaImprimir){
        this.algoParaImprimir = algoParaImprimir;
    }

    //MÉTODO GET - pega algo específico (T -> Tipo genérico), e retorna algo
    public T getAlgoParaImprimir() {
        return algoParaImprimir;
    }

    //MÉTODO SET - acessa algo, permite tudo (void), e modifica algo
    public void setAlgoParaImprimir(T algoParaImprimir) {
        this.algoParaImprimir = algoParaImprimir;
    }

    //MÉTODO QUE IMPRIME - permite tudo (void) e imprime algo
    public void imprima(){
        System.out.println("Imprime Generic (aceita vários Tipos): " + algoParaImprimir);
    }

}
