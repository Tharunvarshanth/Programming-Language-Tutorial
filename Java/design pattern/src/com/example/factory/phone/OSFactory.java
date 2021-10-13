package com.example.factory.phone;

public class OSFactory {
    public OS getOS(String osName){
        if(osName.equals("android")){
            return new Android();
        }
        else if(osName.equals("ios")){
            return new IOS();
        }

        return null;
    }
}
