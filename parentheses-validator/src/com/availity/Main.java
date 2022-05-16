package com.availity;

public class Main {
    public static void main(String[] args) {
        if(args.length == 0 || args[0].isBlank())
            System.out.println("Invalid input");
        else
            System.out.println(ParenthesesValidator.isValid(args[0]));
    }
}