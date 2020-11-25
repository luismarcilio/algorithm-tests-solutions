package com.luismarcilio.algo.string;

class InvertString {

    String invertString(String string) {
        StringBuilder invertedString = new StringBuilder();

        for (int i = (string.length() - 1); i >= 0; i--) {
            invertedString.append(string.charAt(i));
        }
        return invertedString.toString();
    }

    public static void main(String[] args) {
        InvertString invertString = new InvertString();
        String sampleString = "Hi my name is Luis Marcilio";
        String invertedString = invertString.invertString(sampleString);
        System.out.println(invertedString);
        System.out.println("Complexity: O(n)");

    }
}