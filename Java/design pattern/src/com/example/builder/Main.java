package com.example.builder;

import com.example.builder.phone.Phone;
import com.example.builder.phone.PhoneBuilder;

public class Main {
    public static void main(String[] args) {
        Phone phone = new PhoneBuilder().setOs("MediaTech").setRam(8).getPhone();

        System.out.println(phone);
    }
}
