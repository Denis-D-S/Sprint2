package com.company;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.TreeMap;

public class Map {

    //var Maps
    private static HashMap<Integer,String> hashMap = new HashMap<>();
    private static TreeMap<Integer,String> treeMap = new TreeMap<>();
    private static LinkedHashMap<Integer,String> linkedHashMap = new LinkedHashMap<>();

    int valor50 = 50;
    int valorMilhao = 1000000;

    ////////////////////////////////////////////////////////
    //Exemple: public HashMap<Integer,String> hashMapCreateSingleElement(int number){...}
    //note que todos os Maps necessitam de 2 parâmetros, Key e Value.
    ////////////////////////////////////////////////////////

    //MAPS:

    //OS PRÓXIMOS 3 MÉTODOS CRIAM COLEÇÕES (nos Maps)////////////////////////

    //CRIA UMA COLEÇÃO HASHMAP INTEIRA
    public Long hashMapCreate(){
        Long start = System.nanoTime();
        String value = "value";
        for (int i = 0; i<valor50; i++){
            hashMap.put(i, value);
        }
        Long end = System.nanoTime();
        Long result = end-start;

        System.out.println("Time taken to create the HashMap: ");
        return result;
    }

    //CRIA UMA COLEÇÃO TREEMAP INTEIRA
    //DICA: treemap garante uma ordem especificada.
    public Long treeMapCreate(){
        Long start = System.nanoTime();
        String value = "value";
        for(int i = 0; i<valor50;i++){
            treeMap.put(i, value);
        }
        Long end = System.nanoTime();
        Long result = end-start;

        System.out.println("Time taken to create the TreeMap: ");
        return result;
    }

    //CRIA UMA COLEÇÃO LINKEDHASHMAP INTEIRA
    public Long linkedHashMapCreate(){
        Long start = System.nanoTime();
        String value = "value";
        for (int i=0; i<valor50;i++){
            linkedHashMap.put(i,value);
        }
        Long end = System.nanoTime();
        Long result = end-start;

        System.out.println("Time taken to create the LinkedHashMap: ");
        return result;
    }

    //OS PRÓXIMOS 3 MÉTODOS CRIAM 1 ELEMENTO APENAS (nos Maps)////////////////////////

    //DICA: lembre que o MAP reorganiza a ordem da Coleção (menos o LinkedHashMap, que mantém a ordem original)
    //e é por isso que (assim como o Set) podemos inserir novos elementos apenas no final (topo) da Coleção

    //CRIA APENAS UM ELEMENTO PARA SER INSERIDO NA COLEÇÃO HASHMAP
    public Long hashMapCreateSingleElementAtEnd(int number){
        Long start = System.nanoTime();
        String value = "novo valor";
        hashMap.put(number,value);
        Long end = System.nanoTime();
        Long result = end-start;

        System.out.println("Time taken to create one element on HashMap (at the end): ");
        //System.out.println(hashMap);
        return result;
    }

    //CRIA APENAS UM ELEMENTO PARA SER INSERIDO NA COLEÇÃO TREEMAP
    public Long treeMapCreateSingleElementAtEnd(int number){
        Long start = System.nanoTime();
        String value = "novo valor";
        treeMap.put(number,value);
        Long end = System.nanoTime();
        Long result = end-start;

        System.out.println("Time taken to create one element on TreeMap (at the end): ");
        return result;
    }

    //CRIA APENAS UM ELEMENTO PARA SER INSERIDO NA COLEÇÃO LINKEDHASHMAP
    public Long linkedHashMapCreateSingleElementAtEnd(int number){
        Long start = System.nanoTime();
        String value = "novo valor";
        linkedHashMap.put(number, value);
        Long end = System.nanoTime();
        Long result = end-start;

        System.out.println("Time taken to create one element on LinkedHashMap (at the end): ");
        return result;
    }

    //OS PRÓXIMOS 3 MÉTODOS DÃO READ (nos Maps)////////////////////////

    //READ O HASHMAP
    public Long hashMapRead(int number){
        Long start = System.nanoTime();
        hashMap.get(number);
        Long end = System.nanoTime();
        Long result = (end-start);

        System.out.println("Time taken to read one element on HashMap (get method): ");
        //System.out.println(hashMap.get(number)); //isso retorna "value"
        return result;
        //ERRO: AQUI TÁ ERRADO POIS NÃO CONSEGUI CORRIGIR O MÉTOOD READ, VOU DEIXAR PRA ARRUMAR ISSO DEPOIS
        //NOTE QUE ESTE MÉTODO É LONG, E ESTÁ RETORNANDO O QUE EU NÃO QUERIA RETORNAR
    }

    //READ O TREEMAP
    public Long treeMapRead(int number){
        Long start = System.nanoTime();
        treeMap.get(number);
        Long end = System.nanoTime();
        Long result = (end-start);

        System.out.println("Time taken to read one element on TreeMap (get method): ");
        return result;
    }

    //READ O LINKEDHASHMAP
    public Long linkedHashMapRead(int number){
        Long start = System.nanoTime();
        linkedHashMap.get(number);
        Long end = System.nanoTime();
        Long result = (end-start);

        System.out.println("Time taken to read one element on LinkedHashMap (get method): ");
        return result;
    }

    //OS PRÓXIMOS 3 MÉTODOS SÃO UPDATES (nos Maps)////////////////////////

    //UPDATE O HASHMAP
    //DICA: estes updates estão meio estranhos.
    // Ele já tem 50 posições, e eu estou adicionando +50. Total 100 posições de coleção
    //DICA: TODOS ESTES CÓDIGOS DE UPDATE ESTÃO PEGANDO O TAMANHO ORIGINAL DO ARRAY E CRIANDO OUTRO EM CIMA.
    //ISSO É DEVVIDO A CARACTERÍSTICA DO PRÓPRIO MAP, OU É DEVIDO AO MÉTODO PUT QUE ESTAMOS USANDO?
    //ESTÁ REESCREVENDO TUDO, DESDO ZERO, E SOMANDO TAMANHO+TAMANHO
    public Long hashMapUpdate(){
        Long start = System.nanoTime();
        String updatedValue = "NV";
        for (int i = 0; i< hashMap.size(); i++){ //enquanto i<51 faça...
            hashMap.put(i,updatedValue); //51 enfia (i)
            //System.out.println(hashMap + "|| i = " + i + "|| hashMap.size() = " + hashMap.size());
        }
        Long end = System.nanoTime();
        Long result = end-start;

        System.out.println("Time taken to update the HashMap ");
        //System.out.println(hashMap);
        return result;
    }

    //UPDATE O TREEMAP
    public Long treeMapUpdate(){
        Long start = System.nanoTime();
        String updatedValue = "NV";
        for (int i = 0; i< treeMap.size(); i++){
            treeMap.put(i,updatedValue);
        }
        Long end = System.nanoTime();
        Long result = end-start;

        System.out.println("Time taken to update the TreeMap: ");
        return result;
    }

    //UPDATE O LINKEDHASHMAP
    public Long linkedHashMapUpdate(){
        Long start = System.nanoTime();
        String updatedValue = "NV";
        for (int i = 0; i< linkedHashMap.size(); i++){
            linkedHashMap.put(i,updatedValue);
        }
        Long end = System.nanoTime();
        Long result = end-start;

        System.out.println("Time taken to update the LinkedHashMap: ");
        return result;
    }

    //OS PRÓXIMOS 3 MÉTODOS SÃO DELETES (nos Maps)////////////////////////

    //DELETE UM ELEMENTO DO HASHMAP
    public Long hashMapDelete(int number){
        Long start = System.nanoTime();
        hashMap.remove(number);
        Long end = System.nanoTime();
        Long result = end-start;

        System.out.println("Time taken to delete one element from the HashMap: ");
        return result;
    }

    //DELETE UM ELEMENTO DO TREEMAP
    public Long treeMapDelete(int number){
        Long start = System.nanoTime();
        treeMap.remove(number);
        Long end = System.nanoTime();
        Long result = end-start;

        System.out.println("Time taken to delete one element from the TreeMap: ");
        return result;
    }

    //DELETE UM ELEMENTO DO LINKEDHASHMAP
    public Long  linkedHashMapDelete(int number){
       Long start = System.nanoTime();
       linkedHashMap.remove(number);
       Long end = System.nanoTime();
       Long result = end-start;

       System.out.println("Time taken to delete one element from the LinkedHashMap: ");
       return result;
   }

    //DELETE TODOS OS ELEMENTOS DO HASHMAP
    public Long hashMapCompleteDelete(){
       Long start = System.nanoTime();
       hashMap.clear();
       Long end = System.nanoTime();
       Long result = end-start;

       System.out.println("Time taken to delete ALL elements from the HashMap: ");
       return result;
   }

    //DELETE TODOS OS ELEMENTOS DO TREEMAP
    public Long treeMapCompleteDelete(){
        Long start = System.nanoTime();
        treeMap.clear();
        Long end = System.nanoTime();
        Long result = end-start;

        System.out.println("Time taken to delete ALL elements from the TreeMap: ");
        return result;
    }

    //DELETE TODOS OS ELEMENTOS DO LINKEDHASHMAP
    public Long  linkedHashMapCompleteDelete(){
        Long start = System.nanoTime();
        linkedHashMap.clear();
        Long end = System.nanoTime();
        Long result = end-start;

        System.out.println("Time taken to delete ALL elements from the LinkedHashMap: ");
        return result;
    }



}
