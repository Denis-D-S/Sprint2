package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        System.out.println("----------------------------------------------------------");
        System.out.println("-----------------------------brincando com o Array e ArrayList-----------------------------");

        System.out.println("1) Abaixo, criando e imprimindo as Lists--------------");
        //<====> Criando Array povoado
        String[] familia = {"Pai", "Mãe", "Irmã", "Irmão"};


        //TODO: VEJA LISTAS IMUTÁVEIS
//        var lista = List.of("Pai", "Mãe", "Irmã", "Irmão");
//        lista.add("teste");
//        System.out.println(lista); //aqui dá erro pois esta é uma lista imutável

        //<====> Criando ArrayList povoado
        ArrayList<String> familiaArrayList = new ArrayList<String>(List.of("Pai", "Mãe", "Irmã", "Irmão"));
        //se não tiver o "Array.asList", ele não aceita e dá erro...

        //<====> Imprimindo as listas:
        System.out.println("a) Imprimindo Array: " + familia); //este código estranho é um apontamento da memória onde está o Array
        System.out.println("b) Imprimindo ArrayList: " + familiaArrayList); //imprimiu na ordem em que foram adicionadas

        System.out.println("----------------------------------------------------------");

        System.out.println("2) Abaixo, adicionando itens (null e repetido)--------------");
        //<====> Tentando adicionar um item null tanto no Array quanto no ArrayList;
        familia[0] = null; //botando "null" no Array (aceita)
        familiaArrayList.add(null); //botando "null" no ArrayList (aceita)

        //<====> Tentando adicionar um item repetido tanto no Array quanto no ArrayList;
        familia[1] = "Irmã";
        familiaArrayList.add("Irmã");

        //<====> Imprimindo o Array e o ArrayList para ver como eles ficaram:
        System.out.println("a) Imprimindo posição 0 do Array pra ver se é null: " + familia[0]);
        System.out.println("b) Imprimindo posição 1 do Array pra ver se é item repetido Irmã: " + familia[1]);
        System.out.println("c) Imprimindo a posição 2 do Array para conferir se é Irmã também: " + familia[2]);
        System.out.println("d) Conforme mostrado acima, Array aceita itens repetidos! Agora abaixo vamos checar o LinkedList!");
        System.out.println("e) Imprimindo ArrayList para verificar se tem null ou item repetido: " + familiaArrayList);
        //aceitou os 2! Tanto Array quanto ArrayList aceitaram tanto "null" quanto "itens repetidos"

        System.out.println("----------------------------------------------------------");

        System.out.println("3) Abaixo, selecionando itens específicos--------------");
        //<====> pegando um item específico
        System.out.println("a) Selecionando index 1 do Array: " + familia[1]); //Mãe
        System.out.println("b) Selecionando index 1 do ArrayList: " + familiaArrayList.get(1)); //Mãe //note que isso é um MÉTODO
        System.out.println("c) Note que para selecionar o Array fazemos isso de forma direta, no entanto para selecionar o ArrayList usamos o método GET");

        System.out.println("----------------------------------------------------------");

        System.out.println("4) Abaixo, verificamos o tamanho deles--------------");
        //<====> vendo o tamanho
        System.out.println("a) Selecionando o length do Array: " + familia.length); //4
        System.out.println("b) Selecionando size() do ArrayList: " + familiaArrayList.size()); //4  //note que isso é um MÉTODO
        System.out.println("c) Note que no caso do Array usamos o length, mas no ArrayList usamos .size()");

        System.out.println("----------------------------------------------------------");

        System.out.println("5) Abaixo, tentamos adicionar novos elementos--------------");
        //<====> adicionando um elemento
        //Arrays tem tamanho fixo, então não pode adicionar elemento
        System.out.println("a) Tentamos adicionar mais um elemento no Array, mas não foi possível, pois Arrays não aceitam novos elementos...");
        familiaArrayList.add("Irmão Caçula"); //aqui adicionamos tranquilamente mais um elemento no ArrayList
        System.out.println("b) Adicionamos mais um elemento na ArrayList (o Irmão Caçula): " + familiaArrayList.get(6)); //Irmão Caçula

        System.out.println("----------------------------------------------------------");

        System.out.println("6) Abaixo, tentamos modificar elementos--------------");
        //<====> "seting" (modificando) um elemento
        familia[0] = "Padrasto"; //modificamos a posição 0 do Array (Pai) para Padrasto
        System.out.println("a) Sobreescrevemos a posição 0 do Array, trocando o pai por: " + familia[0]);
        familiaArrayList.set(0, "Padrasto"); //substituímos "pai" por "padrasto"
        System.out.println("b) Sobreescrevemos a posição 0 do ArrayList, trocando o pai por: " + familiaArrayList.get(0));
        //NOte que no caso do ArrayList temos que especificar a posição do índice e o elemento substituído, tudo dentro do método.
        System.out.println("c) Podemos perceber que tanto o Array quanto ArrayList é ok de substituir elementos");

        System.out.println("----------------------------------------------------------");

        System.out.println("7) Abaixo, vamos remover elementos--------------");
        //<====> removendo um elemento
        //o Array tem tamanho fixo, e não pode apagar elementos. Se deletar, ele ainda existe, só que null.
        System.out.println("a) Array tem tamanho fixo em sua criação, então se deletarmos um elemento, o tamanho do Array continua o mesmo (só que posição null)");
        familiaArrayList.remove(0); //apagamos Padrasto (apagamos via número do index no ArrayList)
        familiaArrayList.remove("Mãe"); //apagamos Mãe (apagamos via o próprio nome do Objeto)
        System.out.println("b) Cortamos fora o Padrasto e a mãe da ArrayList, e sobrou agora só os filhos: " + familiaArrayList); //imprime todos, que agora sobrou só os filhos

        //DICA FINAL: Arrays aceitam tipos primitivos, no entanto ArrayList só aceita Objetos.
        // Isso não acaba sendo um grande problema, pois temos Wrappers. Podemos usar tipo "Intenger" ou "Double"
        //e isso o ArrayList vai aceitar igual.

        System.out.println("----------------------------------------------------------");
        System.out.println("8) Finalmente, vamos mudar para LINKEDLIST e ver como se comporta-----------------------------");

        LinkedList<String> familiaLinkedList = new LinkedList<>();

        familiaLinkedList.add("Pai");
        familiaLinkedList.add("Pai");
        familiaLinkedList.add("Pai"); //colocou repetido
        familiaLinkedList.add("Padrasto");
        familiaLinkedList.add("Mãe");
        familiaLinkedList.add("Madrasta");
        familiaLinkedList.add("Caçula");
        familiaLinkedList.add("Irmã");
        familiaArrayList.add(null); //não colocou null
        familiaLinkedList.add("Irmão");

        System.out.println("a) Abaixo vou imprimir todo o LinkedList para checar se aceita itens repetidos e null");
        System.out.println("b) " + familiaLinkedList); //imprimiu na ordem em que foi adicionado, e aceitou itens repetidos, mas não o null


//        Decore da seguinte forma: LIST:
//
//        UMA CARACTERÍSTICA ÚNICA DA LIST é sua capacidade de ser altamente manipulável. As LISTS, tanto no caso de
//        ArrayList como no LinkedList, você pode inserir elementos tanto no começo, no meio ou no final da Coleção.
//        As Interfaces Map e o Set não permitem isso.
//        OUTRA CARACTERÍSTICA DAS LISTS: é que ambas aceitam NULL
//
//        ARRAYLIST -> aceita null. Aceita itens repetidos. O ArrayList é organizado conforme a ordem que os itens
//        foram inseridos (isso é uma qualidade igual a do LinkedLIst). Mas principalmente, o ArrayList é uma
//        alternativa "menos engessada" para Arrays, pois ela permite que você AUMENTE ou DIMINUA o tamanho do
//        ArrayList dependendo das necessidades.
//
//        LINKEDLIST -> NÃO aceita null. Mas aceita itens repetidos. O LINKEDList, como sempre em todos os casos de
//        "Linked", é como uma corrente, ou seja, tudo é organizado conforme a ordem que os elementos foram inseridos.
    }
}
