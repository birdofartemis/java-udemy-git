package com.company.ExIniciante;

import java.util.Scanner;

public class StringEx {
    public static void main(String[] args){
        System.out.println(keyWords("O Marco é um cool guy"));
    }

    public static char charString(String name, byte index){
        return name.charAt(index-1);
    }
    public static int intString(String name, byte index){
        return name.charAt(index-1);
    }
    public static int countCharPos(String name, byte initIndex, byte finalIndex){
       return name.codePointCount(initIndex, finalIndex);
    }
    public static void compareStrings(String name1, String name2){
        if(name1.compareTo(name2) > 0){
            System.out.println(name1 + " Is bigger than " + name2);
        }
        else if(name1.compareTo(name2) < 0){
            System.out.println(name2 + " Is bigger than " + name1);
        }
        else{
            System.out.println(name1 + " Is equal to " + name2);
        }
    }
    public static void compareStringsLowCase(String name1, String name2){

        if(name1.compareToIgnoreCase(name2) > 0){
            System.out.println(name1 + " Is bigger than " + name2);
        }
        else if(name1.compareToIgnoreCase(name2) < 0){
            System.out.println(name2 + " Is bigger than " + name1);
        }
        else{
            System.out.println(name1 + " Is equal to " + name2);
        }
    }
    public static String concatenateString(String word1, String word2){
        return word1.concat(word2);
    }
    public static boolean keyWords(String phrase){
        Scanner input = new Scanner(System.in);
        String keyWord;

        System.out.println("Enter the key word: ");
        keyWord = input.next();

        input.close();
        return phrase.contains(keyWord);
    }
}
