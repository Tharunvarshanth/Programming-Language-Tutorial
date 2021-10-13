package com.example.factory;

import com.example.factory.phone.OS;
import com.example.factory.phone.OSFactory;

public class Main {
    public static void main(String[] args) {

        OSFactory osFactory = new OSFactory();
        OS os = osFactory.getOS("android");
        os.readme();
    }
}
