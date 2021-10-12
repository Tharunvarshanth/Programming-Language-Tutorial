package com.example.singleton;

public class ClipBoard {

    public static ClipBoard instance = null;

    private Object data;

    private ClipBoard(){

    }

    public static ClipBoard getInstance(){
        if (instance == null){
            instance = new ClipBoard();
        }

        return instance;
    }

    public void copy(Object value){
        this.data = value;
    }

    public Object paste(){
        return data;
    }
}
