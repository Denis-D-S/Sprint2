package com.company;

import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        System.out.println("---------------------------------------");
        System.out.println("1) PROBLEMAS DE ANTIGAMENTE: ");

        //VEJA UM PROBLEMA COMUM QUE JAVA TINHA ANTIGAMENTE:
	    ImprimeInteger printer = new ImprimeInteger(23); //cria Objeto
        printer.imprimir(); //chama método imprimir e imprime "23"

        //OK, mas e se quisermos agora imprimir um Double? Vamos ter que criar uma nova Classe
        //só que dessa vez criada com Double.

        ImprimeDouble printer2 = new ImprimeDouble(23.3333); //cria Objeto
        printer2.imprimir(); //chama método imprimir e imprime 23.333

        //Ok, e se quisermos agora imprimir Strings? Vamos de novo ter que criar uma nova Classe
        //só que dessa vez criada com String

        ImprimeString printer3 = new ImprimeString("Vinte e três"); //cria Objeto
        printer3.imprimir(); //chama método imprimir e imprime "Vinte e três"

        //Percebe o problema? Temos 3 Classes essencialmente iguais, apenas para conseguir imprimir.

        //É PRA ISSO QUE FOI CRIADO O GENERICS!!!!
        //Com o Generics podemos criar apenas uma Classe que seja Flexível para vários Tipos.

        System.out.println("---------------------------------------");
        System.out.println("2) SOLUCIONANDO O PROBLEMA COM GENERICS: ");

        //DICA: Generics não aceita tipos primitivos, apenas Wrappers.
        //Abaixo podemos observar que a Generic aceita vários Tipos:
        Imprime printer4 = new Imprime<>(23); //note que aqui não estamos específicando o TIPO que o Objeto aceita. Então neste caso o "Imprime" aceita QUALQUER TIPO de Objeto.
        printer4.imprima();
        printer4.setAlgoParaImprimir(99.1);
        printer4.imprima();
        printer4.setAlgoParaImprimir("Stringzinha");
        printer4.imprima();

        //acima é como se fosse o "GENERIC JAVASCRIPT", ou seja, ACEITA TUDO.
        //acima estamos usando o Generics meio que de uma forma "errada", pois ele literalmente ACEITA TUDO.
        //e isso pode dar problema. O "mais correto" é criarmos um Objeto de uma Classe Generic e daí definir QUAL TIPO este Objeto pode aceitar. Fixar apenas 1 Tipo.

        System.out.println("---------------------------------------");
        System.out.println("3) ESPECIFICANDO O TIPO DO GENERIC: ");

        //Mas podemos usar o Generics para ESPECIFICAR o Tipo (que é uma forma mais correta), veja:
        Imprime<Integer> printer5 = new Imprime<>(50); //este "Intenger" vira o "<T>" lá da Classe Genérica "Imprime"
        printer5.imprima();
        //agora este Objeto "printer5" só aceita "Integer", e nenhum outro Tipo.
        //Se tentarmos usar Generics para imprimir String, VAI DAR ERRO (veja abaixo)
//        printer5.setAlgoParaImprimir("Tentando String");
//        printer5.imprima();

        //Mas se criarmos uma nova variável, com o tipo String por exemplo, ele aceita
        Imprime<String> printer6 = new Imprime<>("String usando Generics");
        printer6.imprima();

        System.out.println("---------------------------------------");
        System.out.println("4) CRIANDO UM ARRAYLIST QUE SÓ ACEITA OBJETOS 'CAT': ");

        ArrayList<Cat> cats = new ArrayList<Cat>(); //note que só aceita o tipo "Cat"
        cats.add(new Cat("Frajola", "Persa", "Sim, é mamífero"));
        //Abaixo dá erro. Pois estamos especificando que só aceita o Objeto CAT
        //cats.add(new Dog("Rex", "Pitie"));
        System.out.println(cats);

        System.out.println("---------------------------------------");
        System.out.println("5) CRIANDO UM ARRAYLIST QUE ACEITA QUALQUER OBJETO: ");

        //Perceba que abaixo ele aceitou todos os Objetos, misturando Cats e Dogs (e isso tá "errado", não deveria poder)
        ArrayList<Object> cats2 = new ArrayList<>(); //note que aceita "Object", ou seja, aceita Cats e Dogs
        cats2.add(new Cat("Fiufiu", "Pijiji", "Sim, é mamífero"));
        cats2.add(new Dog("Buiu", "Salsicha", "Sim, é mamífero"));
        System.out.println(cats2);

        System.out.println("---------------------------------------");
        System.out.println("6) CRIANDO UMA CLASSE GENERIC 'ANIMAL' CUJOS HERDEIROS SÃO GATOS, CACHORROS, ETC.: ");

        //AGORA VAMOS ALTERAR A CLASSE "IMPRIME" PARA QUE ELA PRINT APENAS DOGS, OU CATS, OU ANIMAIS, ETC.
        //classe+máscara+nome = new classe<>(item passado "Tipo+nome")

        //Note que como Cat e Dog HERDAM da classe Animal, eles podem ser printed....
        ImprimeAnimais<Cat> printAnimalGato = new ImprimeAnimais<>(new Cat("Frajola", "Mistura", "Afirmativo! Este gato também é mamífero"));
        printAnimalGato.imprima(); //imprime Gato 'Cat'
        ImprimeAnimais<Dog> printAnimalCachorro = new ImprimeAnimais<>(new Dog("Apolo", "Misturado", "Afirmativo, este cachorro também é mamífero"));
        printAnimalCachorro.imprima(); //imprime Cachorro 'Dog'

        //abaixo eu estava testando pra ver se "ImprimeAnimais" aceitaria a Classe Pessoa (dica: NÃO ACEITA se não botar o 'extends')
//        ImprimeAnimais<Pessoa> printPessoa = new ImprimeAnimais<Pessoa>(new Pessoa("SIm"));
//        printPessoa.imprima();

        //note que o método "comer" da Classe ImprimeAnimal pode ser aceito por todos seus herdeiros, Dogs ou Cats... O que faz total sentido...
        System.out.println("Testando se Gato consegue acessar o Métododo 'comer' da Classe 'Animal': ");
        printAnimalGato.comer();
        System.out.println("Testando se Cachorro consegue acessar o Métododo 'comer' da Classe 'Animal': ");
        printAnimalCachorro.comer();

        //note que Cat e Dog herdam Animal, e Animal "extend" o Generic da classe "ImprimeAnimais".
        //Então tudo herda corretamente do grande pai "ImprimeAnimais".

        System.out.println("---------------------------------------");
        System.out.println("6) CRIANDO UM MÉTODO GENÉRICO LOGO NA CLASSE MAIN: ");

        //AGORA VAMOS CRIAR UM MÉTODO GENERIC!!! (note que o Método foi declarado fora do Main)

        //abaixo estamos chamando o Método a 'gritar', e podemos passar QUALQUER COISA! String, Intenger, Objetos, tanto faz, aceita tudo.
        gritar("João", 74);
        gritar(42, 74);
        gritar(new Cat("Flufi", "Persa", "SIM, É MAMÍFERO!"), 9);

    }

    //criamos o método GENERIC fora do Main, para podermos chamá-lo dentro do Main.
    //preste atenção na SINTAXE dele. É como se ele recebesse um atributo "genérico" como parâmetro...
    //e este "generic" precisa ser declarado entre "static" e o "void". Bizarro...
    private static <T,V> void gritar(T coisaParaGritar, V outraCoisaGritar){
        System.out.println(coisaParaGritar + "!!!!");
        System.out.println(outraCoisaGritar + "!!!!");
    }
}
