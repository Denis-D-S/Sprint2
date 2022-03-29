package com.company;

//INTERFACES FUNCIONAIS SÃO AQUELAS QUE POSSUEM MÉTODOS ABSTRATOS!!!
//EXISTEM 4 TIPOS:

//-fornecedor (suplier) - não possui Input, apenas supply algum dado. Apenas entrega.
//-consumidor e BiCOnsumidor - não resulta nada. Apenas consome algum dado. Apenas Input.
//-Predicado e BiPredicado - resulta em um boolean.
//-Função e BiFunção - é a função clássica, que recebe um Input por parâmetro e retorna um Output.
//-UnaryOperator e BinaryOperator - ?

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Main {

    public static void main(String[] args) {

        //EXEMPLO PREDICADO:
        System.out.println("----------------Exemplo Predicado-------------------");
        Predicate<String> checkLength = str -> str.length()>5;
        //temos que passar uma String por parâmetro, e daí vai checar se o length é >5.
        //Note que o método "test" já vem automático na Interface Predicado (abra documentação e veja)
        System.out.println(checkLength.test("Pedro")); //retorna "true"
        System.out.println(checkLength.test("Godofredo")); //retorna "false"


        //EXEMPLO CONSUMER
        System.out.println("----------------Exemplo Consumer-------------------");
        Person p = new Person();
        Consumer<Person> setName = t -> t.setName("Pedro"); //note que o Consumer recebe o Objeto "Person" como "tipo"
        setName.accept(p); //aqui estamos "aceitando" as modificações feitas acima
        System.out.println(p.getName()); //imprime "Pedro". Ou seja, mudou o nome original que era "name" antes.

        //lembre que a forma tradicional de alteração é modificando diretamente o Set.
        p.setName("Matheus"); //note que podemos mudar o nome acessando diretamente o set
        System.out.println(p.getName());


        //EXEMPLO FUNCTION
        System.out.println("----------------Exemplo Function-------------------");
        Function<Integer,String> numero = t -> t*10 + " -> o valor foi multiplicado por 10!";
        System.out.println(numero.apply(2)); //apply recebe um Int "2", e retorna um Int+String
        
        //TODO: andThen do function pra fazer Strings virar um array de char, por exemplo. Método Split.

        Function<String, String> mensagem = (String message) -> message.replace("multiplicado","multiplied");
        System.out.println(numero.andThen(mensagem).apply(2));

        //NOTE QUE A PRIMEIRA FUNÇÃO FAZ O CÁLCULO, E A SEGUNDA TROCA O MULTIPLICADO PELO MULTIPLIED.



        //EXEMPLO SUPPLIER
        System.out.println("----------------Exemplo Supplier-------------------");
        Supplier<Double> getRandomDouble = () -> Math.random(); //lembre: no Supplier não precisa passar input
        System.out.println(getRandomDouble.get());//o método GET (natural da Interface Supplier) apenas busca algo...

    }
}
