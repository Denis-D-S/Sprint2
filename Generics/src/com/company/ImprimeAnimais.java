package com.company;

// Note que alteramos a Classe "Imprime" para que ela agora imprima APENAS OBJETOS ANIMAIS E SEUS HERDEIROS (Cats, Dogs, etc.)

//Note que a única coisa que fizemos foi colocar o "<T extends Animal>", e isso cria um GENERIC DE UMA CLASSE ESPECÍFICA...
//e o genial é que isso extende também para as classes "FILHAS" dessa Classe.
// Então "CATS E DOGS" podem ser imprimidos, pois elas HERDAM de "Animal".

//DICA: a sintaxe para GENERICS é SEMPRE a palavra "EXTENDS". Mesmo que no lugar da Classe "Animal" fosse uma INTERFACE chamada "Animal",
//ainda assim continuaria sendo "extends". Talvez você pense que faria mais sentido, no caso de uma Interface, que a palavra fosse "implements"...
//mas isso estaria errado! O fato é que mesmo sendo classe, ou interface, em GENERICS tudo é "EXTENDS"...
public class ImprimeAnimais <T extends Animal> {

    public T algoParaImprimir; //variável com um Tipo genérico (aceita tudo)

    //CONSTRUTOR DO GENERIC - aponta para os parâmetros necessários à criação
    public ImprimeAnimais(T algoParaImprimir){
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
        System.out.println("Imprime Generic (aceita vários Objetos Animais): " + algoParaImprimir);
    }

    public void comer(){
        System.out.println("Sim, este animal precisa comer!");
    }

}
