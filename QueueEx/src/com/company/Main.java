package com.company;

import java.util.LinkedList;
import java.util.Queue;

public class Main {

    public static void main(String[] args) {
        Queue<String> filaRU = new LinkedList<String>();

        //QUEUE É FIFO, FILA DO RU

        filaRU.add("Pedro"); //posição 0
        filaRU.add("Maria"); //posição 1
        filaRU.add("Mateus"); //posição 2
        filaRU.add("Diego"); //posição 3 -> último item a ser colocado, portanto ele está em último lugar (graças ao FIFO)

        filaRU.remove(2); //REMOVE BLOQUEADO DE ALGUMA FORMA. DIFERENTE DO STACK, QUE DELETA
        System.out.println("TESTANDO REMOVE" + filaRU);

        System.out.println("-------------------");
        System.out.println("Criamos e vamos imprimir o Queue: " + filaRU);
        System.out.println("-------------------");

        System.out.println("O 'peek' serve para olhar o item no topo (o primeiro da fila): " + filaRU.peek()); //peek apenas olha o primeiro item da fila (Pedro! Devido ao FIFO)
        System.out.println("O 'pool' corta fora o primeiro item da fila: " + filaRU.poll()); //corta fora o primeiro item da fila (Pedro! Devido ao FIFO)

        System.out.println("-------------------");
        System.out.println("Vamos imprimir novamente pra ver como fica: " + filaRU); //[Maria, Mateus, Diego] posições [0,1,2] (veja abaixo)
        System.out.println("-------------------");

        System.out.println("Agora vamos imprimir os itens na posição [0], [1], [2]: ");
        System.out.println("[0]: " + filaRU.toArray()[0]);//também acessar a lista transformando-a em Array (Maria é a primeira)
        System.out.println("[1]: " + filaRU.toArray()[1]);//a posição 0 será a primeira, a 1 a segunda, etc. (Mateus é segundo)
        System.out.println("[2]: " + filaRU.toArray()[2]);//(Diego é terceiro)

        System.out.println("-------------------");

        System.out.println("Qual o tamanho (size) do Queue agora? " + filaRU.size()); //retorna o tamanho do Array que temos

    }
}
