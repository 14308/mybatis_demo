package com.example.demo;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()){
            String string1 = scanner.nextLine();
            String string2 = scanner.nextLine();
            print(string1);
            print(string2);
        }
    }
    public static void print(String string){
        int length1 = string.length();
        int begain = 0;
        while(true){
            if(length1 - 8 > 0){
                System.out.println(string.substring(begain,begain+8));
                begain += 8;
                length1 -= 8;
            }else{
                System.out.print(string.substring(begain,begain+length1));
                for(int i = 0; i< 8-length1; i++){
                    System.out.print(0);
                }
                System.out.println();
                break;
            }
        }
    }
}
