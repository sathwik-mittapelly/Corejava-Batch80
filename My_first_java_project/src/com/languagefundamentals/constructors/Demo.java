package com.languagefundamentals.constructors;

class Demo {

    Demo(double x) {
        System.out.println("Double constructor");
    }

    Demo(long x) {
        System.out.println("Long constructor");
    }

    public static void main(String[] args) {
        new Demo(10);
    }
}
