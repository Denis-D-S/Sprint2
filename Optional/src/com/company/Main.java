package com.company;

import java.util.Optional;

public class Main {

    public static void main(String[] args) {
        //ANTIGAMENTE:
        System.out.println("Antigamente: ");
        String s = "1"; //passa uma string
        Integer numero = converteEmNumero(s);  //chama a função e coloca numa variável
        System.out.println("Imprime o valor de antigamente: " + numero); //imprime "1"

        System.out.println("*****************************");

        //HOJE EM DIA (exemplo):
        System.out.println("Hoje em dia: ");

        System.out.println("Exemplo 1: ");
        String s1 = "1"; //aqui retorna Array[1] //se aqui trocarmos o "1" por "olá" vamos cair na exceção "empty" que criamos no método
        Optional<Integer> numero1 = converteEmNumero2(s1); //com o Objeto Optionals ganhamos vários Métodos disponíveis
        System.out.println("Verifica se o Optional conseguiu converter o número (true) ou não (false): " + numero1.isPresent()); //imprime "true", pois se presente o int no Optional, então retorna"true"
        System.out.println("Retorna o número tratado pelo Optional: " + numero1.get()); //imprime "1"  //note que como é Optional, precisa usar método get()

        System.out.println("*****************************");

        //HOJE EM DIA (exemplo2) - demonstrando o 'isPresent':
        System.out.println("Exemplo 2: ");
        String s2 = "Olá"; //aqui retorna .empty
        Optional<Integer> numero2 = converteEmNumero2(s2);
        System.out.println("Verifica se o Optional conseguiu converter o número (true) ou não (false): " + numero2.isPresent()); //imprime "false", pois se NÃO presente o int no Optional, então retorna"false"
        //System.out.println(numero2.get()); //aqui dá erro pois não tem valor dentro do Optional

        System.out.println("*****************************");

        //HOJE EM DIA (exemplo3) - demonstrando o 'ifPresent' com um número inteiro presente:
        System.out.println("Exemplo 3: ");
        String s3 = "1"; //aqui retorna Array[1]
        Optional<Integer> numero3 = converteEmNumero2(s3);
        System.out.print("Retorna o número \"1\" se for true (caso um número inteiro esteja presente): ");
        numero3.ifPresent(n -> System.out.println(n)); //retorna "1", pois o número inteiro está presente (venho da função lá embaixo)

        System.out.println("*****************************");

        //HOJE EM DIA (exemplo4) - demonstrando o 'ifPresent' com uma String presente (dá erro):
        System.out.println("Exemplo 4: ");
        String s4 = "Olá"; //aqui retorna .empty
        Optional<Integer> numero4 = converteEmNumero2(s4);
        numero4.ifPresent(n -> System.out.println(n));
        System.out.println("Aqui retorna NADA, nada é impresso,pois o número inteiro NÃO está presente,no lugar de um inteiro estamos recebendo um \".empty\" (venho da função");

        System.out.println("*****************************");

        //HOJE EM DIA (exemplo5) - concatenando valores na hora de imprimir:
        System.out.println("Exemplo 5: ");
        //vamos reduzir mais ainda pro código ficar ainda mais reduzido.
        String s5 = "1";
        System.out.print("Se houver um número então ele vai imprimir \"Teste1\" conforme especificado: ");
        converteEmNumero2(s5).ifPresent(n -> System.out.println("Teste" + n));
        //aqui retorna "Teste1", que é a String+n aí, ou seja, está reconhecendo o número e retornando o valor.
        //a única diferença é que agpra não estamos guardando o método em uma variável.

        System.out.println("*****************************");

        //HOJE EM DIA (exemplo6) - testando o 'isEmpty' e o 'orElse' para tratamento de erro:
        System.out.println("Exemplo 6: ");
        String s6 = "Olá";
        Boolean numero6 = converteEmNumero2(s6).isEmpty();
        System.out.println("Retornou '.empty'?: " + numero6);
        Integer numero5 = converteEmNumero2(s6).orElse(2);
        System.out.print("Se houver um número, então imprime o número, mas se não houver número, então deve retornar \"2\": ");
        System.out.println(numero5);
        //"tente rodar o método(que checa se tem inteiro), e se não rolar, me devolva o número "2" e imprima"
        //então agora, ao invés de não retornar nada quando ele não encontra um inteiro, com o "orElse" podemos
        // mandar ele retornar o número "2"
        //Isso é interessante para quando um método pode nos retornar um valor null. Daí ao ivés de fazermos o "if null"
        // e tal, podemos simplesmente usar o "orElse" e definir qual valor queremos que retorne caso seja null
        //Dá pra usar o "orElseGet" também ali, ao invés do "orElse". Este segundo método vai rodar uma função lambda
        //ao invés de te devovler apenas um número, então você pode definir qualquer coisa para acontecer caso
        //o método original te retorne ".empty".

//        //HOJE EM DIA (exemplo7):
//        System.out.println("Exemplo 7: ");
//        String s7 = "Olá";
//        Integer numero6 = converteEmNumero2(s7)
//                .orElseThrow(() -> new NullPointerException("Valor vazio"));
//        System.out.println(numero6);
//        //O "orElseThrow" pode servir para jogar uma exception, uma mensagem de erro. Mas para fazer isso, devemos
//        //escrever uma lambda ali dentro como função para lançar a exception.



    }

    //ANTIGAMENTE:
    public static Integer converteEmNumero(String numeroStr){ //chamada função e passa parâmetro
        return Integer.valueOf(numeroStr); //retorna método "valueOf", que converte um Objeto em String
        //    Na verdade o Integer.valueOf(String) retorna um new Integer(Integer.parseInt(String)).
        //    Então ele usa Integer.parseInt(String) dentro dele próprio.
    }

    //HOJE EM DIA:
    public static Optional<Integer> converteEmNumero2 (String numeroStr) { //chama a função (usando Optional) e passa parâmetro
        //Se for passado um Int lá na chamada da função, retorna um Array[], mas se for passado uma String, volta .empty
        //(veja abaixo)
        try {
            Integer numeroQualquer = Integer.valueOf(numeroStr); //guarda numa variável a conversão/método "valueOf"
            return Optional.of(numeroQualquer); //retorna um Optional, que pode ser um Array numérico "[1]"
        } catch(Exception e){
            return Optional.empty(); //retorna um Optional, que pode ser ".empity" ()
        }
    }

    //DICA: existem loops implicitos e loops explicitos. FOR, FOREACH, etc.
    //aqui, no OPTIONALS, é como se fosse um IF implicito. Pois IF existir um número, então retorna tal coisa,
    //mas IF não existir o número ali dentro, então retorna outra coisa (neste nosso caso, retorna nada)
    //Não estamos, no Optionals, escrevendo exatamente "if", mas existe um "if" por baixo dos panos que faz ele funcionar


    //parei no vídeo "Pare de retornar NULL, use OPTIONAL", do canal RinaldoDev
    //parei nos 9:00


}
