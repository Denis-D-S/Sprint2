package com.company;

//CRIEI ESTA CLASSE APENAS PARA TESTAR SE A CLASSE GENÉRICA "ImprimeAnimais" aceitaria a Classe "Pessoa" SEM TER DADO "EXTEND" NELA.
// -> não aceita! Tem que dar o EXTEND...

public class Pessoa {
    public String mamifero;

    //CONSTRUTOR
    public Pessoa(String mamifero) {
        this.mamifero = mamifero;
    }

    //GET
    public String getPessoa() {
        return mamifero;
    }

    //SET
    public void setPessoa(String mamifero) {
        this.mamifero = mamifero;
    }


}
