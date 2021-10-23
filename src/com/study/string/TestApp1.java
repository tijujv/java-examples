package com.study.string;
import java.util.Arrays;
import java.util.List;

public class TestApp1 {

    public static void main(String[] args) {

        //String alpha = "ARS,AUD,BGN,BRL,CAD,CNY,CZK,DKK,EUR,HKD,HUF,ISK,INR,JPY,MYR,MXN,NZD,NOK,PLN,RON,SEK,SGD,ZAR,CHF,TWD,THB,GBP,USD,PHP";

        
        String alpha = "GBP,ARS,AUD,BGN,BRL,CAD,CNY,CZK,DKK,EUR,HKD,HUF,ISK,INR,JPY,MYR,MXN,NZD,NOK,PLN,RON,SEK,SGD,ZAR,CHF,TWD,THB,USD,COP,RUB,HRK,PKR,BDT,PYG,PAB,CRC,BOB,UYU,CLP,ARS,AUD,BGN,BRL,CAD,CNY,CZK,DKK,EUR,EUR,EUR,EUR,EUR,EUR,HKD,HUF,ISK,INR,JPY,MYR,MXN,NZD,NOK,PLN,RON,SEK,SGD,ZAR,CHF,TWD,THB,USD,COP,RUB,HRK,PKR,BDT,PYG,PAB,CRC,BOB,UYU,CLP";
		//Remove whitespace and split by comma
        List<String> result = Arrays.asList(alpha.split("\\s*,\\s*"));

        System.out.println(result);
        
        result.stream().distinct().sorted().forEach(e -> System.out.print(e + ","));
    }

}