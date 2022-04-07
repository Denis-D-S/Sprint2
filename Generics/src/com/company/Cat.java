package com.company;

public class Cat extends Animal{
    private String nome;
    private String raca;

    public Cat(String nome, String raca, String mamifero) {
        super(mamifero);
        this.nome = nome;
        this.raca = raca;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    //MÉTODO QUE TRANSFORMA OBJETO EM STRING PARA PODERMOS IMPRIMI-LO
    @Override
    public String toString() {
        return ("Nome do gato: "+this.nome+
                " ,Raça do gato: "+ this.raca +
                " ,É mamífero: " + this.mamifero);
    }
    //se não usarmos este método acima, o ArrayList não consegue imprimir o conteúdo, pois ele lê tudo como Objeto
    //O que ele imprime, daí, é apenas um apontamento ao local da memória, tipo "com.company.Cat@5caf905d]"
    //Mas o método "toString" é capaz de transformar o Objeto Cat em String, daí ao mandar imprimir, imprime certinho.
}
