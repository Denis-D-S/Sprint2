package com.company;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.TreeMap;

public class Main {

    public static void main(String[] args) {

        System.out.println("----------------------------------------------------------");
        System.out.println("-----------------------------HASHMAP-----------------------------");

        HashMap<String, Integer> funcionariosHashMap = new HashMap<>();
        //Neste caso, String = Keys e Intenger = Values. Mas se invertesse, seria o contrário.

//                             Key   |  Value
//        linha     String(nomes)	 |   Integer(IDs)
//        linha	           Pedro	 |    1
//        linha             Paulo    |    2


        funcionariosHashMap.put("João", 1);
        funcionariosHashMap.put("João", 4); //pode repetir keys, mas daí João acaba sendo sobreescrito
        funcionariosHashMap.put("Carlos", 2);
        funcionariosHashMap.put ("Jarbas", 3);
        funcionariosHashMap.put(null, null); //note que HashMap aceita Null
        funcionariosHashMap.put("Adão", 4); //note que pode repetir os Values também (is IDs)

        System.out.println(funcionariosHashMap); //imprime {null=null, João=1, Jarbas=3, Carlos=2}
        //note que imprimiu tudo numa ordem estranha, que não dá pra inferir a lógica.
        // E imprimiu "null" (ou seja, aceita "null")
        System.out.println("DICA: note que o Map modifica a ordem da Coleção (A não ser que seja o LinkedHashMap, daí não modifica a ordem)");

        System.out.println("----------------------------------------------------------");

        System.out.println("1) Checando itens da nossa lista: ");
        System.out.println("Qual o Value (ID) do Carlos? " + funcionariosHashMap.get("Carlos")); //imprime 2 (ID do Carlos)
        //Note abaixo que usamos "Key" para validar o "nome", e "Value" para validar o "ID"
        System.out.println("O nome Diego é uma key da nossa coleção? " + funcionariosHashMap.containsKey("Diego"));
        //Acima imprime "false" pois o Key "Diego" não existe
        System.out.println("Nossa coleção contém o valor numérico 3? " + funcionariosHashMap.containsValue(3));
        //imprime "true" pois o valor "3" está no HashMap

        //E como posso Override alguma informação do HashMap?
        System.out.println("2) Abaixo, vamos tentar sobreescrever itens usando 'put': ");
        funcionariosHashMap.put("João", 8);
        System.out.println("Fiz um put sobreescrevendo João. Qual o novo valor numérico do João? (fiz put+get)");
        System.out.println(funcionariosHashMap.get("João")); //vai retornar 8 pois o número original foi trocado


        //Note que o "replace" abaixo serve só para substituir. Diferente do "put", ele não adiciona novos elementos
        System.out.println("3) Agora vamos usar 'replace' para substituir itens: ");
        funcionariosHashMap.replace("João", 717171717);
        funcionariosHashMap.replace("Papa Francisco", 777); //Papa Francisco não foi adicionado ao Array, pois não existe "Papa Francisco" no original
        System.out.println("Fiz replace em João (que já existia no map) e replace em Papa Francisco (que ainda não existia no map)" +
                ". Como ficou a Coleção?");
        System.out.println(funcionariosHashMap); //{null=null, Adão=4, João=717171717, Jarbas=3, Carlos=2}
        //Note que "João" foi substituído, mas "Papa Francisco" não, pois este segundo não existia no map.

        System.out.println("4) Agora removeremos o João: ");
        funcionariosHashMap.remove("João"); //remove João.
        System.out.println("Removi o João com 'remove'. Veja como ficou a Coleção abaixo: ");
        System.out.println(funcionariosHashMap); //ok. João foi de fato removido


        System.out.println("----------------------------------------------------------");
        System.out.println("-----------------------------LINKEDHASHMAP-----------------------------");

        LinkedHashMap<String,Integer> funcionariosLinkedHashMap = new LinkedHashMap<>();

        funcionariosLinkedHashMap.put("João", 1);
        funcionariosLinkedHashMap.put("João", 4); //pode repetir keys, mas daí João acaba sendo sobreescrito
        funcionariosLinkedHashMap.put("Carlos", 2);
        funcionariosLinkedHashMap.put ("Jarbas", 3);
        funcionariosLinkedHashMap.put(null, null); //note que HashMap aceita Null

        System.out.println(funcionariosLinkedHashMap);
        System.out.println("Note que não aceitou repetição, mas aceitou o null. E note que a ordem ficou a mesma ordem" +
                "em que os elementos foram adicionados...");


        System.out.println("----------------------------------------------------------");
        System.out.println("-----------------------------TREEMAP-----------------------------");

        //TODO : PROCURE COMPARATOR, EXEMPLOS DE FUNCIONAMENTO. SÓ OS TREES TEM COMPARATORS!!!!

        TreeMap<String,Integer> funcionariosTreeMap = new TreeMap<>();

        funcionariosTreeMap.put("João", 1);
        funcionariosTreeMap.put("João", 4); //pode repetir keys, mas daí João acaba sendo sobreescrito
        funcionariosTreeMap.put("Carlos", 2);
        funcionariosTreeMap.put ("Jarbas", 3);
   //     funcionariosTreeMap.put(null, null); //note que HashMap aceita Null

        System.out.println(funcionariosTreeMap);
        System.out.println("Note que não aceitou repetido e nem null. Note também que a ordem foi modificada. " +
                "O TreeMap é o mais 'cricri' e organizadinho dos 3");

        //TODO: veja entrySet que ele transforma em tipo array e bota um do lado do outro
        System.out.println("Testando entrySet " + funcionariosTreeMap.entrySet());
        ;

        System.out.println("----------------------------------------------------------");
    }

//    Decore da seguinte forma: MAP:

    //NOTE QUE A PRINCIPAL CARACTERÍSTICA DO MAP É O USO DE key+value EM TODOS OS CASOS!!!!
    //ISSO PERMITE UMA ORGANIZAÇÃO ÚNICA ENTRE 2 TIPOS DE OBJETOS (ou Wrappers)!!!!
//
//    LINKED (mais caótico) -> Aceita null. Sobreescreve valores repetidos. Linked, como semrpe, ignifica que é uma
//    corrente. Vai linkar todos os elementos na ordem que eles foram criados.
//
//    HASH (médio) -> aceita null. Sobreescreve valores repetidos. Faz sua própria organização. O computador vai
//    organizar na forma mais eficiente.
//
//    TREE (é o mais organizadinho) -> NÃO aceita null. Sobreescreve valores repetidos. TUDO é reestruturado na ordem
//    mais eficiente. Neste caso PARECE ser alfabética.
}
