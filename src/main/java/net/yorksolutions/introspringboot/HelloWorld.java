package net.yorksolutions.introspringboot;

public class HelloWorld {
    //TS VERSION
    //name: string;

    String name;

    //TS VERSION
    //num1: number = 1;
    //num2: number = 1.15;


    //int we cant store decimal numbers. int cant store in float
    //double/float can store whole numbers.float can store in int
    int num1 = 1;
    double num2 = 1.15;

    /* command N  we will get directly constructor
    public HelloWorld(String name) {
        this.name = name;
       }
     */


    //ts
    /*
    constructor(){
    //some code
     */
    //java the class constructor has a function name as a class name(HelloWorld)
    public HelloWorld(){

    }


    //TS
    /*
    greet():string{
    return 'hello';
    }
     */

    String greet(){
        return "hello";
    }

}
