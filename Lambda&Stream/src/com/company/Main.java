package com.company;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {

    interface Num {
        double getValue();
    }

    interface NumericValue{
        boolean checkIfOdd(int n);
    }

    interface NumericValue2{
        boolean checkDivision(int n1, int n2);
    }

    public static void main(String[] args) {

        //EXPRESSÃO LAMBDA UTILIZADA COMO CONSTANTE:
        Num n;
        n = () -> 555.11;
        System.out.println(n); //isso retorna gibberish
        System.out.println("Lambda utilizada como constante: " + n.getValue()); //isso retorna 555.11

        //UTILIZAÇÃO DA CLASSE MATH COM A LAMBDA:
        Num n2 = () -> Math.random() * 100;
        System.out.println("Utilizando Math com a Lambda: " + n2.getValue()); //multiplica número random * 100;

        //EXPRESSÃO LAMBDA PARA VERIFICAR NÚMERO PAR:
        NumericValue isOdd = (int i) -> (i % 2)==0;
        System.out.println("Usando Lambda para verificar se é par: " + isOdd.checkIfOdd(2));
        System.out.println("Usando Lambda para verificar se é par: " + isOdd.checkIfOdd(3));

        //EXPRESSÃO LAMBDA PARA VERIFICAR DOIS NÚMEROS:
        NumericValue2 isDiv = (x,y) -> (x % y)==0; //checa se a divisão entre os 2 números dá valor inteiro
        System.out.println("Checa se a divisão dá valor inteiro: " + isDiv.checkDivision(2,2)); //true = deu valor inteiro
        System.out.println("Checa se a divisão dá valor inteiro: " + isDiv.checkDivision(9,3)); //true = deu valor inteiro
        System.out.println("Checa se a divisão dá valor inteiro: " + isDiv.checkDivision(3,9)); //false = não deu valor inteiro

        System.out.println("------------------------------------------");

        //NOVO TESTE DE LAMBDA:

        //Abaixo, mostra um Runnable de antigamente...
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Olá mundo!");
            }
        }).start();
        //Note que aqui estamos vendo o Override do Runnable de forma clara. Aqui acima fica claro que estamos
        //implementando o método Run().

        //Código acima, só que usado com LAMBDA:
        //note que usando Lambda, o método "Runnable" fica "implicito".
        new Thread(() -> System.out.println("Olá mundo!")).start();

        //Os 2 códigos acima, pro Java, são a mesma coisa. Mas é interessante que fica a pergunta "como que o Java sabe
        //que é o run() que estamos executando?" Isso não está claramente descrito, percebe?
        //Botando o mouse em cima da palavra "Thread", o construtor vai aparecer, e você vai ver o "Runnable" ali, já "implicito".

        //ISSO OCORRE DEVIDO AO SAM - Single Abstract Method - o Runnable é uma interface funcional (que possui apenas 1 único método abstrato)
        //É assim que o Java sabe que o "Thread" contém o método "run()". É por isso que podemos usar Lambda.
        //Basta entrar na documentação. Entra no Thread >> Runnable >> e tá lá o método run();



        //TEORIA: note que a Lambda não foi implementada somente para reduzir a quantidade de código. Outro motivo para
        //ter sido implementada foi o uso de STREAM (fluxo de dados).


        ///////////////////////////ENTEDENDO STREAM E LAMBDA:///////////////////////////////////////////

        //Foi criada a API DE STREAM para o Java.
        //O STREAM permite que, através do método stream(), faz com que qualquer Coleção sejam fontes de dados para Streams


        //PRIMEIRO EXEMPLO DE STREAM:
        List<Integer> asList = Arrays.asList(1,2,3,4);
        asList.stream()
                .filter(e -> e % 2 == 0) //filtra os dados recebidos: apenas números pares
                .forEach(i -> System.out.println("Primeiro exemplo de Stream (pega apenas os pares): " + i)); //para cada item: manda imprimir
        //Note que a Coleção List está sendo usada como fonte de dados para a Stream(), e na sequẽncia usamos Lambda

        System.out.println("------------------------------------------");


        //SEGUNDO EXEMPLO DE STREAM
        System.out.println("Segundo exemplo de Stream: ");
        System.out.println("Como um Interator funcionava no Java 4? Veja abaixo:");
        List<Integer> lista = Arrays.asList(1,5,8,9,1,4,7,6,6,9,9);
        for(Iterator iterator = lista.iterator(); iterator.hasNext();){
            Integer integer = (Integer) iterator.next();
            System.out.println(integer);
        }

        System.out.println("Como um Interator funcionava no Java 5 (usando forEach)? Veja abaixo:");
        List<Integer> lista2 = Arrays.asList(1,5,8,9,1,4,7,6,6,9,9);
        for (Integer integer : lista2){
            System.out.println(lista2.get(integer));
        }

        System.out.println("Como um Interator funcionava no Java 8 (usando Lambda)? Veja abaixo:");
        List<Integer> lista3 = Arrays.asList(1,5,8,9,1,4,7,6,6,9,9);
        lista3.stream().forEach(e -> System.out.println(e));

        System.out.println("------------------------------------------");

        //TERCEIRO EXEMPLO STREAM:
        //Vamos focar em entender as OPERAÇÕES INTERMEDIÁRIAS
        System.out.println("Terceiro exemplo de Stream: ");
        System.out.println("Diferença entre Operações Intermediárias e Final:");
        List<Integer> lista4 = Arrays.asList(1,5,8,9,1,4,7,6,6,9,9);
        lista4.stream()
                .skip(2) //pula os 2 primeiros números
                .limit(7) //limita a leitura até os próximos 7 números
                .distinct() //impede números repetidos (ou seja, vai imprimir o "6" apenas uma vez)
                .forEach(e -> System.out.println(e));
        //Note que o "skip, limit e distinct" são OPERAÇÕES INTERMEDIÁRIAS (são tipo "predicados" eu acho).
        // Estas são as que você pode repetir várias vezes, e ter quantos predicados você quiser.
        //Já o "forEach" é uma OPERAÇÃO FINAL. Você não pode botar mais nada depois dela.
        //Pois o "forEach" entrega uma lista, ou um Objeto novo no final.

        System.out.println("------------------------------------------");

        //QUARTO EXEMPLO DE STREAM:
        //Agora vamos ver as OPERAÇÕES FINAIS.
        System.out.println("Quarto exemplo de Stream: ");
        System.out.println("Testando a OPERAÇÃO FINAL 'forEach': ");
        List<Integer> lista5 = Arrays.asList(1,5,8,9,1,4,7,6,6,9,9);
        lista5.stream()
                .limit(3) //limita apenas a olhar para os 3 primeiros números
                .map(e -> e*2) //método que executa operações caminhando pela lista
                .forEach(e -> System.out.println(e)); //OPERAÇÃO FINAL que entrega algo
        //se você abrir a documentação do "forEach" vai ver que estará escrito "TERMINAL OPERATION".
        //ou seja, não pode ter nada mais depois dele.



        //TODO : DIFERENÇA ENTRE MAP E FLATMAP


        System.out.println("------------------------------------------");

        //QUINTO EXEMPLO DE STREAM
        //Agora vamos armazenar o resultado do forEach em uma variável.
        System.out.println("Quinto exemplo de Stream: ");
        System.out.println("Guardando o resultado do 'forEach' numa variável:");
        List<Integer> lista6 = Arrays.asList(1,5,8,9,1,4,7,6,6,9,9); //variável "lista6"
        Stream<Integer> stream1 = lista6.stream() //variável "stream1"
                .limit(3)
                .map(e -> e*2);

        stream1.forEach(e -> System.out.println(e)); //guarda o resultado do "forEach" na variável "stream1"

        System.out.println("------------------------------------------");

        //SEXTO EXEMPLO DE STREAM
        //Veremos agora o "count", que é outra OPERAÇÃO FINAL
        System.out.println("Sexto exemplo de Stream: ");
        System.out.println("Testando a OPERAÇÃO FINAL 'count': ");
        List<Integer> lista7 = Arrays.asList(1,5,8,9,1,4,7,6,6,9,9); //variável "lista7"
        long testeCount = lista7.stream()  //variável "testeCount"
                .filter(e -> e % 2 == 0) //um filtro que considera e lê apenas números pares
                .count(); //método count() é "final". Ele vai contar o número de elementos que estamos lendo.

        System.out.println(testeCount); //imprimimos a variável e obtemos o resultado "4", pois temos 4 números pares.

        System.out.println("------------------------------------------");

        //SÉTIMO EXEMPLO DE STREAM
        //Veremos agora o MIN (o MAX é a mesma coisa, mas ao contrário)
        System.out.println("Sétimo exemplo de Stream: ");
        System.out.println("Testando a OPERAÇÃO FINAL 'min': "); //O "min" serve para pegar o "menor número".
        List<Integer> lista8 = Arrays.asList(1,5,8,9,1,4,7,6,6,9,9); //variável "lista 8"
        Optional<Integer> testeMin =  lista8.stream()  //variável "testeMin"
                .filter(e -> e % 2 == 0)  //filtro que lê apenas os valores pares da lista8
                .min(Comparator.naturalOrder());
        //O "Comparator" sempre é necessário, pois precisa sempre comparar com algo. Como que ele pode saber o
        //"menor número" se ele não souber com o que ou com quem ele deve comparar?
        //Neste caso acima estamos usando o "Comparator.naturalOrder()", que é um Comparator que já vem implementado.
        //O "naturalOrder" usa o "compareTo" do próprio número da Classe//Wrapper Integer.
        //DICA: o Optional é outra funcionalidade trazida no Java 8, e serve pra não ter que ficar fazendo "se i != null", etc.

        System.out.println(testeMin.get()); //vai retornar "4" pois o menor valor par da lista8 é "4".

        System.out.println("------------------------------------------");

        //OITAVO EXEMPLO DE STREAM
        //Veremos agora como armazenar um novo Array em uma nova Lista usando o COLLECT (exemplo 1)
        System.out.println("Oitavo exemplo de Stream: ");
        System.out.println("Testando a OPERAÇÃO FINAL 'Collect', especificamente o Collectors.toList: ");  //método Collect
        List<Integer> lista9 = Arrays.asList(1,5,8,9,1,4,7,6,6,9,9); //variável "lista 9"
        List<Integer> testeCollect = lista9.stream() //variável "testeCollect"
                .filter(e -> e % 2 == 0) //filtro que lê apenas os valores pares da lista9
                .collect(Collectors.toList()); //coleta e cria uma nova COLEÇAO, que podemos atribuir a variável em que estamos
        //A Classe Collectors possui vários métodos que utilizam OPERAÇÕES DE REDUÇÃO que visam criar COLEÇÕES.

        System.out.println(testeCollect); //imprime a variável "testeCollect" vai retornar um Array de números pares.

        System.out.println("------------------------------------------");

        //NONO EXEMPLO DE STREAM
        //Veremos agora como armazenar um novo Array em uma nova Lista usando COLLECT (exemplo 2)
        System.out.println("Nono exemplo de Stream: ");
        System.out.println("Testando a OPERAÇÃO FINAL 'Collect', especificamente o Collectors.groupingBy: ");  //método Collect
        List<Integer> lista10 = Arrays.asList(1,5,8,9,1,4,7,6,6,9,9); //variável "lista 10"
        Map<Boolean, List<Integer>> testeCollect2 = lista10.stream()  //variável "testeCollect2"
                .map(e -> e*3) //multiplica os elementos por 3
                .collect(Collectors.groupingBy(e -> e % 2 == 0)); //agrupa por pares. Então pares serão "true" e impares serão "false"
        //dentro dos parenteses está a lógica de "o que será considerado como "true" no groupingBy".
        //Ou seja, é a lógica de como deve ser feito o agrupamento das Coleções que serão criadas.

        //Note que um programador experiente já vai saber que para usar o "groupingBy", o MAP com <BOOLEAN> e <LIST>
        //é uma boa alternativa, pois vai nos permitir retornar "TRUE=LISTA" E "FALSE=LISTA".
        //Isso se pega com muita prática e treinamento... bem legal...

        System.out.println(testeCollect2);

    }
}
