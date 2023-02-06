package com.jarvis.techlab.pattern.singleton;

public enum ChocolateBoilerSingletonByEnum {
    SINGLETON(false, false);

    ChocolateBoilerSingletonByEnum(boolean empty, boolean boiled) {
        this.empty = empty;
        this.boiled = boiled;
    }

    private boolean empty;

    private boolean boiled;

    public boolean isEmpty() {
        return empty;
    }

    public void setEmpty(boolean empty) {
        this.empty = empty;
    }

    public boolean isBoiled() {
        return boiled;
    }

    public void setBoiled(boolean boiled) {
        this.boiled = boiled;
    }

    @Override
    public String toString() {
        return "ChocolateBoilerSingletonByEnum{" +
                "empty=" + empty +
                ", boiled=" + boiled +
                '}';
    }

    public static ChocolateBoilerSingletonByEnum getInstance() {
        return SINGLETON;
    }

    public static void main(String[] args) {
        ChocolateBoilerSingletonByEnum chocolateBoilerSingleton = ChocolateBoilerSingletonByEnum.getInstance();
        System.out.println(chocolateBoilerSingleton);
    }
}
