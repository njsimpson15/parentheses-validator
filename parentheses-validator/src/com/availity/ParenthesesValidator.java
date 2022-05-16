package com.availity;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.HashMap;

public class ParenthesesValidator {

    public static boolean isValid(String lispCode) {
        HashMap<Character, Character> characterMap = new HashMap<>();
        characterMap.put('(', ')');
        Deque<Character> curCharArray = new ArrayDeque<>();

        for (int i = 0; i < lispCode.length(); i++) {
            char curChar = lispCode.charAt(i);
            if (characterMap.containsKey(curChar)) {
                curCharArray.push(curChar);
            } else if (characterMap.containsValue(curChar)) {
                if (!curCharArray.isEmpty() && characterMap.get(curCharArray.peek()) == curChar) {
                    curCharArray.pop();
                } else return false;
            }
        }
        return curCharArray.isEmpty();
    }
}