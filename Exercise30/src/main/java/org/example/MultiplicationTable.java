package org.example;
/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Jonathan Navarro
 */
public class MultiplicationTable {
    public static void main(String[] args){
        for (int i=1;i<=12;i++){
            for (int j=1;j<=12;j++)
                System.out.print("\t"+i*j);
            System.out.println();
        }
    }
}
