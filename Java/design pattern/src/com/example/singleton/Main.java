package com.example.singleton;

public class Main {
    public static void main(String[] args) {
        // write your code here
        ClipBoard clipBoard = ClipBoard.getInstance();
        clipBoard.copy("abcd");
        System.out.println(clipBoard.paste());

        ClipBoard clipBoard11 = ClipBoard.getInstance();
        clipBoard11.copy("xyz");
        System.out.println(clipBoard11.paste());
        System.out.println(clipBoard.paste());

        ClipBoard clipBoard2 = ClipBoard.getInstance();
        clipBoard2.copy("hello");
        System.out.println(clipBoard.paste());
        System.out.println(clipBoard11.paste());
        System.out.println(clipBoard2.paste());
    }
}
