package net.yorksolutions.introspringboot;

public class Greeter {

    String name;

    public Greeter(String name){
        this.name = name;
    }

    public String greet () { return "Hello," + this.name; }
}
