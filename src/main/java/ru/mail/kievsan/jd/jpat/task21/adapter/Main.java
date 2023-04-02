package ru.mail.kievsan.jd.jpat.task21.adapter;

// JPAT 2. Adapter to Calculator

public class Main {

    public static void main(String[] args) {
        Ints intsCalc = new IntsCalculator();

        System.out.println(intsCalc.mult(2, 2));
        System.out.println(intsCalc.sum(5, 17));
        System.out.println(intsCalc.pow(2, 8));
    }

}
