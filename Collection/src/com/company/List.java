package com.company;

import java.util.ArrayList;
import java.util.LinkedList;


public class List {

    //colocando "private static" aqui nas declarações tudo funciona. PQ?
    //var Lists
    private static ArrayList<Integer> collection = new ArrayList<>(); //declarações
    //DICA: tá faltando uma variável STACK aqui!
    private static LinkedList<Integer> collectionLinkedList = new LinkedList<>();

    int valor50 = 50;
    int valorMilhao = 1000000;

    /////////////////////////////////////////////////////

    //LISTS:

    //OS PRÓXIMOS 2 MÉTODOS CRIAM UMA COLEÇÃO (da List)////////////////////////

    //CRIA A LISTA (ArrayList)
    public Long arrayListCreate(){
        //é preferível usar o "nanoTime()" do que o "currentTimeMillis(), pois o "nano" pega mais preciso a diferença.
        Long start = System.nanoTime(); //use wrapper Long (e não "long")
        for (int i = 0; i < valor50; i++) {
            collection.add(i);
        }
        Long end = System.nanoTime();
        Long result = end-start;

        //System.out.println(collection);
        System.out.println("Time taken to create the ArrayList: ");
        return result;
    }

    //CRIA UMA LINKEDLIST (LinkedList)
    public Long linkedListCreate(){
        Long start = System.nanoTime();
        for (int i = 0; i< valor50; i++){
            collectionLinkedList.add(i);
        }
        Long end = System.nanoTime();
        Long result = end-start;

        System.out.println("Time taken to create the LinkedList: ");
        return result;
    }

    //OS PRÓXIMOS 2 MÉTODOS ADICIONAM UM ITEM A COLEÇÃO (da List)////////////////////////

    //ADICIONA UM NOVO ELEMENTO NO MEIO DA ARRAYLIST (ArrayList)
    public Long arrayListCreateSingleElementInMiddle(int number){
        Long start = System.nanoTime();
        collection.add(collection.size()/2,number); //estou adicionando um novo Objeto NUMA POSIÇÃO ESPECÍFICA (no meio da lista)
        Long end = System.nanoTime();
        Long result = end-start;

        //System.out.println(collection);
        System.out.println("Time taken to add one element in the middle of the ArrayList: ");
        return result;
    }

    //ADICIONA UM NOVO ELEMENTO NO MEIO DA LINKEDLISTA (LinkedList)
    public  Long linkedListCreateSingleElementInMiddle(int number){
        Long start = System.nanoTime();
        collectionLinkedList.add(collectionLinkedList.size()/2,number);
        Long end = System.nanoTime();
        Long result = end-start;

        //System.out.println(collectionLinkedList);
        System.out.println("Time taken to add one element in the middle the LinkedList: ");
        return result;
    }

    //ADICIONA UM NOVO ELEMENTO NO COMEÇO E NO FINAL DA ARRAYLIST (ArrayList)
    public Long arrayListCreateSingleElementInBeginingEnd(int number){
        Long start = System.nanoTime();
        collection.add(0,number); //adicionando no começo da lista
        collection.add(collection.size(),number); //adicionando no final da lista
        Long end = System.nanoTime();
        Long result = end-start;

        //System.out.println(collection);
        System.out.println("Time taken to add one element in the begining and end to the ArrayList: ");
        return result;
    }

    //ADICIONA UM NOVO ELEMENTO NO COMEÇO E NO FINAL DA LINKEDLISTA (LinkedList)
    public  Long linkedListCreateSingleElementInBeginingEnd(int number){
        Long start = System.nanoTime();
        collectionLinkedList.add(0,number); //adicionando no começo da lista
        collectionLinkedList.add(collectionLinkedList.size(),number); //adicionando no final da lista
        Long end = System.nanoTime();
        Long result = end-start;

        //System.out.println(collectionLinkedList);
        System.out.println("Time taken to add one element in the begning and end of the LinkedList: ");
        return result;
    }

    //OS PRÓXIMOS 2 MÉTODOS DÃO UM READ NUM ITEM DA COLEÇÃO (da List)////////////////////////

    //LÊ UM PONTO ESPECIFICO DA LISTA (ArrayList)
    public Long arrayListRead(int number){
        Long start = System.nanoTime();
        collection.get(number);
        Long end = System.nanoTime();
        Long result = end-start;

        System.out.println("Time taken to read one element of the ArrayList (get method): ");
//        System.out.println("CONFIRA ESTE DADO PRA VER O QUE É: " + collection.get(number));
        return result;
    }

    //LÊ UM PONTO ESPECIFICO DA LISTA (LinkedList)
    public Long linkedListRead(int number){
        Long start = System.nanoTime();
        collectionLinkedList.get(number);
        Long end = System.nanoTime();
        Long result = end-start;

        System.out.println("Time taken to read one element of the LinkedList (get method): ");
        return result;
    }

    //OS PRÓXIMOS 2 MÉTODOS ATUALIZAM (update) A COLEÇÃO (da List)////////////////////////

    //FAZER UPDATE DA LISTA (ArrayList)
    public Long arrayListUpdate(){
        Long start = System.nanoTime();
        ArrayList<Integer> newArrayList = new ArrayList<>();

        //DICA: o código ModeloL é feito com forEach. Eu mudei para "for".
        for (int i = 0; i<collection.size(); i++){
            newArrayList.add(i); //aqui atualiza a newArrayList
        }
        collection = newArrayList; //aqui substitui a ArrayList original pela newArrayList
        Long end = System.nanoTime();
        Long result = end-start;

        System.out.println("Time taken to update the ArrayList: ");
        return result;
    }

    //FAZER UPDATE DA LISTA (LinkedList)
    public Long linkedListUpdate(){
        Long start = System.nanoTime();
        LinkedList<Integer> newLinkedList = new LinkedList<>();

        for (int i = 0; i<collectionLinkedList.size(); i++){
            newLinkedList.add(i);
        }
        collectionLinkedList = newLinkedList;
        Long end = System.nanoTime();
        Long result = end-start;

        System.out.println("Time taken to update the LinkedList: ");
        return result;
    }

    //OS PRÓXIMOS 2 MÉTODOS DELETAM ITEM DA COLEÇÃO (da List)////////////////////////

    //DELETAR UM ITEM DO ARRAYLIST
    public Long arrayListDelete(int number){
        Long start = System.nanoTime();
        collection.remove(number);
        Long end = System.nanoTime();
        Long result = end-start;

        //System.out.println(collection);
        System.out.println("Time taken to delete one element of the ArrayList: ");
        return result;
    }

    //DELETAR UM ITEM DO LINKEDLIST
    public Long linkedListDelete(int number){
        Long start = System.nanoTime();
        collectionLinkedList.remove(number);
        Long end = System.nanoTime();
        Long result = end-start;

        System.out.println("Time taken to delete one element of the LinkedList: ");
        return result;
    }

    //DELETAR A LISTA INTEIRA DO ARRAYLIST
    public Long arrayListCompleteDelete(){
        Long start = System.nanoTime();
        collection.clear();
        Long end = System.nanoTime();
        Long result = end-start;

        //System.out.println("PRESTE ATENÇÃO NESTE ITEM PARA VER SE TUDO FOI DELETADO" + collection);
        System.out.println("Time taken to delete ALL of the ArrayList: ");
        return result;
    }

    //DELETAR A LISTA INTEIRA DO LINKEDLIST
    public Long linkedListCompleteDelete(){
        Long start = System.nanoTime();
        collectionLinkedList.clear();
        Long end = System.nanoTime();
        Long result = end-start;

        System.out.println("Time taken to delete ALL of the LinkedList: ");
        return result;
    }


}
