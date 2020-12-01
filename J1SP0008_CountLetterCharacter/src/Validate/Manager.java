/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Validate;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author hi
 */
//32 = blank
public class Manager {
    //The type of array that i need
    //user input
    String [] wordString;

    //turn it
    ArrayList<String> userStringX = new ArrayList<>();
    ArrayList<Character> userCharater = new ArrayList<>();

    
    //Backup save
    char [] letterStringMedi;
    ArrayList<Character> letterString = new ArrayList<>();
    
    //The number of unique letter and number
    ArrayList<String> uniqueWordString;
    ArrayList<Character> uniqueLetterString = new ArrayList<>();
    
    //The number of letter and number
    int [] wordNumer;
    int[] letterNumber;
    
    //Getting the user input
    public void getUserString(){
        Validator val = new Validator();
        String x;
        
        
        //get the user string;
        x = val.userString();
        //h
        
        //separate them into two type word and letter
        wordString = x.split(" ");
        for(int i = 0 ; i < wordString.length;i++){
            if(wordString[i].length() > 1){
                userStringX.add(wordString[i]);
            }
        }
        
        uniqueWordString = getUniqueWord(userStringX);
        wordNumer = countWord(wordString, uniqueWordString);
        
        
        
        
        
        //getting the letter
        for(int i = 0; i < x.length(); i++){
            if(x.charAt(i) != 32){
                letterString.add(x.charAt(i));  
            }
        }
        
        letterStringMedi = new char[letterString.size()];
        for(int i = 0; i < letterString.size();i++){
            letterStringMedi[i] = letterString.get(i);
        }
        
        uniqueLetterString = getUniqueLetter(letterString);  
        
        //ARE YOU KIDDING ME THIS AGAIN REALYY!!!!!!!!
//        for(int i = 0; i < letterString.size(); i++){
//            
//            System.out.println(letterString.get(i));
//        }  
//        letterString.clear();
//        for(int i = 0; i < x.length(); i++){
//            if(x.charAt(i) != 32){
//                letterString.add(x.charAt(i));  
//            }
//        }
        letterNumber = countLetter(letterStringMedi, uniqueLetterString);



//        Print out the word and letter with their number
        System.out.println("The number of word");
        printWord(uniqueWordString, wordNumer);
        System.out.println("");
        System.out.println("The number of letter");
        printLetter(uniqueLetterString, letterNumber);
        System.out.println("");
        
        
//    ArrayList<String> userStringX = new ArrayList<>();
//    ArrayList<Character> userCharater = new ArrayList<>();

       
        //Clear out all the array;
        userStringX.clear();
        userCharater.clear();
        letterString.clear();
        uniqueWordString.clear();
        uniqueLetterString.clear();
        wordString = null;
        wordNumer = null;
        letterStringMedi = null;
        letterNumber = null;
        
        
        //This part of the code is for debugging
//        System.out.println(wordString[1]);
//        System.out.println(letterString[1]);  
//            for(int i = 0; i < uniqueWordString.size();i++){
//                System.out.println(uniqueWordString.get(i));
//            }
//            for(int i = 0; i < uniqueLetterString.size();i++){
//                System.out.println(uniqueLetterString.get(i));
//            }            
    }
    
    
    public ArrayList getUniqueWord(ArrayList list){
        ArrayList<String> result = list;
        for(int i = 0; i < result.size() - 1; i++){
            for(int j = i + 1; j < result.size(); j++){
                if(result.get(i).equalsIgnoreCase(result.get(j))){
                    result.remove(j);
                    j--;
                }
            }
        }
        return result;
    } 
    // array Hello Hello world
    // array uniy  Hello world
    //  array number 2 1          
    
    public ArrayList getUniqueLetter(ArrayList list){
        //test version 2 Remove the same
        ArrayList<Character> result = list;
        for(int i = 0; i < result.size() - 1; i++){
            for(int j = i + 1; j < result.size(); j++){
                if(result.get(i).equals(result.get(j))){
                    result.remove(j);
                    j--;
                }
            }
        }        
        return result;
    }
    
    //count int the world and letter
    public int[] countWord(String[] word, ArrayList<String> uniqueWord){
        int[]counterList = new int[uniqueWord.size()];
        for(int i = 0; i < uniqueWord.size(); i++){
            int count = 0;
            for(int j = 0; j < word.length; j++){
                if(uniqueWord.get(i).equalsIgnoreCase(word[j])){
                    count++;
                }
                
            }
            counterList[i] = count;
        }
        return counterList;
    }
    
    public int[] countLetter(char[] letter, ArrayList uniqueLetter){
        int[]counterList = new int[uniqueLetter.size()];        
        for(int i = 0; i < uniqueLetter.size(); i++){
            int count = 0;
            for(int j = 0; j < letter.length; j++){
                if(uniqueLetter.get(i).equals(letter[j])){
                    count++;
                }
            }
            
            counterList[i] = count;
        }    
        return counterList;
    }
    
    public void printWord(ArrayList word, int[]number){
        System.out.print("{ ");
        for(int i = 0; i < word.size(); i++){
            System.out.print(word.get(i)+" = "+number[i]+". ");
        }
        System.out.print(" }");
    }
    
    public void printLetter(ArrayList letter, int[]number){
        System.out.print("{ ");
        for(int i = 0; i < letter.size(); i++){
            System.out.print(letter.get(i)+" = "+number[i]+". ");
            
        }
        System.out.print(" }");
    }
    
}
