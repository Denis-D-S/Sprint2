package com.company;

import java.util.Stack; //note que o Java importa automaticamente o Stack

public class Main {

    public static void main(String[] args) {
        //note os jacarés especificando o tipo. E note que só aceita Wrappers, nunca tipos primitivos.
	    Stack<String> numbers = new Stack<String>();

        numbers.add("Um");
        numbers.add("Dois");
        numbers.add("Três");
        numbers.add("Quatro");

        System.out.println(numbers);
        System.out.println(numbers.peek()); //observa quem é o primeiro do Stack
        //System.out.println(numbers.pop()); //corta fora o primeiro do Stack
        System.out.println(numbers);
        System.out.println(numbers.contains(5)); //retorna false, pois ñ temos 5 na Stack

        System.out.println("-------------------------");

        System.out.println(numbers.get(0));
        System.out.println(numbers.get(1));
        System.out.println(numbers.get(2));
        System.out.println(numbers.get(3));

        System.out.println("-------------------------");

        System.out.println(numbers.search("Um"));
        System.out.println(numbers.search("Dois"));
        System.out.println(numbers.search("Três"));
        System.out.println(numbers.search("Quatro"));
    }
}
