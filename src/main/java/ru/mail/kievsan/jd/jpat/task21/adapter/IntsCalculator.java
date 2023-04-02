package ru.mail.kievsan.jd.jpat.task21.adapter;

public class IntsCalculator implements Ints {

    protected final Calculator target;

    public IntsCalculator() {
        this.target = new Calculator();
    }


    @Override
    public int sum(int arg0, int arg1) {
        return 0;
    }

    @Override
    public int mult(int arg0, int arg1) {
        return 0;
    }

    @Override
    public int pow(int a, int b) {
        return 0;
    }
}
