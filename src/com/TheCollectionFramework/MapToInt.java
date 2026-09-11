package com.TheCollectionFramework;

import java.util.*;

public class MapToInt
{
    public static void main(String[] args)
    {
        List<Character> list = Arrays.asList('1','a','d');

        int max = list.stream()
                .mapToInt(x -> x)
                .max()
                .orElseThrow(()->new RuntimeException("this is issue null returning"));

        System.out.println("max : "+(char)max);

    }
}

