package com.company;

import java.util.ArrayList;

public class Main extends MyTest {

        public static void main(String[] args) {

            MyTest myTest = new MyTest(); //cria um Objeto "ponteiro" para a Classe (ganha acesso a todos os Métodos)

            ArrayList list = new ArrayList(); //cria um Objeto "ponteiro" para Classe ArrayList.
            list.add("teste"); //adiciona uma String ao Array

            int i_val = 0; //declara valor

            System.out.println("ANTES ---> i_ref = " + list); //imprime Objeto
            System.out.println("ANTES ---> i_val = " + i_val); //imprime valor

            //abaixo, usamos o ponteiro para mudar o Objeto e o valor.
            myTest.testReference(list); //roda Método da classe 'MyTeste', com o objetivo de tentar mudar o Objeto
            myTest.testValue(i_val); //roda Método da classe 'MyTeste', com objetivo de tentar mudar o valor

            System.out.println("DEPOIS ---> i_ref = " + list); //imprime Objeto
            System.out.println("DEPOIS ---> i_val = " + i_val); //imprime valor
        }

        //TODO: referência pode ter problema na hora de mudar, como em clientes etc.
        //TODO: deep copy -> problemas de cópia.

//    Como podemos verificar quando passamos Objetos, ele passa a referência (o endereço do objeto) e consegue alterar
//    normalmente, porém quando utilizamos tipos primitivos, isso não é possível, pois é possível apenas a passagem por valor.

}

