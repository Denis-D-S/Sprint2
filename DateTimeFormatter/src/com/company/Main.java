package com.company;

import java.sql.Time;
import java.time.DayOfWeek;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;
import java.time.format.TextStyle;
import java.util.Locale;

public class Main {

    public static void main(String[] args) {

        System.out.println("--------------------------------");
        System.out.println("1) Imprime hora local segundo o relógio interno do PC-------------");
        LocalDateTime horaLocal = LocalDateTime.now();
        System.out.println("a) " + horaLocal);

        System.out.println("--------------------------------");

        System.out.println("2) Usando Métodos de Tempo e Datas-------------");

        //TODO: TIMEZONE

        //A variável "horaLocal" será muito útil em tod o o código, pois ela pega qual a hora atual segundo o relógio interno do pc.
        DayOfWeek diaDaSemana = horaLocal.getDayOfWeek(); //DICA: "DayOfWeek" é um ENUM que possui os 7 dias da semana dentro dele.
        System.out.println("a) Imprime o dia da semana: " + diaDaSemana); //imprime "MONDAY"
        int hora = horaLocal.getHour(); //seleciona a hora segundo relógio interno
        int minutos = horaLocal.getMinute(); //seleciona os minutos segundo relógio interno
        int ano = horaLocal.getYear(); //seleciona os anos segundo o relógio interno
        System.out.println("b) " + hora + ":" +  minutos + ":" + ano);

        //use CONTROL+P no método e podemos ver que ele exige 2 ENUNS, TextStyle e Locale. Dá pra brincar com o resultado da impressão
        String mostraNome = diaDaSemana.getDisplayName(TextStyle.FULL, Locale.ENGLISH);
        System.out.println("c) " + mostraNome);
        String mostraNome2 = diaDaSemana.getDisplayName(TextStyle.SHORT, Locale.ENGLISH);
        System.out.println("d) " + mostraNome2);
        String mostraNome3 = diaDaSemana.getDisplayName(TextStyle.NARROW, Locale.ENGLISH);
        System.out.println("e) " + mostraNome3);

        System.out.println("--------------------------------");

        System.out.println("3) Usando DATE TIME FORMATTER-------------");

        String padraoData = "yyyy MM dd"; //note os "MM" maiúsculo. O PADRÃO precisa ser digitado corretamente para o DateTimeFormatter entender depois
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern(padraoData); //"DateTimeFormatter" é uma Classe FINAL usada para formatar,imprimir e "parsing" "Objetos de data" (que inclui Objetos da classe/wrapper String)
        String dataFormatada = horaLocal.format(dtf); //note que o método "format" pede um "DateTimeFormatter" como parâmetro... Perceba também que voltamos a usar a variável "horaLocal", para pegarmos a hora do relógio interno do pc
        System.out.println("a) Data no formato americano: " + dataFormatada); //imprime a data certinho.

        String padraoDataBrasileiro = "dd MM yyyy";
        DateTimeFormatter dtfBrasileiro = DateTimeFormatter.ofPattern(padraoDataBrasileiro);
        String dataFormatadaBrasileira = horaLocal.format(dtfBrasileiro);
        System.out.println("b) Data no formato brasileiro: " + dataFormatadaBrasileira); //imprime a data brasileira certinho

        String padraoDataBrasileiro2 = "dd / MMMM / yy"; //ao colocar 2 "y" e 4 "MMMM", o que é printed muda.
        DateTimeFormatter dtfBrasileiro2 = DateTimeFormatter.ofPattern(padraoDataBrasileiro2);
        String dataFormatadaBrasileira2 = horaLocal.format(dtfBrasileiro2);
        System.out.println("c) Data no formato brasileiro: " + dataFormatadaBrasileira2); //imprime a data brasileira certinho


    }
}
