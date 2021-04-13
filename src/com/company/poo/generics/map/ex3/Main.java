package com.company.poo.generics.map.ex3;

import com.company.poo.generics.map.ex3.entities.Candidate;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        Map <String , Integer> candidates = new LinkedHashMap<>();

        System.out.print("Enter file full path: ");
        String path = input.nextLine();

        try(BufferedReader br = new BufferedReader(new FileReader(path))){
            String line = br.readLine();
            while(line != null){
                String[] split = line.split(";");

                Candidate candidate = new Candidate(split[0], Integer.parseInt(split[1]));

                if(!candidates.containsKey(candidate.getName())){
                    candidates.put(candidate.getName(), candidate.getVotes());
                }
                else{
                    candidates.put(candidate.getName(), candidates.get(candidate.getName()) + candidate.getVotes());
                }
                line = br.readLine();
                }

            for(String c : candidates.keySet()){
                System.out.println("Candidate: " + c + ", Votes: " + candidates.get(c));

            }

            } catch (IOException e) {
            e.printStackTrace();
        }
        finally {
            input.close();
        }

    }
}
