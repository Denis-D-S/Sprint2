package com.company;

public class Main {

    public static void main(String[] args) {


        System.out.println("1) PRIMEIRO EXEMPLO 'NumberFormatException' ---------------------------");
        try{
            int numeroInteiro = Integer.parseInt("calças");
            System.out.println("Será que eu vou rodar?");
        } catch (NumberFormatException e){
            System.out.println("Não é possível transformar a String 'calças' em um número!");
            //e.printStackTrace(); //este comando mostra a mensagem de erro normal.
        } finally {
            System.out.println("Olá! Eu sou o 'finally', e SEMPRE vou rodar. ");
        }
        System.out.println("Olá! Eu estou fora do bloco das exceptions!");

        System.out.println("******************************************************");

        System.out.println("2) SEGUNDO EXEMPLO 'ArrayIndexOutOfBoundsException' ---------------------------");
        try{
            int [] meuArray = {1,2,3};
            System.out.println(meuArray[10]);
        }catch (Exception e){
            System.out.println("Algo aconteceu de errado!");
            //e.printStackTrace();
        }finally {
            System.out.println("Olá! Eu sou o 'Finally' deste bloco!");
        }

        System.out.println("******************************************************");

        System.out.println("3) TERCEIRO EXEMPLO: brincando com 'returns' num Método ---------------------------");
        //AQUI CHAMAMOS O MÉTODO "imprimaNumero()"
        System.out.println(imprimaNumero()); //retorna "5";

        System.out.println("******************************************************");

        System.out.println("4) QUARTO EXEMPLO: testando o 'throw' ---------------------------");
        checaIdade(15);

    } //aqui termina o método MAIN


    //MÉTODO "imprimaNumero"
    private static int imprimaNumero() {
        try {
            return 3;
        } catch (Exception e) {
            return 4;
        } finally {
            return 5; //como nenhuma exception é encontrada, retorna "5".
        }
    }

    //MÉTODO "checaIdade"
    static void checaIdade(int idade){
        try{
            if (idade>18){
                System.out.println("Acesso permitido. Você tem mais de 18 anos.");
            } else{
                throw new ArithmeticException(); //caso seja menor de idade, JOGUE UMA EXCEÇÃO ARITMÉTICA
            }
        }catch (ArithmeticException e){ //a "Exceção Aritmética" acaba sendo acapturada e tratada aqui!
            System.out.println("Acesso negado. Você precisa ser maior de 18 anos!");
        }
    }


} //aqui termina a Classe Main


