package com.stackroute.PE3;

public class RemoveVowels {
    public String[] remVow(String str[]) {
        String[] arr = new String[str.length];
        for (int i = 0; i < str.length; i++) {
            char ch;
            ch = str[i].charAt(0);
            if (ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U' || ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                for (int j = 1; j < str[i].length(); j++) {
                    arr[i] = str[i].charAt(0) + str[i].replaceAll("[AEIOUaeiou]", "");
                }
            } else {
                arr[i] = str[i].replaceAll("[AEIOUaeiou]", "");

            }
        }
        return arr;
    }
}

