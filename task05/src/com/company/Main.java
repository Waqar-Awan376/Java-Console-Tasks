package com.company;

public class Main {
    static char [] messageDecoder(String messToDecode,int rotations)
    {
        char temp;
        char [] message=new char[messToDecode.length()];
        for(int i=0;i<messToDecode.length();i++) {
            temp = messToDecode.charAt(i);
            if (!Character.isLetter(temp)) {
                message[i] = temp;
            } else {
                temp = (char) ((int) temp + (rotations%26));
                if (temp > 'z') {
                    temp = (char) ((int) temp - 26);
                    message[i] = temp;
                } else if (temp > 'Z' && temp < 'a') {
                    temp = (char) ((int) temp - 26);
                    message[i] = temp;
                } else {
                    message[i] = temp;
                }
            }
        }
        return message;
    }
    public static void main(String[] args) {
        System.out.println(messageDecoder("abcdefghijklmnopqrstuvwxyz",35));
    }
}
