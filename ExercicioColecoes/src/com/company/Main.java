package com.company;

//Dado os seguintes objetos abaixo realizar as seguintes buscar.
//
//        1) Ordernar por orderm alfabetica.
//        2) Ordernar por ordem de salario.
//        3) Trazer os 3 primeiros por ordem alfabetica.
//        4) Trazer os 3 primeiros por ordem de salario.
//        5) Trazer o maior salario da profissao DESENVOLVEDOR.
//        6) Trazer o maior salario da profissao GERENTE.
//        5) Trazer o maior salario da profissao ANALISTA.
//        6) Trazer os 3 maiores salarios da profissao DESENVOLVEDOR.
//        7) Trazer os 3 primeiros profissionais que tenham o nome que começa com a letra "b" e "k".
//        8) Trazer todos profissionais que tem o nome que termina com a letra "d" e "e"
//        9) Trazer os 6 maiores salarios Masculino.
//        10) Trazer os 6 maiores salarios feminino.
//        11) Criar grupos de Map com as profissoes e pessoas ex de como deve ficar --> Map<Professional, List<Person>>
//        12) Criar uma lista aplicando 10% de aumento para profissionais DESENVOLVEDOR do sexo feminino.
//        13) Trazer os 3 maiores salarios da profissao GERENTE
//        14) Criar um Map com as profissoes ex: Map<Professional, List<Person>>


import java.math.BigDecimal;
import java.util.List;

public class Main {

    public static void main(String[] args) {

//        Profissões :
        new Professional(1, "DESENVOLVEDOR", BigDecimal.valueOf(3500.00));
        new Professional(1, "GERENTE", BigDecimal.valueOf(2900.00));
        new Professional(1, "ANALISTA", BigDecimal.valueOf(3800.00));


        var people =
                List.of (
                        new Person("Faizah Ballard", SexEnum.MALE, new Professional(1, "ANALISTA", BigDecimal.valueOf(3500.00))),
                        new Person("Anna Harmon", SexEnum.FEMALE, new Professional(1, "DESENVOLVEDOR", BigDecimal.valueOf(2500.00))),
                        new Person("Rumaysa Schwartz", SexEnum.FEMALE, new Professional(1, "ANALISTA", BigDecimal.valueOf(1500.00))),
                        new Person("Kobi Love", SexEnum.MALE, new Professional(1, "DESENVOLVEDOR", BigDecimal.valueOf(1800.00))),
                        new Person("Ralph Stokes", SexEnum.MALE, new Professional(1, "DESENVOLVEDOR", BigDecimal.valueOf(6500.00))),
                        new Person("Emmanuel Hammond", SexEnum.MALE, new Professional(1, "DESENVOLVEDOR", BigDecimal.valueOf(4500.00))),
                        new Person("Anthony Bird", SexEnum.MALE, new Professional(1, "DESENVOLVEDOR", BigDecimal.valueOf(4500.00))),
                        new Person("Jerome Frye", SexEnum.MALE, new Professional(1, "GERENTE", BigDecimal.valueOf(7500.00))),
                        new Person("Sama Keith", SexEnum.MALE, new Professional(1, "DESENVOLVEDOR", BigDecimal.valueOf(8500.00))),
                        new Person("Alanna Sharp", SexEnum.FEMALE, new Professional(1, "GERENTE", BigDecimal.valueOf(3500.00))),
                        new Person("Husna Suarez", SexEnum.FEMALE, new Professional(1, "DESENVOLVEDOR", BigDecimal.valueOf(8500.00))),
                        new Person("Alisha Pope", SexEnum.FEMALE, new Professional(1, "GERENTE", BigDecimal.valueOf(83500.00))),
                        new Person("Toni Rawlings", SexEnum.MALE, new Professional(1, "DESENVOLVEDOR", BigDecimal.valueOf(32500.00))),
                        new Person("Piotr Harwood", SexEnum.MALE, new Professional(1, "GERENTE", BigDecimal.valueOf(13500.00))),
                        new Person("Roy Dean", SexEnum.MALE, new Professional(1, "DESENVOLVEDOR", BigDecimal.valueOf(23500.00))),
                        new Person("Chelsea Molina", SexEnum.FEMALE, new Professional(1, "DESENVOLVEDOR", BigDecimal.valueOf(3500.00))),
                        new Person("Michelle Schneider", SexEnum.FEMALE, new Professional(1, "DESENVOLVEDOR", BigDecimal.valueOf(2500.00))),
                        new Person("Joshua Graham", SexEnum.MALE, new Professional(1, "DESENVOLVEDOR", BigDecimal.valueOf(1500.00))),
                        new Person("Orlando Dennis", SexEnum.MALE, new Professional(1, "DESENVOLVEDOR", BigDecimal.valueOf(1800.00))),
                        new Person("Emily-Rose Castro", SexEnum.MALE, new Professional(1, "ANALISTA", BigDecimal.valueOf(6500.00))),
                        new Person("Joshua Graham", SexEnum.MALE, new Professional(1, "DESENVOLVEDOR", BigDecimal.valueOf(4500.00))),
                        new Person("Beulah Laing", SexEnum.MALE, new Professional(1, "DESENVOLVEDOR", BigDecimal.valueOf(4500.00))),
                        new Person("Joy Perkins", SexEnum.MALE, new Professional(1, "DESENVOLVEDOR", BigDecimal.valueOf(7500.00))),
                        new Person("Kevin Herring", SexEnum.MALE, new Professional(1, "DESENVOLVEDOR", BigDecimal.valueOf(8500.00))),
                        new Person("Anaya Portillo", SexEnum.FEMALE, new Professional(1, "DESENVOLVEDOR", BigDecimal.valueOf(3500.00))),
                        new Person("Dalia Bowler", SexEnum.FEMALE, new Professional(1, "DESENVOLVEDOR", BigDecimal.valueOf(8500.00))),
                        new Person("Joy Perkins", SexEnum.MALE, new Professional(1, "DESENVOLVEDOR", BigDecimal.valueOf(983500.00))),
                        new Person("Nikodem Peralta", SexEnum.MALE, new Professional(1, "ANALISTA", BigDecimal.valueOf(32500.00))),
                        new Person("Vikram Sharpe", SexEnum.MALE, new Professional(1, "DESENVOLVEDOR", BigDecimal.valueOf(13500.00))),
                        new Person("Kenya Hyde", SexEnum.FEMALE, new Professional(1, "DESENVOLVEDOR", BigDecimal.valueOf(23500.00))),
                        new Person("Mahnoor Eaton", SexEnum.MALE, new Professional(1, "GERENTE", BigDecimal.valueOf(3500.00))),
                        new Person("Joao Carlos", SexEnum.MALE, new Professional(1, "GERENTE", BigDecimal.valueOf(6500.00))),
                        new Person("Dewi Hayward", SexEnum.MALE, new Professional(1, "GERENTE", BigDecimal.valueOf(4500.00))),
                        new Person("Ruben Gomez", SexEnum.MALE, new Professional(1, "GERENTE", BigDecimal.valueOf(1500.00))),
                        new Person("Winifred Patel", SexEnum.MALE, new Professional(1, "GERENTE", BigDecimal.valueOf(2500.00))),
                        new Person("Kevin Herring", SexEnum.MALE, new Professional(1, "GERENTE", BigDecimal.valueOf(3800.00))),
                        new Person("Mariah Odom", SexEnum.FEMALE, new Professional(1, "GERENTE", BigDecimal.valueOf(3590.00))),
                        new Person("Khadija Hopkins", SexEnum.FEMALE, new Professional(1, "GERENTE", BigDecimal.valueOf(8500.00))),
                        new Person("Dennis Blaese", SexEnum.MALE, new Professional(1, "GERENTE", BigDecimal.valueOf(983580.00))),
                        new Person("Chloe Collins", SexEnum.MALE, new Professional(1, "GERENTE", BigDecimal.valueOf(32530.00))),
                        new Person("Maria Bouvet", SexEnum.MALE, new Professional(1, "GERENTE", BigDecimal.valueOf(13500.00))),
                        new Person("Maisie Oneill", SexEnum.FEMALE, new Professional(1, "GERENTE", BigDecimal.valueOf(23500.00))),
                        new Person("Lilliana Davison", SexEnum.FEMALE, new Professional(1, "GERENTE", BigDecimal.valueOf(3510.00))),
                        new Person("Bryn Ellwood", SexEnum.MALE, new Professional(1, "ANALISTA", BigDecimal.valueOf(6500.00))),
                        new Person("Benjamin Prentice", SexEnum.MALE, new Professional(1, "ANALISTA", BigDecimal.valueOf(4502.00))),
                        new Person("Malia Povey", SexEnum.FEMALE, new Professional(1, "ANALISTA", BigDecimal.valueOf(2501.00))),
                        new Person("Lidia Walters", SexEnum.FEMALE, new Professional(1, "ANALISTA", BigDecimal.valueOf(3510.00))),
                        new Person("Kaison Brooks", SexEnum.MALE, new Professional(1, "ANALISTA", BigDecimal.valueOf(510.00))),
                        new Person("Billy Gomez", SexEnum.MALE, new Professional(1, "ANALISTA", BigDecimal.valueOf(6510.00))),
                        new Person("Iolo Horne", SexEnum.MALE, new Professional(1, "ANALISTA", BigDecimal.valueOf(9510.00))),
                        new Person("Boris Mcgrath", SexEnum.MALE, new Professional(1, "ANALISTA", BigDecimal.valueOf(283100.00))),
                        new Person("Ebonie Bowden", SexEnum.FEMALE, new Professional(1, "ANALISTA", BigDecimal.valueOf(12510.00))),
                        new Person("Will Hamilton", SexEnum.MALE, new Professional(1, "ANALISTA", BigDecimal.valueOf(3510.00))),
                        new Person("Arielle Yu", SexEnum.FEMALE, new Professional(1, "ANALISTA", BigDecimal.valueOf(25520.00))),
                        new Person("Roosevelt Fraser", SexEnum.FEMALE, new Professional(1, "ANALISTA", BigDecimal.valueOf(4520.00)))
                );

    }


}
