package com.company;

import java.util.Stack;

public class Main {

    public static void main(String[] args) {

        //STACK É LIFO, COMO UMA PILHA DE PRATOS...
        //veja abaixo:

	    //A    ----> item no topo da stack (poisção pro get 4) - (poisção pro search 1)
        //I    ----> item em segundo lugar na stack (poisção pro get 3) - (poisção pro search 2)
        //R    ----> item em terceiro lugar na stack (poisção pro get 2) - (poisção pro search 3)
        //A    ----> item em quarto lugar na stack (poisção pro get 1) - (poisção pro search 4)
        //M    ----> item em quinto lugar na stack (poisção pro get 0) - (poisção pro search 5)

        Stack<Character> maria = new Stack<>();

        maria.add('M');
        maria.add('A');
        maria.add('R');
        maria.add('I');
        maria.add('A'); //último item a ser colocado é o "A", portanto ele está no topo (graças ao LIFO)

        maria.remove(3);
        System.out.println(maria);

        System.out.println("1) Imprime tudo: " + maria);

        System.out.println("2) Vamos olhar apenas o primeiro item usando 'peek': " + maria.peek()); //para olhar o topo da stack (vai retornar "A")

        System.out.println("3) O 'pop' retira o item no topo da Stack: " + maria.pop()); //elimina o item do topo

        System.out.println("4) Vamos imprimir de novo para ver como ficou a Stack agora: " + maria); //retorna apenas "MARI"

        System.out.println("5) Agora quero ver a primeira posição(posição 0) usando 'get': " + maria.get(0)); //retorna "M", pois esta é a primeir posição que foi colocada.

        System.out.println("6) Por fim vamos ver qual é a posição da letra 'M' segundo o 'search': " + maria.search('M'));
        //Retorna "4", pois pro método Search a letra "M" está na "posição 4":
        //Lembre que estamos trabalhando com: [M,A,R,I]:
        //I = 1
        //R = 2
        //A = 3
        //M = 4
        //Perceba que o Método "search" possui uma forma bem diferente de contagem do que o get.
        //O método 'get' conta como se fosse um Array, tipo [0,1,2,3,etc....]
        //Já o método 'search' conta da seguinte forma: [1,2,3,4, etc.....]
        //É bizarro assim mesmo.....
    }
}
