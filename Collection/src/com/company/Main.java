package com.company;

public class Main { //main

    // MAIN
    public static void main(String[] args) { //void main

        ///////////////////////////////////////
        //Cria um Objeto de cada Classe:
        List list = new List();
        Map map = new Map();
        Set set = new Set();

        ///////////////////////////////////////
        System.out.println("*************************************************************");
        System.out.println("------------------LIST INTERFACE BEGINS----------------------");
        System.out.println("----------------------------------------");

        System.out.println("-------1) CREATING----------------------");

        //LIST
        System.out.println(list.arrayListCreate());
        System.out.println(list.linkedListCreate());

        System.out.println("-------2) CREATING AN ELEMENT IN AN SPECIFIED POSITION-----------------------");

        //coloca um elemento no meio
        System.out.println(list.arrayListCreateSingleElementInMiddle(100)); //100 é o número que será inserido
        System.out.println(list.linkedListCreateSingleElementInMiddle(100));

        //coloca um elemento no começo e no final
        System.out.println(list.arrayListCreateSingleElementInBeginingEnd(100)); //100 é o número que será inserido
        System.out.println(list.linkedListCreateSingleElementInBeginingEnd(100));

        System.out.println("-------3) READ----------------------");

        System.out.println(list.arrayListRead(0)); //este '0' é a posição que queremos Read()
        System.out.println(list.linkedListRead(0));

        System.out.println("-------4) UPDATE---------------------");

        System.out.println(list.arrayListUpdate());
        System.out.println(list.linkedListUpdate());

        System.out.println("-------5) DELETE----------------------");

        System.out.println(list.arrayListDelete(1)); //AQUI DELETA O NÚMERO "1" ESPECIFICAMENTE
        System.out.println(list.linkedListDelete(1));

        System.out.println(list.arrayListCompleteDelete()); //AQUI DELETA TODOS OS ELEMENTOS DO ARRAY
        System.out.println(list.linkedListCompleteDelete());

        ///////////////////////////////////////

        System.out.println("*************************************************************");
        System.out.println("------------------MAP INTERFACE BEGINS----------------------");
        System.out.println("----------------------------------------");

        //DICA: MAP É A MAIS RÁPIDA PRA PROCURA DESDE QUE TU TENHA OS KEY E VALUE

        System.out.println("-------1) CREATING----------------------");

        //MAP
        System.out.println(map.hashMapCreate());
        System.out.println(map.treeMapCreate());
        System.out.println(map.linkedHashMapCreate());

        System.out.println("-------2) CREATING AN ELEMENT IN AN SPECIFIED POSITION---------------------");

        //LEMBRE-SE: por ser "insert-order" o Map não permitem itens no começo ou meio, só no fim.
        //o MAP reorganiza a ordem da Coleção da forma que ele acha mais eficiente (a não ser o LinkedHashMap, que mantém a ordem original)
        System.out.println(map.hashMapCreateSingleElementAtEnd(100));
        System.out.println(map.treeMapCreateSingleElementAtEnd(100));
        System.out.println(map.linkedHashMapCreateSingleElementAtEnd(100));

        System.out.println("-------3) READ---------------------");

        System.out.println(map.hashMapRead(1));
        System.out.println(map.treeMapRead(1));
        System.out.println(map.linkedHashMapRead(1));

        System.out.println("-------4) UPDATE----------------------");

        System.out.println(map.hashMapUpdate());
        System.out.println(map.treeMapUpdate());
        System.out.println(map.linkedHashMapUpdate());

        System.out.println("-------5) DELETE--------------------");

        System.out.println(map.hashMapDelete(1));
        System.out.println(map.treeMapDelete(1));
        System.out.println(map.linkedHashMapDelete(1));

        System.out.println(map.hashMapCompleteDelete());
        System.out.println(map.treeMapCompleteDelete());
        System.out.println(map.linkedHashMapCompleteDelete());

        ///////////////////////////////////////

        System.out.println("*************************************************************");
        System.out.println("--------------------SET INTERFACE BEGINS--------------------");
        System.out.println("----------------------------------------");

        System.out.println("-------1) CREATING----------------------");

        //SET
        System.out.println(set.hashSetCreate());
        System.out.println(set.treeSetCreate());
        System.out.println(set.linkedHashSetCreate());

        System.out.println("-------2) CREATING AN ELEMENT IN A SPECIFIED POSITION----------------------");

        System.out.println(set.hashSetCreateSingleElement(100));
        System.out.println(set.treeSetCreateSingleElement(100)); ;
        System.out.println(set.linkedHashSetCreateSingleElement(100));

        System.out.println("-------3) UPDATE----------------------");

        System.out.println(set.hashSetUpdate());
        System.out.println(set.treeSetUpdate());
        System.out.println(set.linkedHashSetUpdate());

        System.out.println("-------4) DELETE----------------------");

        System.out.println(set.hashSetDelete(1));
        System.out.println(set.treeSetDelete(1));
        System.out.println(set.linkedHashSetDelete(1));

        System.out.println(set.hashSetCompleteDelete());
        System.out.println(set.treeSetCompleteDelete());
        System.out.println(set.linkedHashSetCompleteDelete());

        System.out.println("----------------------------------------");


    }

}
