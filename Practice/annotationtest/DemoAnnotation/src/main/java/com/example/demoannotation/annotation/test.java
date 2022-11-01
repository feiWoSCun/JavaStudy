package com.example.demoannotation.annotation;

import java.util.UUID;

public class test {
    public static void main(String[] args) {
        System.out.println(UUID.nameUUIDFromBytes(new Object().toString().getBytes()).toString());
    }
}
