package com.company;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Main {

    public static void main(String[] args) {

        System.out.println("DICA: O SET REPRESENTA GRUPOS DE ELEMENTOS SEM DUPLICATA! OU SEJA, NENHUM DELES ACEITA REPETIDOS!!!!");

        System.out.println("----------------------------------------------------------");
        System.out.println("-----------------------------HASHSET-----------------------------");

        Set<Integer> listaSet = new HashSet<>(); //criou uma lista set vazia.

        listaSet.add(1);
        listaSet.add(3);
        listaSet.add(null);
        listaSet.add(null);
        listaSet.add(1);
        listaSet.add(0);

        System.out.println(listaSet); //vai retornar "[null,1,3]", ou seja, não repete itens e muda a ordem.
        System.out.println("Note que o HashSet reorganiza os itens conforme uma ordem que ele considera mais otimizada. " +
                "Mas ele ainda não aceita repetidos, pois é característica do SET");

        //DICA: "o set não é indexado, então para percorrer ele precisamos usar ou o "interator" ou um "forEach".
        for (Integer i : listaSet) //tipo de objeto - i = nome - : = forEach - listaSet
            System.out.println(i); //vai imprimir os elementos da listaSet cada um, separadamente.


        System.out.println("----------------------------------------------------------");
        System.out.println("-----------------------------LINKEDHASHSET-----------------------------");

        Set<Integer> listaLinkedHashSet = new LinkedHashSet();

        listaLinkedHashSet.add(1);
        listaLinkedHashSet.add(3);
        listaLinkedHashSet.add(null);
        listaLinkedHashSet.add(null);
        listaLinkedHashSet.add(1);
        listaLinkedHashSet.add(0);

        System.out.println(listaLinkedHashSet); //retorna [1,3,null,0], ou seja, não repete itens e não muda a ordem.
        System.out.println("Note que o LinkedHashSet é como uma corrente: ele organiza os itens na ordem que forem " +
                "colocados. Mas ele ainda não aceita repetidos, pois é característica do SET");

        for (Integer i : listaLinkedHashSet) //tipo de objeto - i = nome - : = forEach - listaSet
            System.out.println(i); //vai imprimir os elementos da listaSet cada um, separadamente.

        System.out.println("----------------------------------------------------------");
        System.out.println("-----------------------------TREESET-----------------------------");

        Set<Integer> listaTreeSet = new TreeSet<>();

        listaTreeSet.add(1);
        listaTreeSet.add(3);
//        listaTreeSet.add(null); //TREESET NÃO ACEITA "NULL"!
//        listaTreeSet.add(null);
        listaTreeSet.add(1);
        listaTreeSet.add(0);

        System.out.println(listaTreeSet); //retorna [0,1,3], ou seja, não aceita NULL, não repete e muda ordem.
        System.out.println("Note que o TreeSet, diferente dos outros, ele não aceita NULL. ");
        System.out.println("Além disso, igual o HashSet, ele também reorganiza a ordem conforme uma posição que ele " +
                "acha mais eficiente. Mas ele ainda não aceita repetidos, pois é característica do SET");

        for (Integer i : listaTreeSet) //tipo de objeto - i = nome - : = forEach - listaSet
            System.out.println(i); //vai imprimir os elementos da listaSet cada um, separadamente.

    }

//    Decore da seguinte forma:
//
    //NOTE QUE A CARACTERÍSTICA MAIS MARCANTE DO SET É A NÃO REPETIÇÃO DOS ELEMENTOS!!!!! EM NENHUM CASO!!!!

//    HASH (nível de organização médio) -> significa que a ordem será alterada pois o computador vai buscar a forma mais eficiente de fazer
//    as coisas. Vai geralmente buscar organizar tudo em ordem crescente (e aceita null, mas não aceita repetidos)

//    LINKED (mais caótico e desorganizado) -> significa que é tipo uma corrente. OU seja, todos os elementos estão linkados uns com os
//    outros, na ordem em que foram criados (e não aceita repetidos e aceita null)
//
//    TREE (é o mais organizadinho) -> significa que TUDO vai ser reestruturado. Ele vai organizar tudo na ordem mais
//    eficiente, além disso VAI APAGAR OS NULLS (não aceita null),e (também não aceita repetidos) - ou seja, ele meio que tipo não aceita nada
    //que possa fazer as coisas ficarem confusas ou caóticas (por isso ele não aceita null nem repetidos). É justamente pois ele é o mais organizadinho
}
