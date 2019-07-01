package com.stackroute.PE3;

public class Consecutive {
    public String numCheck(String input) {
        String output = null;
        String[] array = input.split(",");
        for (int i = 0; i < array.length - 1; i++) {
            if (Integer.parseInt(array[i + 1]) - Integer.parseInt(array[i]) == 1 || Integer.parseInt(array[i + 1]) - Integer.parseInt(array[i]) == -1) {
                output = "consecutive numbers";
            } else {
                output = "non consecutive numbers";
                break;
            }
        }
        return output;


    }
}
