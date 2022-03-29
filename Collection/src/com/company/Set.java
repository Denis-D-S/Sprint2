package com.company;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class Set {

    //var Sets
    private static HashSet<Integer> hashSet = new HashSet<>();
    private static TreeSet<Integer> treeSet = new TreeSet<>();
    private static LinkedHashSet<Integer> linkedHashSet = new LinkedHashSet<>();

    int valor50 = 50;
    int valorMilhao = 1000000;


    //OS PRÓXIMOS 3 MÉTODOS SÃO PARA CRIAR COLEÇÕES (nos Sets)////////////////////////

    //CREATE HASHSET
    public Long hashSetCreate(){
        Long start = System.nanoTime();
        for (int i = 0; i<valor50; i++){
            hashSet.add(i);
        }
        Long end = System.nanoTime();
        Long result = end-start;

        System.out.println("Time taken to create the HashSet: ");
        return result;
    }

    //CREATE TREESET
    public Long treeSetCreate(){
        Long start = System.nanoTime();
        for (int i = 0; i<valor50; i++){
            treeSet.add(i);
        }
        Long end = System.nanoTime();
        Long result = end-start;

        System.out.println("Time taken to create the TreeSet:  ");
        return result;
    }

    //CREATE LINKEDHASHSET
    public Long linkedHashSetCreate(){
        Long start = System.nanoTime();
        for (int i = 0; i<valor50; i++){
            linkedHashSet.add(i);
        }
        Long end = System.nanoTime();
        Long result = end-start;

        System.out.println("Time taken to create the LinkedHashSet:  ");
        return result;
    }

    //OS PRÓXIMOS 3 MÉTODOS CRIAM APENAS 1 ELEMENTO NA COLEÇÃO (nos Sets)////////////////////////

    //Testando percebi que nenhum dos SETS aceita que um elemento seja inserido, nem no começo e nem no meio da Coleção.
    //É possível inserir elementos apenas no final da Coleção, conforme abaixo:

    //CRIA ELEMENTO NO HASHSET
    public Long hashSetCreateSingleElement(int number){
        Long start = System.nanoTime();
        hashSet.add(number);
        Long end = System.nanoTime();
        Long result = end-start;

        System.out.println("Time taken to create one element on the HashSet (at the end): ");
        return result;
    }

    //CRIA ELEMENTO NO TREESET
    public Long treeSetCreateSingleElement(int number){
        Long start = System.nanoTime();
        treeSet.add(number);
        Long end = System.nanoTime();
        Long result = end-start;

        System.out.println("Time taken to create one element on the TreeSet (at the end): ");
        return result;
    }

    //CRIA ELEMENTO NO LINKEDHASHSET
    public Long linkedHashSetCreateSingleElement(int number){
        Long start = System.nanoTime();
        linkedHashSet.add(number);
        Long end = System.nanoTime();
        Long result = end-start;

        System.out.println("Time taken to create one element on the LinkedHashSet (at the end): ");
        return result;
    }

    //OS PRÓXIMOS 3 MÉTODOS EXECUTAM O READ (nos Sets)////////////////////////

    //READ DO HASHSET
    //HashSet does not have a GET method to retrieve elements. HashSet implements the Set interface.
    // The Set is a collection with no duplicates.

    //READ DO TREESET
    //acho que nenhum dos "set" tem método "get"

    //READ DO LINKEDHASHSET
    //acho que nenhum dos "set" tem método "get"


    //OS PRÓXIMOS 3 MÉTODOS EXECUTAM UPDATE (nos Sets)////////////////////////

    //UPDATE DO HASHSET
    public Long hashSetUpdate(){
        Long start = System.nanoTime();
        HashSet<Integer> newHashSet = new HashSet<>();
        for (Integer i : hashSet){
            newHashSet.add(i);
            i++;
        }
        newHashSet = hashSet;
        Long end = System.nanoTime();
        Long result = end-start;

        //System.out.println(newHashSet);
        System.out.println("Time taken to update the HashSet: ");
        return result;
    }

    //UPDATE DO TREESET
    public Long treeSetUpdate(){
        Long start = System.nanoTime();
        TreeSet<Integer> newTreeSet = new TreeSet<>();
        for (Integer i : treeSet){
            newTreeSet.add(i);
            i++;
        }
        newTreeSet = treeSet;
        Long end = System.nanoTime();
        Long result = end-start;

        System.out.println("Time taken to update the TreeSet:  ");
        return result;
    }

    //UPDATE DO LINKEDHASHSET
    public Long linkedHashSetUpdate(){
        Long start = System.nanoTime();
        LinkedHashSet<Integer> newLinkedHashSet = new LinkedHashSet<>();
        for (Integer i : linkedHashSet){
            newLinkedHashSet.add(i);
            i++;
        }
        newLinkedHashSet = linkedHashSet;
        Long end = System.nanoTime();
        Long result = end-start;

        System.out.println("Time taken to update the HashSet:  ");
        return result;
    }

    //OS PRÓXIMOS 3 MÉTODOS FAZEM O DELETE DE UM ITEM DA COLEÇÃO (nos Sets)////////////////////////

    //DELETE DE UM NÚMERO DO HASHSET
    public Long hashSetDelete(int number){
        Long start = System.nanoTime();
        hashSet.remove(number);
        Long end = System.nanoTime();
        Long result = end-start;

        System.out.println("Time taken to delete one element of the HashSet: ");
        return result;
    }

    //DELETE DE UM NÚMERO DO TREESET
    public Long treeSetDelete(int number){
        Long start = System.nanoTime();
        treeSet.remove(number);
        Long end = System.nanoTime();
        Long result = end-start;

        System.out.println("Time taken to delete one element of the TreeSet: ");
        return result;
    }

    //DELETE DE UM NÚMERO DO LINKEDHASHSET
    public Long linkedHashSetDelete(int number){
        Long start = System.nanoTime();
        linkedHashSet.remove(number);
        Long end = System.nanoTime();
        Long result = end-start;

        System.out.println("Time taken to delete one element of the LinkedHashSet: ");
        return result;
    }

    //DELETE DE TODOS OS NÚMEROS DO HASHSET
    public Long hashSetCompleteDelete(){
        Long start = System.nanoTime();
        hashSet.clear();
        Long end = System.nanoTime();
        Long result = end-start;

        System.out.println("Time taken to delete ALL elements of the HashSet: ");
        return result;
    }

    //DELETE DE TODOS OS NÚMEROS DO TREESET
    public Long treeSetCompleteDelete(){
        Long start = System.nanoTime();
        treeSet.clear();
        Long end = System.nanoTime();
        Long result = end-start;

        System.out.println("Time taken to delete ALL elements of the TreeSet: ");
        return result;
    }

    //DELETE DE TODOS OS NÚMEROS DO LINKEDHASHSET
    public Long linkedHashSetCompleteDelete(){
        Long start = System.nanoTime();
        linkedHashSet.clear();
        Long end = System.nanoTime();
        Long result = end-start;

        System.out.println("Time taken to delete ALL elements of the LinkedHashSet: ");
        return result;
    }

}
