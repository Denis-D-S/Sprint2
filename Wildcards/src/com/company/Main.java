package com.company;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        //Note que o Wildcard aceita QUALQUER TIPO.

        //Abaixo estamos passando o Tipo INTEGER
	    List<Integer> intList = new ArrayList<>(); //note que aqui criei uma lista "ArrayList" só pra testar.
        intList.add(3);
        intList.add(4);
        System.out.print("Imprimindo a Lista de Inteiros: ");
        printList(intList);

        //Abaixo estamos passando o Tipo DOUBLE
        List<Double> doubleList = new LinkedList<>(); //e aqui eu criei uma lista "LinkedList"
        doubleList.add(9.9);
        doubleList.add(10.1);
        System.out.print("Imprimindo a Lista de doubles: ");
        printList(doubleList);

        //Abaixo vamos tentar um Generic com WildCard (?)
        List<Object> genericList = new ArrayList<>();
        genericList.add(9);
        genericList.add("Olá");
        genericList.add(9.9);

        //chamando a função abaixo (função PRINTLIST):
        System.out.print("Imprimindo a Lista de Inteiros usando Método com WildCards: ");
        printList(intList);
        System.out.print("Imprimindo a Lista de Doubles usando Método com WildCards: ");
        printList(doubleList);
        System.out.print("Imprimindo a Lista de Objetos misturados usando Método com WildCards: ");
        printList(genericList);

        //chamando a função abaixo (função "SOMA");
        System.out.print("Imprimindo a SOMA dos itens da Lista de Inteiros usando Método com WildCards: ");
        System.out.println(soma(intList));
        System.out.print("Imprimindo a SOMA dos itens da Lista de Doubles usando Método com WildCards: ");
        System.out.println(soma(doubleList));
        System.out.println("Se tentar SOMAR (abaixo) a Lista de Objetos misturados dá erro, pois soma requer Number, e não Object.");
        //System.out.println(soma(genericList)); //aqui da erro pois não pode somar 'Object', apenas 'Number'.

    }

    //ABAIXO, ESTAMOS CRIANDO UM MÉTODO UTILIZANDO WILDCARDS!!!
    //O "<?>" é o Wildcard. Usamos o Wirldcard QUANDO NÃO SABEMOS qual é o Tipo que nos será passado. Então ele aceita QUALQUER TIPO

    //ESTE MÉTODO USA WILDCARDS PARA IMPRIMIR QUALQUER LISTA DE QUALQUER TIPO
    private static void printList(List<?> myList){
        System.out.println(myList);
    }


    //ESTE MÉTODO SOMA OS ITENS DE QUALQUER LISTA DE QUALQUER TIPO
    private static double soma(List<? extends Number>  arrayLista){
        double soma = 0.0;
        for (Number i : arrayLista){
            soma += i.doubleValue();
        }
        return soma;
    }







}
